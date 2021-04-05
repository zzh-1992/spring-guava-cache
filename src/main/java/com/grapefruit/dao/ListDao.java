package com.grapefruit.dao;

import com.grapefruit.annotation.Cache;
import com.grapefruit.annotation.Mark;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Service
@Cache
public class ListDao {
    @Mark(key = "ListConvertor",value = "2")
    public List<Object> getObj(){
        return Arrays.asList(1,"2",true,0.01,10L);
    }
}
