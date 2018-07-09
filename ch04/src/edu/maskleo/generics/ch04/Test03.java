package edu.maskleo.generics.ch04;

import java.util.List;
/**
 * @author v@maskleo.cn
 * <p>
 * 编译时错误，不能实现两个擦除相同的接口
 */
public class Test03 {

    static class Test033 implements Test031,Test032{

        @Override
        public void print() {

        }

        /*@Override
        public void print(List<Integer> list) {

        }

        @Override
        public void print(List<Long> list) {

        }*/

    }

    public static void main(String[] args) {
        Test033 test033 = new Test033();
        test033.print();
    }

    interface Test031{

        //void print(List<Long> list);

        default void print(){
            System.out.println("Test031");
        };

    }

    interface Test032{

        //void print(List<Integer> list);

        default void print(){
            System.out.println("Test032");
        };
    }
}
