package org.fightteam.excalibur.util;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.nashorn.internal.codegen.types.Type;
import org.junit.Test;
import org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by excalibur on 2014/5/20.
 */
public class ClassTest {

    @Test
    public void test01() throws Exception {
        //生成一个类只需要ClassWriter组件即可
        ClassWriter cw = new ClassWriter(0);

        //通过visit方法确定类的头部信息
        cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC+Opcodes.ACC_ABSTRACT+Opcodes.ACC_INTERFACE,
                "com/asm/A", null, "java/lang/Object", null);


        //定义类的属性
        cw.visitField(Opcodes.ACC_PUBLIC,
                "NUM", "I", null, new Integer(-1)).visitEnd();

        cw.visitField(Opcodes.ACC_PUBLIC+Opcodes.ACC_FINAL+Opcodes.ACC_STATIC,
                "NAME", "I", null, new Integer(0)).visitEnd();

        //定义类的方法
        cw.visitMethod(Opcodes.ACC_PUBLIC+Opcodes.ACC_ABSTRACT, "compareTo",
                "(Ljava/lang/Object;)I", null, null).visitEnd();
        cw.visitEnd();
        //使cw类已经完成
        //将cw转换成字节数组写到文件里面去
        byte[] data = cw.toByteArray();
        File file = new File("D://A.class");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(data);
        fout.close();
    }

    @Test
    public void test02() throws Exception {
        // 读取类
        ClassReader cr = new ClassReader("org/fightteam/excalibur/C");

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);

    }


    @Test
    public void test03() throws Exception {
        System.out.println(Type.getInternalName(String.class));

    }


    @Test
    public void test04() throws Exception {

        ClassReader cr = new ClassReader("java.lang.Runnable");
        System.out.println(cr.getClassName());

    }

    @Test
    public void test05() throws Exception {

        // 获取本线程的类加载器
        ClassLoader ldr = Thread.currentThread().getContextClassLoader();


    }
}
