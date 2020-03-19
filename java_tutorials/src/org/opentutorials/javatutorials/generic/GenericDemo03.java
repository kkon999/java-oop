package org.opentutorials.javatutorials.generic;

class StudentInfo03{
    public int grade;
    StudentInfo03(int grade){ this.grade = grade; }
}
class EmployeeInfo03{
    public int rank;
    EmployeeInfo03(int rank){ this.rank = rank; }
}
class Person03{
    public Object info;
    Person03(Object info){ this.info = info; }
}
public class GenericDemo03 {
    public static void main(String[] args) {
        Person03 p1 = new Person03("부장");
        EmployeeInfo ei = (EmployeeInfo)p1.info;
        System.out.println(ei.rank);
    }
}