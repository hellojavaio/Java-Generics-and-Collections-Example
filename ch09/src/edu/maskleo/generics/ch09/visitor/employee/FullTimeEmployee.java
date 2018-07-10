package edu.maskleo.generics.ch09.visitor.employee;

import edu.maskleo.generics.ch09.visitor.department.Department;

public class FullTimeEmployee implements IEmployee {

    private String name;
    private double weekWage;
    private int workTime;

    public FullTimeEmployee(String name, double weekWage, int workTime) {
        this.name = name;
        this.weekWage = weekWage;
        this.workTime = workTime;
    }

    public void accept(Department handler) {
        handler.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeekWage() {
        return weekWage;
    }

    public void setWeekWage(double weekWage) {
        this.weekWage = weekWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
