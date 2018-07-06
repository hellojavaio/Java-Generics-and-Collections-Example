package edu.maskleo.generics.ch02;

public enum Test09 implements Test10 {
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