package com.lxit.lrc.datasource;

import java.lang.reflect.Executable;
import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DynamicDataSourceAspect {

    @Before("execution( * com.lxit.lrc.service.impl.*.* (. .))")
    public void beforeSwitchDS(JoinPoint point){
    	System.out.println("序秘阻Before。。。。。。。。。。。。。。。。");
    	System.out.println("============================");
    	System.out.println("============================");
    	System.out.println("============================");
    	System.out.println("============================");
        Class<?> className = point.getTarget().getClass();
        String methodName = point.getSignature().getName();
        System.out.println(className+"=============="+methodName+"============"+point.getSignature());
        //Class[] argClass = ((Executable) point.getSignature()).getParameterTypes();
        String dataSource = DataSourceContextHolder.DEFAULT_DS;
        try {
            //Method method = className.getMethod(methodName, argClass);
            //if (method.isAnnotationPresent(DS.class)) {
               // DS annotation = method.getAnnotation(DS.class);
               // dataSource = annotation.value();
           // }
        } catch (Exception e) {
            e.printStackTrace();
        }

        DataSourceContextHolder.setDB(dataSource);

    }


    @After("execution( * com.lxit.lrc.service.impl.*.* (. .))")
    public void afterSwitchDS(JoinPoint point){
    	System.out.println("序秘阻after。。。。。。。。。。。。。。。。");
        DataSourceContextHolder.clearDB();

    }
}
