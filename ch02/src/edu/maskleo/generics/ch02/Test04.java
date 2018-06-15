package edu.maskleo.generics.ch02;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author v@maskleo.cn
 *
 * 获取和放置原则: 获取和放置原则：当您只将值从结构中取出时，使用扩展通配符，当您只将值放入结构中时使用超级通配符，并且在双方都得到并放置时不使用通配符。
 */
public class Test04 {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        assert sum(ints) == 6.0;
        List<Double> doubles = Arrays.asList(2.78, 3.14);
        assert sum(doubles) == 5.92;
        List<Number> nums = Arrays.<Number>asList(1, 2, 2.78, 3.14);
        assert sum(nums) == 8.92;
    }

    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums) {
            s += num.doubleValue();
        }
        return s;
    }

}
