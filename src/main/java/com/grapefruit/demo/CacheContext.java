package com.grapefruit.demo;

import com.grapefruit.Table.LocalCache;
import com.grapefruit.annotation.Cache;
import com.grapefruit.annotation.Mark;
import com.grapefruit.convertor.Convertor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component
@Setter
@Getter
public class CacheContext implements ApplicationContextAware {

    private ApplicationContext context;

    @Autowired
    private LocalCache localCache;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        A bean = applicationContext.getBean(A.class);
        context = applicationContext;
        //localCache = new LocalCache();

        initTable();
    }

    public ApplicationContext getContext(){
        return context;
    }


    public void initTable(){
        Map<String, Object> map = context.getBeansWithAnnotation(Cache.class);

        map.forEach((key, value) -> {
            System.out.println("key:" + key);
            Object bean = context.getBean(key);
            Method[] methods = bean.getClass().getDeclaredMethods();
            for (Method method : methods) {
                if(method.isAnnotationPresent(Mark.class)){
                    Mark annotation = method.getAnnotation(Mark.class);
                    String annotationKey = annotation.key();
                    String annotationValue = annotation.value();
                    if(method.getParameters().length >0){
                        System.out.println("方法需要参数,转换失败!!!!!");
                        continue;
                    }
                    try {
                        Object result = method.invoke(bean);
                        // 获取转换器
                        Convertor convertor = (Convertor)context.getBean(annotationKey);
                        // 设置缓存
                        convertor.setCache(annotationKey,result,localCache);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("value:" + value);
        });
    }
}
