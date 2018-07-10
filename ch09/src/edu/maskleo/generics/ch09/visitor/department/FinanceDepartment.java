package edu.maskleo.generics.ch09.visitor.department;

import edu.maskleo.generics.ch09.visitor.employee.FullTimeEmployee;
import edu.maskleo.generics.ch09.visitor.employee.PartTimeEmployee;

import java.text.MessageFormat;

public class FinanceDepartment extends Department {

    // 实现财务部对兼职员工数据的访问
    public void visit(PartTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println(MessageFormat.format("临时工 {0} 实际工资为：{1} 元", employee.getName(), workTime * hourWage));
    }

    // 实现财务部对全职员工数据的访问
    public void visit(FullTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weekWage = employee.getWeekWage();
        if (workTime > 40) {
            weekWage = weekWage + (workTime - 40) * 50;
        } else if (workTime < 40) {
            weekWage = weekWage - (40 - workTime) * 80;
            if (weekWage < 0) {
                weekWage = 0;
            }
        }
        System.out.println(MessageFormat.format("正式员工 {0} 实际工资为：{1} 元", employee.getName(), weekWage));
    }
}
