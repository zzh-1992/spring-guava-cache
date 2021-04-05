package com.grapefruit.dao;

import com.grapefruit.annotation.Cache;
import com.grapefruit.annotation.Mark;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Service
@Cache
public class ObjectDao {
    @Mark(key = "ObjConvertor",value = "0")
    public Object getObj(){
        return LocalDateTime.now();
    }

    public void doSome(){
        System.out.println("0000");
    }

    public void doOther(){
        System.out.println("11111");
    }
}
