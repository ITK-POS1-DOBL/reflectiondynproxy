/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.reflectiondynproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.doblander.reflectiondynproxy.service.SomeService;

/**
 *
 * @author intruder
 */
public class LogExecTimeHandler implements InvocationHandler {

    private SomeService service = null;
    
    public LogExecTimeHandler(SomeService serviceInstance) {
        this.service = serviceInstance;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Hello from the proxy handler method!");
        return "Not yet delegating to original service implementation!";
    }
    
}
