package edu.maskleo.generics.ch04;

/**
 * @author v@maskleo.cn
 * <p>
 * 类型参数 T 和 U 在类的开头声明，而不在构造函数中声明。 但是，实际的类型参数在调用时会传递给构造函数：
 */
public class Test01<T, U> {

    private final T first;
    private final U second;

    public Test01(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Test01<String, Integer> test11 = new Test01<>("XXX", 1);
        System.out.println(test11.getFirst());
        System.out.println(test11.getSecond());
    }
}
