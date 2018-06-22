package edu.maskleo.generics.ch02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author v@maskleo.cn
 *
 * 当调用泛型方法时，可以选择类型参数以匹配由通配符表示的未知类型。这被称为通配符捕获。
 */
public class Test07 {

    public static void reverse(List<?> list) {
        rev(list);
    }

    private static <T> void rev(List<T> list) {
        List<T> tmp = new ArrayList<T>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size() - i - 1));
        }
    }


    // Error:(25, 32) java: 不兼容的类型: java.lang.Object无法转换为capture#1, 共 ?
    /*public static void reverse(List<?> list) {
        List<Object> tmp = new ArrayList<Object>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size() - i - 1)); // 编译报错
        }
    }*/


}
