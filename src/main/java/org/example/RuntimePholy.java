package org.example;
class Collage{
    void collage()
    {
        System.out.println("Collage details");
    }
}
class Teacher extends Collage{
    @Override
    void collage(){
        System.out.println("Teachers details");
    }
}
class Students extends Collage{
    @Override
    void collage(){
        System.out.println("Students details");
    }
}
public class RuntimePholy {
    public static void main(String[] arg){
     Collage c;
     c=new Teacher();
     c.collage();
     c=new Students();
     c.collage();

    }
}
