package achievement;

import java.util.Scanner;

public class StudentAdmin {

    String msg = "编号" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "java"
            + "\t" + "csharp" + "\t" + "html" + "\t" + "sql" + "\t" + "总分" + "\t"
            + "平均分";

    public void print(Student[] stu) {
        System.out.println(msg);
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                System.out.println(stu[i]);
            }
        }
    }

    public int getIndex(Student[] std) {
        for (int i = 0; i < std.length; i++) {
            if (std[i] == null) {
                return i;
            }
        }
        return 999;
    }

    public boolean exits(int id, Student stu) {
        if (stu != null) {
            if (stu.getId() == id) {
                return true;
            }
        }
        return false;
    }

    //10
    public void addStudent(String name, int age, Student[] stu) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.getId();
        int i = this.getIndex(stu);
        if (i == 999) {
            System.out.println("学生已满，无法添加。。。");
        } else {
            student.setId(i);
            stu[i] = student;
        }
    }

    //11
    public void selectStudent(int id, Student[] students) {
        System.out.println(msg);
        for (int i = 0; i < students.length; i++) {
            if (exits(id, students[i])) {
                System.out.println(students[i]);
                return;
            }
        }
    }

    //12
    public void update(int id, String name, int age, Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            if (this.exits(id, stu[i])) {
                stu[i].setName(name);
                stu[i].setAge(age);
                System.out.println("--更新信息成功--");
                return;
            }
        }
        System.out.println("该学生不存在！");
    }

    //13
    public void delete(int id, Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            if (this.exits(id, stu[i])) {
                stu[i] = null;
                this.print(stu);
                System.out.println("删除学生成功");
            }
        }
        System.out.println("删除学生失败！！！");
    }

    //14
    public void inputScore(int id, Student[] stu, Scanner scanner) {
        System.out.println("请输入java成绩");
        int java = scanner.nextInt();
        int csharp = scanner.nextInt();
        int html = scanner.nextInt();
        int sql = scanner.nextInt();
        for (int i = 0; i < stu.length; i++) {
            if (this.exits(id, stu[i])) {
                stu[i].setJava(java);
                stu[i].setCsharp(csharp);
                stu[i].setHtml(html);
                stu[i].setSql(sql);
                return;
            }
        }
        System.out.println("没有找到该学生");
    }

    //15
    public void scoreSort(int num, Student[] stu) {
        Student[] arr = stu;
        if (num == 1) {
            for (int i = 0; i < stu.length - 1; i++) {
                for (int j = i + 1; j < stu.length; j++) {
                    if (stu[i].getJava() < stu[j].getJava()) {
                        Student s = arr[i];
                        arr[i] = arr[j];
                        arr[j] = s;
                    }
                }
            }
            this.print(arr);
        } else if (num == 2) {
            for (int i = 0; i < stu.length - 1; i++) {
                for (int j = i + 1; j < stu.length; j++) {
                    if (stu[i].getCsharp() < stu[j].getCsharp()) {
                        Student s = arr[i];
                        arr[i] = arr[j];
                        arr[j] = s;
                    }
                }
            }
            this.print(arr);
        } else if (num == 3) {
            for (int i = 0; i < stu.length - 1; i++) {
                for (int j = i + 1; j < stu.length; j++) {
                    if (stu[i].getHtml() < stu[j].getHtml()) {
                        Student s = arr[i];
                        arr[i] = arr[j];
                        arr[j] = s;
                    }
                }
            }
            this.print(arr);
        } else if (num == 4) {
            for (int i = 0; i < stu.length - 1; i++) {
                for (int j = i + 1; j < stu.length; j++) {
                    if (stu[i].getSql() < stu[j].getSql()) {
                        Student s = arr[i];
                        arr[i] = arr[j];
                        arr[j] = s;
                    }
                }
            }
            this.print(arr);
        } else {
            System.out.println("输入有误....");
        }

    }

    //16
    public void sunmSort(Student[] stu) {
        Student[]arr=stu;
        for (int i = 0; i < stu.length - 1; i++) {
            for (int j = i + 1; j < stu.length; j++) {
                if (stu[i].getSum() < stu[j].getSum()) {
                    Student s = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s;
                }
            }
        }
        this.print(arr);
    }
}



















