package htjs.controller;


import htjs.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Value("${character}")
    private String character;
    @Value("${age}")
    private Integer age;
    @Value("${content}")
    private String content;

    @Autowired
    private Student student;

    @RequestMapping(value = "/")
    public String boot() {
//        return "Hello World!" + "性格：" + character + " 年龄：" + age + " 详细信息为：" + content;
        return "";
    }


    @GetMapping("/hello")
    public String hello(){
        return "/hello.html";
    }

    @RequestMapping("/a_index")
    public String a_index(){
        return "a/a_index";
    }

}
