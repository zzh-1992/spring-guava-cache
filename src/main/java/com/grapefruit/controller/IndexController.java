package com.grapefruit.controller;

import com.grapefruit.Table.LocalCache;
import com.grapefruit.demo.CacheContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@RequestMapping("/")
public class IndexController {
/*    @Autowired
    private LocalCache localCache;

    @Autowired
    private CacheContext cacheContext;*/

    @GetMapping("/")
    public String index(){
        return LocalDateTime.now().toString();
    }
}
