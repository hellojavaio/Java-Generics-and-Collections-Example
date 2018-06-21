package edu.maskleo.generics.ch02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author v@maskleo.cn
 * nums 可能是其他的数字子类型的列表所以 17 和 18 行无法编译通过
 */
public class Test02 {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        // nums.add(3.14);
        // nums.add(1);
    }

}
