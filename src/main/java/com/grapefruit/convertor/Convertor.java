package com.grapefruit.convertor;

import com.grapefruit.Table.LocalCache;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
public interface Convertor {
    /**
     * 设置缓存
     */
    void setCache(String key, Object obj,LocalCache localCache);
}
