package edu.maskleo.generics.ch01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author v@maskleo.cn
 * <p>
 * loopForForIn 同 loopForforIterator 都是一样的, 只不过前者是语法糖的写法
 */
public class Test03 {

    private static List<Integer> ints = Arrays.asList(1, 2, 3);

    public static void main(String[] args) {
        loopForIndex();
        loopForForIn();
        loopForforIterator();
        loopForForEach();
    }

    private static void loopForForEach() {
        ints.forEach(i -> System.out.println(i));
    }

    private static void loopForforIterator() {
        for (Iterator<Integer> it = ints.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }

    private static void loopForForIn() {
        for (int n : ints) {
            System.out.println(n);
        }
    }

    private static void loopForIndex() {
        for (int index = 0; index < ints.size(); index++) {
            System.out.println(ints.get(index));
        }
    }


}
