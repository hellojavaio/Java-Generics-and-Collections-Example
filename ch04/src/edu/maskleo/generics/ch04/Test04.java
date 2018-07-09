package edu.maskleo.generics.ch04;

import java.util.Arrays;
import java.util.List;

public class Test04 {

    public static void main(String[] args) {
        List<Integer>[] intLists = (List<Integer>[])new List[] {Arrays.asList(1)}; // 未经检查的转换
        List<? extends Number>[] numLists = intLists;
        numLists[0] = Arrays.asList(1.01);
        int n = intLists[0].get(0); // 类抛出异常!
    }
}
