package edu.maskleo.generics.ch09.visitor.department;

import edu.maskleo.generics.ch09.visitor.employee.FullTimeEmployee;
import edu.maskleo.generics.ch09.visitor.employee.PartTimeEmployee;

import java.text.MessageFormat;

public class HRDepartment extends Department {

    // 实现财务部对兼职员工数据的访问
    public void visit(PartTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println(MessageFormat.format("临时工 {0} 实际工作时间为：{1} 小时", employee.getName(), workTime));
    }

    // 实现财务部对全职员工数据的访问
    public void visit(FullTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println(MessageFormat.format("正式员工 {0} 实际工作时间为：{1} 小时", employee.getName(), workTime));

        if (workTime > 40) {
            System.out.println(MessageFormat.format("正式员工 {0} 加班时间为：{1} 小时", employee.getName(), workTime - 40));
        } else if (workTime < 40) {
            System.out.println(MessageFormat.format("正式员工 {0} 请假时间为：{1} 小时", employee.getName(), 40 - workTime));
        }
    }
}