package htjs.controller;


import htjs.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TemplatesController {

    @GetMapping("/templates")
    String test(HttpServletRequest request) {
        //逻辑处理
        request.setAttribute("key", "hello world");
        return "/hello";
    }

    @GetMapping("/templates1")
    String test1(HttpServletRequest request) {
        //逻辑处理
        request.setAttribute("key", "111111");
        return "/a/a_index";
    }

}
