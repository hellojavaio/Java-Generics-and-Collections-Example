package edu.maskleo.generics.ch01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author v@maskleo.cn
 *
 * 泛型之前使用集合都需要显式的转换下
 */
public class Test01 {

    public static void main(String[] args) {
        forJDK4();
        forJDK5();
    }

    private static void forJDK5() {
        // 泛型写法
        List<String> words = new ArrayList<String>();
        words.add("Hello ");
        words.add("world!");
        String s = words.get(0) + words.get(1);
        assert s.equals("Hello world!");
    }

    private static void forJDK4() {
        // 不使用泛型
        List words = new ArrayList();
        words.add("Hello ");
        words.add("world!");
        String s = ((String) words.get(0)) + ((String) words.get(1));
        assert s.equals("Hello world!");
    }
}
