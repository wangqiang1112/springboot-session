package htjs.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/session")
public class SessionController {

    @RequestMapping(value="/getSessionId")
    @ResponseBody
    public String getSessionId(HttpServletRequest request){

        Object o = request.getSession().getAttribute("mysession");
        if(o == null){
            o = "spring boot 有端口"+request.getLocalPort()+"生成";
            request.getSession().setAttribute("mysession", o);
        }else{
            o = "redis缓存已经在端口"+request.getLocalPort()+"存在======="+request.getSession().getId();
        }

        return "端口=" + request.getLocalPort() +  " sessionId=" + request.getSession().getId() +"<br/>"+o;
    }

}
