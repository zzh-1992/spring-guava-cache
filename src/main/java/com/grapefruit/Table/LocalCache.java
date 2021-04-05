package com.grapefruit.Table;

import com.google.common.collect.HashBasedTable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component
@Setter
@Getter
public class LocalCache {
    private HashBasedTable<String, String, Object> objTable;
    private HashBasedTable<String, String, List<?>> listTable;
    private HashBasedTable<String, String, Map<String,Object>> mapTable;

    @PostConstruct
    public void init(){
        objTable = HashBasedTable.create();
        listTable = HashBasedTable.create();
        mapTable = HashBasedTable.create();
    }
}
