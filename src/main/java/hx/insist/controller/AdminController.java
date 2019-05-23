package hx.insist.controller;

import hx.insist.pojo.Work;
import hx.insist.pojo.Workinfo;
import hx.insist.service.MessageService;
import hx.insist.service.WorkInfoService;
import hx.insist.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import sun.dc.pr.PRError;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private WorkService workService;
    @Autowired
    private WorkInfoService workInfoService;
    @Autowired
    private MessageService messageService;

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("admin");
        return "redirect:/index.jsp";
    }

    //********************************跳转页面********************************

    @RequestMapping("/xmenu")
    public String xmenu(){
        return "/WEB-INF/jsp/xmenu.jsp";
    }
    @RequestMapping("/xworkinfo")
    public String xworkinfo(){
        return "/work/works";
    }
    @RequestMapping("/xmessinfo")
    public String xmessinfo(){
        return "/message/messages";
    }



    //********************************管理work帖子********************************

    //进入新增帖子页面
    @RequestMapping("addwork")
    public String addwork(){
        return "/WEB-INF/jsp/xpostedit.jsp";//转发
    }

    @RequestMapping("addwork2")
    public String addwork2(){
        return "/WEB-INF/jsp/xpostedit2.jsp";//转发
    }

    //添加帖子
    @RequestMapping("/publish")//@RequestParam("preimg") MultipartFile preimg,  这两个要一样  真搞笑...
    public String Publish(@RequestParam("preimg") MultipartFile preimg,
                          HttpSession session, HttpServletRequest request,
                          String title, String intro,
                          @RequestParam String editorValue) {
        //输出信息
        //System.out.println("title:"+title);
        //System.out.println("intro:"+intro);
        //System.out.println("editorValue:"+editorValue);

        //检验图片是否为空
        if(preimg.isEmpty()){
            request.setAttribute("error","图片为空...");
            return "forward:/error.jsp";
        }

        //获取封面图片
        //1. 获取图片完整名称
        String fileStr = preimg.getOriginalFilename();
        //System.out.println("封面图片原始名称:"+fileStr);
        //2. 使用随机生成的字符串+源图片扩展名组成新的图片名称,防止图片重名
        String newfileName = UUID.randomUUID().toString() + fileStr.substring(fileStr.lastIndexOf("."));
        //System.out.println("封面图片新名称:"+newfileName);

        String filepath = request.getServletContext().getRealPath("/coverimg");//设置保存的路径
        //System.out.println("封面图片的保存路径为:"+filepath);

        //至关重要，必须有。 确认保存路径存在
        File file = new File(filepath);
        if (!file.exists()) {
            file.mkdirs();
        }

        String savepath = filepath+"\\"+newfileName;
        System.out.println("封面图片储存完整路径:"+savepath);


        //4.将work基本内容(标题，简介，封面图片的名称)保存到数据库
        workService.addwork(new Work(title,intro,newfileName));
        //System.out.println("表work插入数据成功...");

        //通过图片名称唯一这个特性把id查出来
        Integer id = workService.getIdByimg(newfileName);

        if(!StringUtils.isEmpty(editorValue)){
            try{
                //封装workinfo
                Workinfo workinfo = new Workinfo(id,editorValue);
                //向数据库中添加数据
                workInfoService.addWorkInfo(workinfo);
                //System.out.println("表workinfo数据插入成功...");
                session.setAttribute("content",editorValue);

                //3. 将图片保存到服务器端myblogx/coverimg文件夹下
                preimg.transferTo(new File(savepath));
                //System.out.println("图片保存成功...此条帖子所有内容已保存完毕");
                return "redirect:/work/works";
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("插入workinfo数据 或 将图片保存到服务器端myblogx/coverimg文件夹时transferTo方法出错...");
                //抛异常就删除work中刚插入的记录
                workService.deletework(id);//级联删除。
            }
        }
        request.setAttribute("error","editorValue为空值...");
        return "redirect:/error.jsp";
    }


    @RequestMapping("/publish2")
    public String publish2(HttpServletRequest request){
        String parameter = request.getParameter("my-editormd-html-code");
        System.out.println("md: " + parameter);
        return "";
    }


    //删除work
    @RequestMapping("/deletework/{wid}")
    public String deletework(@PathVariable("wid") String wid){
        int id = Integer.parseInt(wid);
        workService.deletework(id);
        return "/work/works";
    }

    //********************************管理message留言********************************

    //删除留言
    @RequestMapping("/deletemessage/{mid}")
    public String deletemessage(@PathVariable("mid") String mid){
        messageService.delMessage(mid);
        return "/message/messages";
    }

}
