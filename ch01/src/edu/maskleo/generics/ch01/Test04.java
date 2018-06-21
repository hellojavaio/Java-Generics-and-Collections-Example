package edu.maskleo.generics.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author v@maskleo.cn
 * <p>
 * 可变参数
 */
public class Test04 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 这里会提示错误  因为 ints 不是 Integer 类型 参数会当做整个 int [] 类型
        // int[] ints = {1, 2, 3, 4};
        // Lists.addAll(list, ints);

        Integer[] ints = {1, 2, 3, 4};
        Lists.addAll(list, ints);
        System.out.println(list);

        // false
        System.out.println(Arrays.asList(new int[]{1, 2, 3, 4}).size() == 4);
        // true
        System.out.println(Arrays.asList(new Integer[]{1, 2, 3, 4}).size() == 4);
    }

    public static class Lists {

        public static <T> List<T> toList(T[] arr) {
            List<T> list = new ArrayList<T>();
            for (T elt : arr) {
                list.add(elt);
            }
            return list;
        }

        public static <T> void addAll(List<T> list, T... arr) {
            for (T elt : arr) {
                list.add(elt);
            }
        }
    }

}
