package org.example;
class Calculation
{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int c,int d,int e){
        return c+d+e;

    }
}
public class ComipleTimePholy {
   public static void main(String[] args) {
       Calculation c=new Calculation();

       int result=c.add(3,5);
       System.out.println(result);
       int result2=c.add(5,4,2);
       System.out.println(result2);


   }

}
