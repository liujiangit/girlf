package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by pactera on 2017/10/15.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public void insertTwo(){
        Girl girl = new Girl();
        girl.setCupSize("v");
        girl.setAge(12);
        girlRepository.save(girl);

        Girl girl2 = new Girl();
        girl2.setCupSize("BBBB");
        girl2.setAge(12);
        girlRepository.save(girl2);

    }
}
