package edu.maskleo.generics.ch09.visitor.employee;

import edu.maskleo.generics.ch09.visitor.department.Department;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    private List<IEmployee> empList = new ArrayList<>();

    public void addEmployee(IEmployee emp) {
        this.empList.add(emp);
    }

    public void accept(Department handler) {
        for (IEmployee emp : empList) {
            emp.accept(handler);
        }
    }
}