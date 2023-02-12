package com.tuling.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock")
public class StockController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("reduct")
    public String reduct(){
        return "减少库存" + port;
    }
}
