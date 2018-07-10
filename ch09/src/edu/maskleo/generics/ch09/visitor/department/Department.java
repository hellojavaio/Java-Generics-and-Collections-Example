package edu.maskleo.generics.ch09.visitor.department;

import edu.maskleo.generics.ch09.visitor.employee.FullTimeEmployee;
import edu.maskleo.generics.ch09.visitor.employee.PartTimeEmployee;

public abstract class Department {

    public abstract void visit(FullTimeEmployee employee);

    public abstract void visit(PartTimeEmployee employee);

}
