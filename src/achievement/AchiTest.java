package achievement;

import java.util.Scanner;

public class AchiTest {
    public static void main(String[] args) {
       final Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生人数");
        int stunum=scanner.nextInt();
        Student []stu=new Student[stunum];
        StudentAdmin studentAdmin=new StudentAdmin();
            while (true){
                System.out.println("请选择要执行的功能（输入编号）：");
                System.out.println("10:添加一个学生");
                System.out.println("11:查找一个学生");
                System.out.println("12:根据学生编号更新学生基本信息");
                System.out.println("13:根据学生编号删除学生");
                System.out.println("14:根据编号输入学生各门科的成绩");
                System.out.println("15:根据某门成绩排序");
                System.out.println("16:根据总分就行排序");
                System.out.println("99:退出系统");
                int index=scanner.nextInt();

                switch (index){
                    case 10:
                        System.out.println("--执行添加学生操作--");
                        System.out.println("请输入要添加学生的姓名：");
                        String name=scanner.next();
                        System.out.println("请输入要添加学生的年龄：");
                        int age=scanner.nextInt();
                        studentAdmin.addStudent(name,age,stu);
                        studentAdmin.print(stu);

                        break;
                    case 11:
                        System.out.println("请输入需要查询学生的学号");
                        int id=scanner.nextInt();
                        studentAdmin.selectStudent(id,stu);
                        break;
                    case 12:
                        System.out.println("请输入需要更新的学号");
                        int id2=scanner.nextInt();
                        System.out.println("请输入需要更新的姓名");
                        String name2=scanner.next();
                        System.out.println("请输入需要更新的年龄");
                        int age2=scanner.nextInt();
                        studentAdmin.update(id2,name2,age2,stu);
                        break;
                    case 13:
                        System.out.println("请输入需要更新的学号");
                        int id3=scanner.nextInt();
                        studentAdmin.delete(id3,stu);
                        break;
                        case 14:
                            System.out.println("请输入需要更新的学号");
                            int id4=scanner.nextInt();
                            studentAdmin.inputScore(id4,stu,scanner);
                            break;
                    case 15:
                        System.out.println("请输入1-4选择排序成绩");
                        int index2=scanner.nextInt();
                        studentAdmin.scoreSort(index2,stu);
                        break;
                    case 16:
                        studentAdmin.sunmSort(stu);
                        break;
                    case 99:
                        System.out.println("退出系统成功！");
                        System.exit(0);
                        default:
                            System.out.println("选择错误，请重新输入。。。。");




                }
    }
}
    public void addStudent(){
        System.out.println();
}
}
