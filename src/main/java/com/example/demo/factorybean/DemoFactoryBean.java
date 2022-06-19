package com.example.demo.factorybean;

import com.example.demo.filter.MyFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.servlet.Filter;
import java.util.Map;

public class DemoFactoryBean implements FactoryBean {
    private static transient final Logger log = LoggerFactory.getLogger(DemoFactoryBean.class);
    private Map<String, String> defMap;
    @Override
    public Object getObject() throws Exception {
        log.info("DemoFactoryBean:getObject");
        return new MyFilter();
    }

    @Override
    public Class<?> getObjectType() {
        log.info("DemoFactoryBean:getObjectType");
        return null;
    }

    @Override
    public boolean isSingleton() {
        log.info("DemoFactoryBean:isSingleton");
        return true;
    }

    public void setFilterChainDefinition(Map<String, String> filters) {
        log.info("DemoFactoryBean:setFilterChainDefinition");
        this.defMap = filters;
    }
}
