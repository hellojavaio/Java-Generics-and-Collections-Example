package edu.maskleo.generics.ch02;

import java.util.List;

public class Test03 {

    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }
}
