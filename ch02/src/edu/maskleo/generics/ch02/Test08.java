package edu.maskleo.generics.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test08 {

    public static void main(String[] args) {
        test2();
    }

    public static void test() {
        // 编译报错 必须是准确的类型
        // List<?> list = new ArrayList<?>();
        // 编译报错
        // Map<String, ? extends Number> map = new HashMap<String, ? extends Number>();
    }

    public static void test1() {
        List<Number> nums = new ArrayList<Number>();
        List<? super Number> sink = nums;
        List<? extends Number> source = nums;
        for (int i = 0; i < 10; i++) {
            sink.add(i);
        }
        double sum = 0;
        for (Number num : source) sum += num.doubleValue();
        System.out.println(sum);
    }

    public static void test2() {
        List<List<?>> lists = new ArrayList<List<?>>();
        lists.add(Arrays.asList(1,2,3));
        lists.add(Arrays.asList("four","five"));
        assert lists.toString().equals("[[1, 2, 3], [four, five]]");
    }
}
