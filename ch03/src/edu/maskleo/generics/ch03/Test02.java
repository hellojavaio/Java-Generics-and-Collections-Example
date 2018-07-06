package edu.maskleo.generics.ch03;

/**
 * @author v@maskleo.cn
 * <p>
 * 枚举也能实现接口
 */
public enum Test02 implements Test03 {
    INSTANCE {
        @Override
        public String print() {
            System.out.println(super.build());
            return "INSTANCE";
        }
    };
    @Override
    public String print() {
        System.out.println(build());
        return "def";
    }
    interface Print {
        String print();
    }
    public static void main(String[] args) {
        System.out.println(INSTANCE.print());
    }
}