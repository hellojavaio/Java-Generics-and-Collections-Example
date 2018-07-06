package edu.maskleo.generics.ch02;

public interface Test10 {
    String print();
    default String build() {
        return "interface.Test10.default.build";
    }
}
