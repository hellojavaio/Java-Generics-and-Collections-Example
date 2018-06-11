package edu.maskleo.generics.ch01;

import java.util.Objects;

/**
 * @author v@maskleo.cn
 *
 *  <code>Short</code>,<code>Integer</code>,<code>Long</code>
 *  装箱时需要缓存一个介于 -128 和 127 之间的值
 */
public class Test02 {

    public static void main(String[] args) {
        Integer i1 = 200;
        Integer i2 = 200;

        // 错误写法
        System.out.println(i1 == i2);

        // 正确写法
        System.out.println(Objects.equals(i1, i2));
    }
}
