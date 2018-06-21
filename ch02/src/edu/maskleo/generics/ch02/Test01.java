package edu.maskleo.generics.ch02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author v@maskleo.cn
 *
 * <code>Integer</code>是<code>Number</code>的子类 , 但是<code>List&gt;Integer&lt;</code>与<code>List&gt;Number&lt;</code>没有父子关系
 */
public class Test01 {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        // List<Number> nums = ints; // 编译错误

        List<Number> nums = new ArrayList<Number>();
        nums.add(2.78);
        nums.add(3.14);
        // List<Integer> ints = nums; // 编译错误
    }

}
