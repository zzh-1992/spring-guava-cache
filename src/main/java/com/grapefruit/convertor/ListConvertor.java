package com.grapefruit.convertor;

import com.grapefruit.Table.LocalCache;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component("ListConvertor")
@Setter
public class ListConvertor implements Convertor{
    /**
     * 设置缓存
     *
     * @param key
     * @param obj
     */
    @Override
    public void setCache(String key, Object obj,LocalCache localCache) {
        localCache.getListTable().put(key,key,(List)obj);
    }
}
