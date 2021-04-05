/*
package com.grapefruit.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

*/
/**
 * @author 柚子苦瓜茶
 * @version 1.0
 *//*

public class MyWebApplication implements WebApplicationInitializer {
    */
/**
     * Configure the given {@link ServletContext} with any servlets, filters, listeners
     * context-params and attributes necessary for initializing this web application. See
     * examples {@linkplain WebApplicationInitializer above}.
     *
     * @param servletContext the {@code ServletContext} to initialize
     * @throws ServletException if any call against the given {@code ServletContext}
     *                          throws a {@code ServletException}
     *//*

    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Appconfig.class);

        DispatcherServlet servlet = new DispatcherServlet();
        ServletRegistration.Dynamic re
    }
    */
/**
     * Configure the given {@link ServletContext} with any servlets, filters, listeners
     * context-params and attributes necessary for initializing this web application. See
     * examples {@linkplain WebApplicationInitializer above}.
     *
     * @param servletContext the {@code ServletContext} to initialize
     * @throws ServletException if any call against the given {@code ServletContext}
     *                          throws a {@code ServletException}
     *//*


}
*/
