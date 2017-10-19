package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pactera on 2017/10/15.
 */
@Controller
@ResponseBody
@RequestMapping("/boy")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
    //不显示的话两种请求方式都可以
    //@RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    @GetMapping("/hello")
    public  String say(@RequestParam(value = "id") Integer id){
        return "id"+id;
    }
}
