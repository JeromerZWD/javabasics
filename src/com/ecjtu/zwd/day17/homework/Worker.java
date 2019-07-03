package com.ecjtu.zwd.day17.homework;

import java.util.Objects;

public class Worker implements Comparable{

        private int age;
        private String name;
        private double salary;
        public Worker(){}
        public Worker(String name, int age, double salary){
            this.name=name;
            this.age=age;
            this.salary=salary;
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker2 = (Worker) o;
        return age == worker2.age &&
                Double.compare(worker2.salary, salary) == 0 &&
                Objects.equals(name, worker2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, salary);
    }

    public void work(){
            System.out.println(name+"work");

    }

    @Override
    public int compareTo(Object o) {
        Worker worker = (Worker) o;
        if (this.age > worker.age) {
            return 1;
        }else if (this.age <worker.age){
            return -1;
        }
        if (this.salary > worker.salary) {
            return 1;
        }else {
            return -1;
        }

    }
}
