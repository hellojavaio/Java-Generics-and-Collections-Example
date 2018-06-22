package edu.maskleo.generics.ch02;

import java.util.Arrays;
import java.util.List;

import static edu.maskleo.generics.ch02.InvokeHandler.invoke;

/**
 * @author v@maskleo.cn
 *
 *  S 是 T 的子类型时，类型 S [] 被认为是 T [] 的一个子类型
 *  但是集合的时候却不是这样
 *  从某种意义上讲，协变数组是早期 Java 版本中缺乏泛型的人为因素。 一旦你有泛型，协变数组可能是<B>错误的</B>设计选择，保留它们的唯一原因是向后兼容。
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
