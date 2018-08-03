package htjs.controller;


import htjs.entity.Product;
import htjs.mapper.ProductMapper;
import htjs.redis.RedisCache;
import htjs.tools.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductMapper productMapper;

    @Autowired
    private RedisCache redisCache;

    @Autowired
    private RedisTemplate redisTemplate;


    @GetMapping("getAll")
    public ModelAndView getAll(Map paramMap){
        ModelAndView mv = new ModelAndView("hello_index");
        List<Product> userList=  productMapper.getAll(paramMap);

        redisTemplate.opsForValue().set("name","wyq");
        System.out.println(redisTemplate.opsForValue().get("name"));

        mv.addObject("userList", Tools.list2str(userList));
        return mv;
    }

    @GetMapping("update")
    public ModelAndView update(Map paramMap){
        ModelAndView mv = new ModelAndView("hello_index");
        Map p = new HashMap();
        p.put("id",1);
        p.put("name","wwwww");
        p.put("price",44.0);
        Product product = new Product();
        product.setId(1);
        product.setName("qqqq");
        product.setPrice(55.0);
        int result =  productMapper.update(product);
        mv.addObject("userList", result);
        return mv;
    }

}
