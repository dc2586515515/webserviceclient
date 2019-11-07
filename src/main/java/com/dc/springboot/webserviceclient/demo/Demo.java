package com.dc.springboot.webserviceclient.demo;

import com.dc.springboot.webserviceclient.service.DemoService;
import com.dc.springboot.webserviceclient.service.DemoService_Service;

/**
 * @Description
 * @Author DC
 * @Date 2019-11-01
 */
public class Demo {
    public static void main(String[] args) {
        DemoService_Service demoService_service = new DemoService_Service();
        DemoService demoService = demoService_service.getDemoServiceImplPort();
        String a = demoService.sayHello("James");
        System.out.println(a);
    }
}
