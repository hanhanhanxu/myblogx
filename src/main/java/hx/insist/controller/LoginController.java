package hx.insist.controller;

import hx.insist.pojo.Admin;
import hx.insist.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.text.SimpleDateFormat;
import java.util.Date;

import static hx.insist.utils.WebUtil.VisitURL;
import static hx.insist.utils.WebUtil.getIp;

//登录
@Controller
@RequestMapping("/backstage")//backstage代表是后端有关controller
public class LoginController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        @RequestParam("checkcode") String checkcode,
                        HttpServletRequest request,
                        HttpSession session){



        //做一些记录.
        System.err.println("************************有用户尝试登录***************************");
        System.out.println("访问者所展示的ip:"+request.getRemoteAddr());
        System.out.println("访问者真实ip:"+getIp(request));
        String url2 = "http://time.tianqi.com";  //北京时间
        System.out.println("北京时间:"+VisitURL(url2));

        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //设置日期格式
        System.out.println("本地系统时间:"+df.format(day));

        System.out.println("username:"+username+",password:"+password);

        //取得验证码
        String checkcode2 = (String) session.getAttribute("checkcode2");
        System.err.println("正确验证码为:"+checkcode2);
        request.getServletContext().removeAttribute("checkcode2");//清理空间.

        Admin admin = new Admin(username,password,checkcode);//form表单提交过来是明文.
        System.err.println("开始验证");
        if(admin.Verification(checkcode2)==true){//验证1通过
            if(admin.Verificationhx()==true){//验证2通过
                Admin loginResultAdmin = adminService.login(admin);
                if(loginResultAdmin==null){//去数据库里校验 发现账号或密码不正确
                    //账号或密码错误.
                    admin.getErrors().put("username","账号或密码错误");
                    System.err.println("访问者提供的账户经过数据库中校验...访问者本次尝试登录失败,已结束...");
                    session.setAttribute("errors",admin.getErrors());
                    System.err.println("---------------------------本次记录已结束---------------------------");
                    return "redirect:/xlogin.jsp";
                }else{
                    session.setAttribute("admin",loginResultAdmin);
                    System.err.println("=====登录成功=====");
                    System.err.println("---------------------------本次记录已结束---------------------------");
                    return "redirect:/admin/xmenu";
                    //return "redirect:/xlist.jsp";// 斜杠表示项目级别下开始找xlist.jsp
                }
            }else{//验证2不通过
                //经过  Verificationhx 校验 发现是比较直白的密码不正确. controller层直接返回密码不正确
                session.setAttribute("errors",admin.getErrors());
                System.err.println("访问者本次尝试登录失败,已结束..");
                System.out.println("错误信息:"+admin.getErrors());
                System.err.println("---------------------------本次记录已结束---------------------------");
                return "redirect:/xlogin.jsp";
            }
        }else{//验证1不通过
            //经过 Verification 校验 发现是为空项 或 不符合数字字母组合 验证码错误 等. controller层直接返回密码不正确
            session.setAttribute("errors",admin.getErrors());
            System.err.println("访问者本次尝试登录失败,已结束.");
            System.out.println("错误信息:"+admin.getErrors());
            System.err.println("---------------------------本次记录已结束---------------------------");
            return "redirect:/xlogin.jsp";
        }
    }

}