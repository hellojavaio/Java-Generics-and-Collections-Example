package edu.maskleo.generics.ch04;

/**
 * @author v@maskleo.cn
 * <p>
 * 静态类和非静态类的区别,一个有引用一个没有
 */
public class Test02 {

    public static void main(String[] args) {
        Test02.Test03 test03 = (new Test02()).new Test03();
        Test02.Test04 test04 = new Test04();
        test03.print();
        test04.print();
    }

    public class Test03 {
        public void print(){
            System.out.println("not static class test03");
        }
    }

    public static class Test04 {
        public void print(){
            System.out.println("static class test03");
        }
    }

}
