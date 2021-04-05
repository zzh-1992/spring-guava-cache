package com.grapefruit.dao;

import com.grapefruit.annotation.Cache;
import com.grapefruit.annotation.Mark;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Service
@Cache
public class MapDao {

    @Mark(key = "MapConvertor",value = "1")
    public Map<String,Object> getObj(){
        Map<String,Object> map = new HashMap<>();
        map.put("1",11111);
        map.put("2",22222);
        map.put("3",33333);
        return map;
    }
}
