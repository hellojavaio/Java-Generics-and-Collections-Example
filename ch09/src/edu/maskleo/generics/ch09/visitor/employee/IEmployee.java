package edu.maskleo.generics.ch09.visitor.employee;

import edu.maskleo.generics.ch09.visitor.department.Department;

public interface IEmployee {

    void accept(Department handler);
}
