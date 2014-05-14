package org.fightteam.excalibur.util;

import org.fightteam.excalibur.AppController;
import org.fightteam.excalibur.core.annotation.Component;
import org.fightteam.excalibur.core.annotation.Controller;
import org.fightteam.excalibur.core.util.AnnotationUtils;
import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.net.URL;

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
        URL url = cl.getResource("org/fightteam/excalibur/AppController.class");
        System.out.println(url);
        url = AnnotationUtilsTest.class.getClassLoader().getResource("org/fightteam/**/*.class");
        System.out.println(url);
    }
}
