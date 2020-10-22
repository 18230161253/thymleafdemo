package com.offcn.thymleaf.controller;

import com.offcn.thymleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class MyController {
    @RequestMapping("index")
    public String index(Model model){
        String message="hello thymeleaf";
        model.addAttribute("message",message);
        System.out.println("halou----------");
        return "index";
    }
    @RequestMapping("User")
    public String getUser(Model model){
        User user=new User(1,"lucy",18);
        model.addAttribute("user",user);
        Map<String,Object> map=new HashMap<>();
        map.put("src1","0.jpg");
        map.put("src2","01.jpg");
        map.put("src3","23.jpg");
        model.addAttribute("src",map);
        return "index";
    }
    @RequestMapping("user")
    public String getUserList(Model model){
        List<User> list=new ArrayList<>();
        list.add(new User(1,"jeck",18));
        list.add(new User(2,"jeck2",118));
        list.add(new User(3,"jeck3",128));
        list.add(new User(4,"jeck4",138));
        list.add(new User(5,"jeck5",148));
        model.addAttribute("list",list);
        return "index2";
    }
    @RequestMapping("index3")
    public String index3(Model model){
      model.addAttribute("username","kkk");
      model.addAttribute("href","http://baidu.com");
      return "index3";
    }
    @RequestMapping("index4")
    public String index4(Model model){
        model.addAttribute("result","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manage","manage");
        return "index4";
    }
    @RequestMapping("index5")
    public String index5(){
        System.out.println("引入样式");
        return "index5";
    }
    @RequestMapping("index6")
    public String index6(Model model){
        Date date=new Date();
        model.addAttribute("date",date);
        //数字格式化
        model.addAttribute("num",11.222);
        //字符串
        String str="2020-10-22 11:48:34.941  INFO 8704 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1366 ms\n" +
                "2020-10-22 11:48:35.172  INFO 8704 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'\n" +
                "2020-10-22 11:48:35.258  INFO 8704 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index\n" +
                "2020-10-22 11:48:35.415  INFO 8704 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''\n" +
                "2020-10-22 11:48:35.426  INFO 8704 --- [           main] com.offcn.thymleaf.ThymleafApplication   : Started ThymleafApplication in 2.704 seconds (JVM running for 4.13)\n" +
                "2020-10-22 11:48:44.081  INFO 8704 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'\n" +
                "2020-10-22 11:48:44.081  INFO 8704 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet  ";
        model.addAttribute("string",str);
        //字符串的截取
        String str2="javaoffcnn099090099009900909090909";
        model.addAttribute("string2",str2);
        return "index6";
    }
}
