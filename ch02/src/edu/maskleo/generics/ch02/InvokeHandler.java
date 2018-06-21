package edu.maskleo.generics.ch02;

import java.lang.reflect.Method;

public class InvokeHandler {

    public static void invoke(Class clazz, String methodName) {
        System.out.println(String.format("class:%s,method:%s-----begin", clazz, methodName));
        try {
            Method method = clazz.getDeclaredMethod(methodName);
            boolean isAccess = method.isAccessible();
            if (!isAccess) {
                method.setAccessible(true);
            }
            method.invoke(null);
            if (!isAccess) {
                method.setAccessible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(String.format("class:%s,method:%s-----end", clazz, methodName));
    }

}
