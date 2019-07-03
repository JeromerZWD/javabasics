package com.ecjtu.zwd.day6;

import com.ecjtu.zwd.day5.Employee;

public class Test3 {
    public static void main(String[] args) {
            try {
                employee employee = new employee(001,"张三",15);
                employee.addSalary(6000);
                employee.minusSalary(12000);
        }catch (NullException|AgelowException|AgehighException|SalarylowException|SalaryhighException e){
            System.out.println(e.getMessage());
        }
    }
}
