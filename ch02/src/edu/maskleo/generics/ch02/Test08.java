package edu.maskleo.generics.ch02;

import java.util.*;

public class Test08 {

    public static void main(String[] args) {

    }

    public static void test(){
        // 编译报错 必须是准确的类型
        // List<?> list = new ArrayList<?>();
        // 编译报错
        // Map<String, ? extends Number> map = new HashMap<String, ? extends Number>();
    }
}
