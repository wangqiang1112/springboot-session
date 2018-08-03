package htjs.controller;

import javax.annotation.Resource;

import htjs.entity.User;
import htjs.service.impl.UserService;
import htjs.tools.Tools;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * 在定义一个Rest接口时，我们通常会使用GET，POST，PUT，DELETE几种方式来完成我们所需要进行CRUD的一些操作，
 * 我们在这里罗列和教大家在实际开发中的使用，一些基本概念我们就不再赘述，例如使用POST的优缺点，可使用参数的大小限制等地：

    GET：一般用于查询数据，不办函数据的更新以及插入操作。由于明文传输的关系，我们一般用来获取一些无关用户的信息。

    POST：一般用于数据的插入操作，也是使用最多的传输方式，但是在H5调用时会有跨域的问题，一般使用JSONP来解决。

    PUT：我们使用PUT方式来对数据进行更新操作。

    DELETE：用于数据删除，注意在数据库内是逻辑删除（改变数据状态，用户不再查询得到，但还保留在数据库内）还是物理删除（真删了）。





 @RestController注解，相当于@Controller+@ResponseBody两个注解的结合，
 返回json数据不需要在方法前面加@ResponseBody注解了，
 但使用@RestController这个注解，就不能返回jsp,html页面，
 视图解析器无法解析jsp,html页面

 如果需要返回数据到jsp或者html页面，则使用@Controller注解。
 这里推荐使用@Controller注解，因为需要直接返回数据的时候可以增加@ResponseBody注解

 @ComponentScan({"smm.springboot_ftl.service"})
 @MapperScan("smm.springboot_ftl.mapper")


 这三个注解都不能少！！！ 少了SpringBoot就无法正常启动了！！
 */
@Controller
@ComponentScan({"htjs.service"})
@MapperScan("htjs.mapper")
public class UserController {
	
	@Resource
	private UserService userService;
	
	 @RequestMapping("/say")  
     public String say(){  
         return "springboot-a"+userService;
     }  
	
	@RequestMapping("/query")
	public ModelAndView query(Map mapParam){
		ModelAndView mv = new ModelAndView("hello_index");
		List<User> userList=  userService.query(mapParam);
		mv.addObject("userList", Tools.list2str(userList));
		return mv;
	}

	@RequestMapping("/findById")
	public String findById(){
		User user =  userService.find(18);
		ModelAndView mav = new ModelAndView();
		mav.addObject("user","sadf");
		return "HelloWord"+"fasdf--"+user.getUsername()+"--"+user.getPassword();
	}
	
	
	@RequestMapping("/ajax")
	public String ajax(){
		return "[''message':'123dfx']";
	}


}
