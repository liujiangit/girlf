package com.imooc;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import javax.xml.bind.ValidationEvent;
import java.util.List;

/**
 * Created by pactera on 2017/10/15.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    /**
     * 查询所有女生的列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     *
     * @return
     */
    @GetMapping(value = "/girls1")
    public  Girl girlAdd(){
        Girl girl = new Girl();
        girl.setCupSize("g");
        girl.setAge(33);
        return girlRepository.save(girl);
    }
    //查询一个女生
   /* @GetMapping(value = "/girls/{id}")
    public Girl findGirl(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }*/
    //更新

    //删除
    @DeleteMapping(value = "/girls/id/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }
    //通过年龄查询女生的列表
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @GetMapping(value = "/girls/two")
    public void girlTwo(){
        System.out.println("已经修改了");
        girlService.insertTwo();
    }

}
