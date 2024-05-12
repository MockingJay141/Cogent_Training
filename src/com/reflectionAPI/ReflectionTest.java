package com.reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
             InstantiationException, IllegalAccessException {

        Constructor<ReflectionDemo> pcc = ReflectionDemo.class.getDeclaredConstructor();
        pcc.setAccessible(true);
        ReflectionDemo privateConstructorInstance = pcc.newInstance();


        Method method = PrivateMethodExample.class.getDeclaredMethod("test", null);
        method.setAccessible(true);
        PrivateMethodExample pme = new PrivateMethodExample();
        method.invoke(pme);

    }
}
