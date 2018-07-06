package edu.maskleo.generics.ch03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable 与 Comparator 一个是原来的需要排序的接口，一个额外的类实现排序规则
 */
public class Test01 implements Comparable<Test01> {

    int rank;

    @Override
    public String toString() {
        return "Test01{" +
                "rank=" + rank +
                '}';
    }

    @Override
    public int compareTo(Test01 o) {
        long r = o.rank;
        r = r - (long) rank;
        return r > Integer.MAX_VALUE ? 1 : (int) r;
    }

    public static void main(String[] args) {
        Test01 t1 = new Test01();
        t1.rank = 1;

        Test01 t5 = new Test01();
        t5.rank = 5;

        Test01 t2 = new Test01();
        t2.rank = 2;

        Test01 t3 = new Test01();
        t3.rank = 3;

        List<Test01> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t5);
        list.add(t3);

        System.out.println(list);
        Collections.sort(list);

        Collections.sort(list, (o1, o2) -> {
            return o1.rank == o2.rank ? 0 : (o1.rank > o2.rank ? 1: -1);
            }
        );

        System.out.println(list);
    }
}
