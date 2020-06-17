package com.shoufeng.mvc.demo.controller;

import com.shoufeng.mvc.core.annotation.SFAutowired;
import com.shoufeng.mvc.core.annotation.SFController;
import com.shoufeng.mvc.core.annotation.SFRequestMapping;
import com.shoufeng.mvc.core.annotation.SFRequestParam;
import com.shoufeng.mvc.demo.service.DemoService;

@SFController
@SFRequestMapping("/demo")
public class DemoController {

    @SFAutowired
    private DemoService demoService;

    @SFRequestMapping("/add")
    public Integer add(@SFRequestParam("a") Integer a, @SFRequestParam("b") Integer b) {
        return demoService.add(a, b);
    }
}
