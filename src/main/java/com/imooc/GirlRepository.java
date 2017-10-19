package com.imooc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by pactera on 2017/10/15.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
    //通过年龄来查询信息
    List<Girl> findByAge(Integer age);
}
