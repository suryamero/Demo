package org.example;
class Add{
   int cal (int a,int b){
       return a+b;
   }
}

class Sub extends Add{
    @Override
    int cal(int a,int b){
        return a-b;
    }
}
class Mul extends Add{
    @Override
    int cal(int a,int b){
        return a*b;
    }
}
class Div extends Add{
    @Override
    int cal(int a,int b){
        return a/b;
    }
}
public class CalculationOverride {
    public static void main(String[] args) {
       Add add;
       add=new Add();
       int result1=add.cal(10,20);
       System.out.println("Addition value is: "+result1);
       add=new Sub();
       int result2=add.cal(20,10);
       System.out.println("Subtraction value is: "+result2);
       add=new Mul();
       int reult3=add.cal(5,6);
       System.out.println("Multiplication value is: "+reult3);
       add=new Div();
       int result4=add.cal(4,3);
       System.out.println("Divition value is: "+result4);



    }
}
