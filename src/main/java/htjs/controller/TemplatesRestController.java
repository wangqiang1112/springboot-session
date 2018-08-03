package htjs.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TemplatesRestController {

    @GetMapping("/restTemplates")
    ModelAndView test() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("key", "bbbbbbbbbb");
        return mv;
    }

    @GetMapping("/restTemplates1")
    ModelAndView test1() {
        ModelAndView mv = new ModelAndView("/a/a_index");
        mv.addObject("key", "ccccccc");
        return mv;
    }

}
