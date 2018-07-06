package edu.maskleo.generics.ch03;

public interface Test03 {
    String print();
    default String build() {
        return "interface.Test03.default.build";
    }
}
