package com.grapefruit.convertor;

import com.grapefruit.Table.LocalCache;
import lombok.Setter;
import org.springframework.stereotype.Component;


/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component("ObjConvertor")
@Setter
public class ObjConvertor implements Convertor{
    /**
     * 设置缓存
     *
     * @param key
     * @param obj
     */
    @Override
    public void setCache(String key, Object obj,LocalCache localCache) {
        localCache.getObjTable().put(key,key,obj);
    }
}
