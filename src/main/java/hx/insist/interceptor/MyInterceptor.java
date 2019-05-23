package hx.insist.interceptor;


import hx.insist.pojo.Admin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        HttpSession session = request.getSession();
        String Uri = request.getRequestURI();
        //记录以下每次访问的地址
        System.out.println(Uri);

        if(Uri.indexOf("/admin")>0){//如果是访问后台的话
            if(Uri.indexOf("/login")>0){//如果是访问登录的话，就不拦截
                return true;
            }else{//如果是访问其他的话.就拦截
                if(session.getAttribute("admin")==null){//如果拦截后发现session里的admin为空
                    response.sendRedirect(request.getContextPath()+"/");
                    return false;//不放行
                }else{//不为空
                    Admin a = (Admin) session.getAttribute("admin");//查看下是不是数据库中的admin（密文）
                    if("Vyizjm4H1iTYIxG8cxbTjQ==".equals(a.getAusername()) && "NYPhfkR7RVLBJG68dIlfEQ==".equals(a.getApassword())){//这个账户信息对
                        return true;
                    }else{//有admin但是账户信息不对
                        response.sendRedirect(request.getContextPath()+"/");
                        return false;
                    }
                }
            }
        }else {//不是访问后台
            return true;//访问前台，直接通过
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
