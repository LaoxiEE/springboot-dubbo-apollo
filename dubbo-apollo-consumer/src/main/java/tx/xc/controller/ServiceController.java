package tx.xc.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tx.xc.pojo.User;
import tx.xc.service.ServiceInterance;

@Slf4j
@RestController
@RequestMapping("/")
public class ServiceController {

    @Reference
    ServiceInterance serviceInterance;

    @GetMapping("hello")
    public String sayHello(String str){
        return serviceInterance.sayHello(str);
    }

    @GetMapping("user")
    public User getUser(){
        return serviceInterance.getUser();
    }

}
