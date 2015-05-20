/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.reflectiondynproxy.main;

import java.lang.reflect.Proxy;
import org.doblander.reflectiondynproxy.bean.SomeServiceBean;
import org.doblander.reflectiondynproxy.proxy.LogExecTimeHandler;
import org.doblander.reflectiondynproxy.service.SomeService;

/**
 *
 * @author intruder
 */
public class DynProxyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SomeService service = new SomeServiceBean();
        
        SomeService timeProxy = (SomeService) Proxy.newProxyInstance(
                SomeService.class.getClassLoader(), 
                service.getClass().getInterfaces(), 
                new LogExecTimeHandler(service));
        
        System.out.println(timeProxy.sayHello());
    }
    
}
