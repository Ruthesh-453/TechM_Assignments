package com.app.base.config.security;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Step 3
 * Now, load WebSecurityConfig in our existing ApplicationInitializer and add into the getRootConfigClasses() method.
 *  WebSecurityConfig  ApplicationInitializer  getRootConfigClasses () 
 */
public class MVCWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { WebSecurityConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
