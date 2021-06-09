package tx.xc.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import tx.xc.pojo.User;
import tx.xc.service.ServiceInterance;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ServiceImpl implements ServiceInterance {

    @Value("${dubbo.application.name}")
    String str1;

    @Override
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("dubbo");
        user.setAge(2);
        user.setPwd("apollo");
        user.setSex("male");
        return user;
    }

    @Override
    public String sayHello(String str){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return simpleDateFormat.format(new Date()) + str + str1;
    }

}