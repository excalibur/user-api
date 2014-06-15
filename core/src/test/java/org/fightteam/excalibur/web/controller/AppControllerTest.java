package org.fightteam.excalibur.web.controller;

import net.sf.cglib.proxy.Enhancer;
import org.fightteam.excalibur.core.MyMethodInterceptor;
import org.fightteam.excalibur.core.Target;
import org.fightteam.excalibur.core.a.Count;
import org.fightteam.excalibur.core.a.CountCglib;
import org.fightteam.excalibur.core.a.CountImpl;
import org.fightteam.excalibur.core.a.CountProxy;
import org.junit.Test;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
public class AppControllerTest {

    @Test
    public void test01() throws Exception {
        Target target = new Target();

        Target proxyTarget = (Target)createProxy(Target.class);
        String res=proxyTarget.execute();
        System.out.println(res);
    }

    public Object createProxy(Class targetClass){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }


    @Test
    public void test02() throws Exception {
        CountProxy proxy = new CountProxy();
        Count count = (Count) proxy.bind(new CountImpl());
        count.queryCount();
    }

    @Test
    public void test03() throws Exception {
        CountCglib countCglib = new CountCglib();

        Count count = (Count) countCglib.getInstance(new CountImpl());
        count.queryCount();

    }
}
