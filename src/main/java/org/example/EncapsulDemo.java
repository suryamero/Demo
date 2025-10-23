package org.example;

class Employee{
    private String Name;
    private  int age;

    public String getName() {
        return Name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n) {
        this.Name=n;
    }
    public void setAge(int a){
        this.age=a;
    }

}
public class EncapsulDemo {

    public static void main(String[] args) {
        Employee Emp=new Employee();
        Emp.setName("John");
        System.out.println("Employee Name is: "+Emp.getName());
         Emp.setAge(12);
         System.out.println("Employee Age is: "+Emp.getAge());
    }

}
