package com.grapefruit.demo;

import org.springframework.context.annotation.Bean;

/**
 * 配置类 == 配置文件 告诉spring这是一个配置类
 */
/*@Configuration

@PropertySource("classpath:app.properties")
@ComponentScan(basePackages = "com.grapefruit.demo",
        useDefaultFilters = false,
        includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Component.class)

})*/

/**
 * @ComponentScan value 指定扫描的包
 * excludeFilters = Filter[] 指定扫描的时候按照什么规则排除哪些组件
 * includeFilter = Filter[] 指定扫描的时候只需要包含哪些组件
 */

public class MyConfig {

/*    @Autowired
    Environment env;

    @Autowired
    ApplicationContext context;*/

    @Bean(initMethod = "init")
    public Grapefruit getGrapefruit(){
        //String host = env.getProperty("host");
        return new Grapefruit();

        /// Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk
    }

    /**
     * 给容器注册一个bean 类型为返回值类型 id默认是方法名作为id
     */
    @Bean
    public Yellow getYellow(){
        return new Yellow();
    }
}
