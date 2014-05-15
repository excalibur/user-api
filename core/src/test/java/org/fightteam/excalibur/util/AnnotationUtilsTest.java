package org.fightteam.excalibur.util;

import org.fightteam.excalibur.AppController;
import org.fightteam.excalibur.core.annotation.Component;
import org.fightteam.excalibur.core.annotation.Controller;
import org.fightteam.excalibur.core.util.AnnotationUtils;
import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
public class AnnotationUtilsTest {

    @Test
    public void testGetAnnotation() throws Exception {
        Annotation[] anns = AppController.class.getAnnotations();

        Assert.assertEquals(anns[0].annotationType(), Controller.class);
        Assert.assertEquals(AnnotationUtils.getAnnotation(anns[0], Component.class).annotationType(), Component.class);

    }

    @Test
    public void test01() throws Exception {
        String basePakage = "classpath*:org/fightteam/**/*.class";
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        URL url = cl.getResource("org/fightteam/excalibur/*.class");
        System.out.println(url);
        url = cl.getResource("org/fightteam/excalibur/AppController.class");
        System.out.println(url);
        url = AnnotationUtilsTest.class.getClassLoader().getResource("org/fightteam/**/*.class");
        System.out.println(url);
    }

    @Test
    public void test02() throws Exception {
        Map<String, String> envs = new HashMap<>();
        System.out.println(envs.size());
        envs.forEach((key,value) -> {
            System.out.println("key:"+key+",value:"+value);
        });
        System.out.println("-------------------------");
        System.getProperties().forEach((key, value)->{
            System.out.println("key:"+key+",value:"+value);
        });
    }

    @Test
    public void test03() throws Exception {
        // 获取项目目录
        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        // 读取classpath属性
        String path = System.getProperty("java.class.path");
        System.out.println(path);

        // classpath 正确取得方式
        URL path2 = AnnotationUtilsTest.class.getClassLoader().getResource("");
        System.out.println(path2.getPath());

        URL path3 = AnnotationUtilsTest.class.getResource("/");
        System.out.println(path3);
    }
}
