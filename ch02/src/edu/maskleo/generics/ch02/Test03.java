package edu.maskleo.generics.ch02;

import java.util.List;

/**
 * @author v@maskleo.cn
 *
 * <code>super</code>和<code>extends</code> 泛型中的某个类的父类或子类
 */
public class Test03 {

    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }

}
