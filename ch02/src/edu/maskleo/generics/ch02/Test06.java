package edu.maskleo.generics.ch02;

import java.util.Arrays;
import java.util.List;

/**
 * @author v@maskleo.cn
 *
 * 通配符与类型参数
 * JDK 的集合接口设计为了兼容
 * <code>
 * interface Collection&lt;E&gt; {
 *   ...
 *   public boolean contains(Object o);
 *   public boolean containsAll(Collection&lt;?&gt; c);
 *   ...
 *   }
 *  </code>
 */
public class Test06 {

    public static void main(String[] args) {
        Object obj = "one";
        List<Object> objs = Arrays.<Object>asList("one", 2, 3.14, 4);
        List<Integer> ints = Arrays.asList(2, 4);
        System.out.println(objs.contains(obj));
        System.out.println(objs.containsAll(ints));
        System.out.println(ints.contains(obj));
        System.out.println(ints.containsAll(objs));


    }

}
