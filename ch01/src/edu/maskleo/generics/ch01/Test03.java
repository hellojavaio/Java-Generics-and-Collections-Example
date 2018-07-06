package edu.maskleo.generics.ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author v@maskleo.cn
 * <p>
 * loopForForIn 同 loopForforIterator 都是一样的, 只不过前者是语法糖的写法
 * 删除时使用迭代器进行删除
 */
public class Test03 {

    private static List<Integer> ints = new ArrayList<Integer>() {
        {
            add(1);
            add(2);
            add(3);
            add(4);
        }
    };

    public static void main(String[] args) {
        loopForIndex();
        loopForForIn();
        loopForforIterator();
        loopForForEach();
        remove1();
        remove2();
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

    // 错误的写法
    private static void remove1() {
        int i = 0;
        for (int n : ints) {
            i++;
            if (i == 2) {
                ints.remove(new Integer(i));
            } else {
                System.out.println(n);
            }
        }
    }

    private static void remove2() {
        for (Iterator<Integer> it = ints.iterator(); it.hasNext(); ) {
            Integer x = it.next();
            if (Objects.equals(x, 2)) {
                it.remove();
            } else {
                System.out.println(x);
            }
        }
        System.out.println(ints);
    }

}
