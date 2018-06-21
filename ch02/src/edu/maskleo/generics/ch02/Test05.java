package edu.maskleo.generics.ch02;

import java.util.Arrays;
import java.util.List;

import static edu.maskleo.generics.ch02.InvokeHandler.invoke;

/**
 * @author v@maskleo.cn
 */
public class Test05 {

    public static void main(String[] args) {
        invoke(Test05.class,"forArr");
        invoke(Test05.class,"forList");
        invoke(Test05.class,"forClass");
    }


    private static void forList() {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        // 下面的代码编译时报错
        // List<Number> nums = ints;
        // List<? extends Number> nums = ints;
        // nums.set(2, 3.14);
        System.out.println(ints.toString().equals("[1, 2, 3.14]")); // uh oh!
    }

    private static void forArr() {
        Integer[] ints = new Integer[]{1, 2, 3};
        Number[] nums = ints;
        // array store exception
        nums[2] = 3.14;
        System.out.println(Arrays.toString(ints).equals("[1, 2, 3.14]"));
    }

    private static void forClass() {
        Child[] ints = new Child[]{new Child()};
        Parent[] nums = ints;
        // array store exception
        nums[0] = new Parent();
    }

    public static class Child extends Parent {

    }

    public static class Parent {

    }

}
