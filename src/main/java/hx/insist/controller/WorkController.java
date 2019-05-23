package hx.insist.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import hx.insist.pojo.Work;
import hx.insist.pojo.Workinfo;
import hx.insist.service.WorkInfoService;
import hx.insist.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/work")//reception代表是前端有关controller
public class WorkController {

    @Autowired
    private WorkService workService;
    @Autowired
    private WorkInfoService workInfoService;

    //此方法用来进入网站首页时，先进入次方法，去数据库加载帖子信息。
    @RequestMapping("/index")
    public String load(HttpSession session){
        System.out.println("加载首页indexworks...");
        List list = workService.get6Work();
        session.setAttribute("indexworks",list);
        return "/menu.jsp";//转发到/menu.jsp  这样路径还是index.jsp
        //而且由于是转发的所以根路径是http://localhost:8080/reception/index
        //这样刷新时就会再执行一边这个，所以就能实现刷新页面时从数据库中加载东西了。
    }

    //此方法用来点击某条具体帖子时，进入该方法，加载帖子具体内容，然后重定向到帖子信息显示页面info.jsp
    @RequestMapping("/detailed/{id}")
    public String detailed(@PathVariable("id") Integer wid, HttpServletRequest request, HttpSession session){
        System.out.println("进入controller的detailed方法...");

       /* swid = swid.substring(1,swid.length()-1);
        System.out.println("swid:"+swid);

        int wid = Integer.parseInt(swid);*/
        System.out.println("开始加载work...");
        Work work = workService.getWorkByWid(wid);
        request.setAttribute("work",work);
        System.out.println(work);
        System.out.println("开始加载workinfo...");
        Workinfo workinfo = workInfoService.getWorkinfoByWid(wid);
        request.setAttribute("workinfo",workinfo);

        return "/info.jsp";//转发   /开头 绝对路径 从项目路径开始找
    }


    //第一次进来works
    //@ResponseBody 测试时可以用这个注解来查看json字符串信息
    @RequestMapping("/works")//getAllUser    pageNum当前页   PageSize页的大小
    public String works(//@PathVariable("id") Integer pageNum,
                             @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                             @RequestParam(required = false, defaultValue = "6") Integer PageSize,
                             HttpServletRequest request,
                             HttpSession session) {
        System.out.println("分页controller:getAllUser...");
        try{
            PageInfo pageInfo = workService.getAllWork(pageNum,PageSize);
            request.setAttribute("pageInfo",pageInfo);
        }catch (Exception e){
            System.out.println("controller中的works异常信息:");
            e.printStackTrace();
        }
        if(session.getAttribute("admin")!=null){//管理员
            return "/WEB-INF/jsp/xworkinfo.jsp";//列表页面
        }else{
            return "/full.jsp";//前台
        }
    }

    //分页进来
    //@ResponseBody 测试时可以用这个注解来查看json字符串信息
    @RequestMapping("/works/{pageNum}")//getAllUser    pageNum当前页   PageSize页的大小
    public String getAllUser(@PathVariable("pageNum") Integer pageNum,
                                 //@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                 @RequestParam(required = false, defaultValue = "6") Integer PageSize,
                             HttpServletRequest request,
                             HttpSession session) {
        System.out.println("分页controller:getAllUser...");

        try{
            PageInfo pageInfo = workService.getAllWork(pageNum,PageSize);
            request.setAttribute("pageInfo",pageInfo);
        }catch (Exception e){
            System.out.println("controller中的works异常信息:");
            e.printStackTrace();
        }
        if(session.getAttribute("admin")!=null){//管理员
            return "/WEB-INF/jsp/xworkinfo.jsp";//列表页面
        }else{
            return "/full.jsp";//前台
        }
    }

}
