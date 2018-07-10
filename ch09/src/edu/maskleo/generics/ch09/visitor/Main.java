package edu.maskleo.generics.ch09.visitor;

import edu.maskleo.generics.ch09.visitor.department.FinanceDepartment;
import edu.maskleo.generics.ch09.visitor.department.HRDepartment;
import edu.maskleo.generics.ch09.visitor.employee.EmployeeList;
import edu.maskleo.generics.ch09.visitor.employee.FullTimeEmployee;
import edu.maskleo.generics.ch09.visitor.employee.IEmployee;
import edu.maskleo.generics.ch09.visitor.employee.PartTimeEmployee;

public class Main {

    public static void main(String[] args) {
        EmployeeList empList = new EmployeeList();
        IEmployee fteA = new FullTimeEmployee("梁思成", 3200.00, 45);
        IEmployee fteB = new FullTimeEmployee("徐志摩", 2000, 40);
        IEmployee fteC = new FullTimeEmployee("梁徽因", 2400, 38);
        IEmployee fteD = new PartTimeEmployee("方鸿渐", 80, 20);
        IEmployee fteE = new PartTimeEmployee("唐宛如", 60, 18);

        empList.addEmployee(fteA);
        empList.addEmployee(fteB);
        empList.addEmployee(fteC);
        empList.addEmployee(fteD);
        empList.addEmployee(fteE);

        empList.accept(new FinanceDepartment());
        System.out.println("==========================");
        empList.accept(new HRDepartment());
    }

}
