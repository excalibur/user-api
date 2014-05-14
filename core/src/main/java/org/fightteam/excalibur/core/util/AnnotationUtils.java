package org.fightteam.excalibur.core.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
/**
 * 注解处理
 *
 * @author faith
 * @since 0.0.1
 */
public class AnnotationUtils {


    /**
     * 在annotation上根据类型获取annotation
     *
     * 注 本annotation就是就返回本身
     * @param ann
     * @param annotationType
     * @param <T>
     * @return
     */
    public static <T extends Annotation> T getAnnotation(Annotation ann, Class<T> annotationType) {
        if (annotationType.isInstance(ann)) {
            return (T) ann;
        }
        return ann.annotationType().getAnnotation(annotationType);
    }

    public static <T extends Annotation> T getAnnotation(AnnotatedElement ae, Class<T> annotationType) {
        T ann = ae.getAnnotation(annotationType);
        if (ann == null) {
            for (Annotation metaAnn : ae.getAnnotations()) {
                ann = metaAnn.annotationType().getAnnotation(annotationType);
                if (ann != null) {
                    break;
                }
            }
        }
        return ann;
    }



}
