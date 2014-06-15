package org.fightteam.excalibur.core;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by excalibur on 2014/6/15.
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println(">>>MethodInterceptor start...");
        Object result = methodProxy.invokeSuper(o,args);
        System.out.println(">>>MethodInterceptor ending...");
        return "hahahh";
    }

}
