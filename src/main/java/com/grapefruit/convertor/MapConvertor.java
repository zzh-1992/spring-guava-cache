package com.grapefruit.convertor;

import com.google.common.collect.HashBasedTable;
import com.grapefruit.Table.LocalCache;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component("MapConvertor")
@Setter
public class MapConvertor implements Convertor{
    /**
     * 设置缓存
     *
     * @param key
     * @param obj
     */
    @Override
    public void setCache(String key, Object obj,LocalCache localCache) {
        HashBasedTable<String, String, Map<String, Object>> mapTable = localCache.getMapTable();
        mapTable.put(key,key,(Map)obj);

        mapTable.isEmpty();
        mapTable.remove("","");
    }
}
