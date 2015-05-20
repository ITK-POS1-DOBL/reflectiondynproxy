/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.reflectiondynproxy.bean;

import org.doblander.reflectiondynproxy.service.SomeService;

/**
 *
 * @author intruder
 */
public class SomeServiceBean implements SomeService {

    @Override
    public String sayHello() {
        System.out.println("Hello from the Service Implementation!");
        return "Hello from Service Implementation without errors!";
    }
    
}
