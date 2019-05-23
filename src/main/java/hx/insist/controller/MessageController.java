package hx.insist.controller;

import com.github.pagehelper.PageInfo;
import hx.insist.pojo.Message;
import hx.insist.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/add")
    public String test(Message message,String name, String email, String content){
        System.out.println("testController中:");
        System.out.println(name);
        System.out.println(email);
        System.out.println(content);

        message.setMesspic("00.jpg");
        System.out.println(message);

        messageService.addMessage(message);
        return "/message/messages";
    }

    @RequestMapping("/messages")//pageNum表时当前页
    public String message(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                          @RequestParam(required = false, defaultValue = "6") Integer PageSize,
                          HttpSession session){
        System.out.println("message分页controller:message...");
        try{
            PageInfo pageInfo = messageService.getAllMessage(pageNum,PageSize);
            session.setAttribute("pageInfo",pageInfo);
        }catch (Exception e){
            System.out.println("controller中的message异常信息:");
            e.printStackTrace();
        }

        if(session.getAttribute("admin")!=null){//管理员
            return "/WEB-INF/jsp/xmessinfo.jsp";//列表页面
        }else{
            return "/message.jsp";
        }
    }

    @RequestMapping("/messages/{pageNum}")//pageNum表时当前页
    public String messages(@PathVariable("pageNum")Integer pageNum,
                           /* @RequestParam(required = false, defaultValue = "1") Integer pageNum,*/
                           @RequestParam(required = false, defaultValue = "6") Integer PageSize,
                           HttpSession session){
        System.out.println("message分页controller:messagesssss...");
        try{
            PageInfo pageInfo = messageService.getAllMessage(pageNum,PageSize);
            session.setAttribute("pageInfo",pageInfo);
        }catch (Exception e){
            System.out.println("controller中的message异常信息:");
            e.printStackTrace();
        }

        if(session.getAttribute("admin")!=null){//管理员
            return "/WEB-INF/jsp/xmessinfo.jsp";//列表页面
        }else{
            return "/message.jsp";
        }
    }

}
