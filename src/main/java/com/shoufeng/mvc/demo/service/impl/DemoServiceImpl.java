package com.shoufeng.mvc.demo.service.impl;

import com.shoufeng.mvc.core.annotation.SFService;
import com.shoufeng.mvc.demo.service.DemoService;

/**
 * @author shoufeng
 */
@SFService
public class DemoServiceImpl implements DemoService {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
