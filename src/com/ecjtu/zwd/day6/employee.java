package com.ecjtu.zwd.day6;
public class employee {
    private int id;
    private String name;
    private int age;
    private static int salary=5000;
    private String cardId;
    private static int employeenum=1;
    private static int Salarysum=10000;
    public employee(int id, String name, int age) throws NullException,AgehighException,AgelowException{
        if (name!=null){
            this.name = name;
        }else { throw new NullException("名字为空"); }
        this.id = id;
        if (age >= 18 && age <= 60) {
            this.age = age;
        } else if (age < 18) {
           throw new AgelowException("年龄太小"); }
        else{ throw new AgehighException("年龄太大");
    } }
    public void addSalary(double addSalary) throws SalaryhighException{
        salary+=addSalary;
        if (salary>10000){ throw new SalaryhighException("工资超了");
        } }
    public void minusSalary(double minusSalary) throws SalarylowException{
        salary+=minusSalary;
        if (salary<=0){
            throw new SalarylowException("工资低了"); } }
    public void showTotalEmployee() throws NullException{
        if (employeenum==0){
            throw new NullException("员工人数为0"); }
        System.out.println(employeenum);
    }}