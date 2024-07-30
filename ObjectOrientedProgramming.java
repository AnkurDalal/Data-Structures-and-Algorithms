

public class ObjectOrientedProgramming {
    public static void main(String[]args){
  Pen p1=new Pen();
  p1.setColour("yellow");
  System.out.println(p1.getColour());
  p1.setTip(2);
  System.out.println(p1.getTip());

  Student s1=new Student("Ankur dalal");
  Student s2=new Student();
  Student s3=new Student("ankur dala",2);

  System.out.println(s1.name);

  Dog d1=new Dog();
  d1.name="rommy";
  d1.eat();

    Horse mustang=new Horse();
    mustang.eats();

  
    }
}
//base class or parent class
class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void walk(){
        System.out.println("walks");
    }
}
//derived class or child class
class Dog extends Animals{
       String name;
       void bark(){
        System.out.println("barks");
       }
     
}
abstract class Animal{
    void walks(){
        System.out.println("walks");
    }
    abstract void  eats();
}
class Horse extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}


class Student{
    String name;
    int rollNo;
    


    Student(String name){//constructor of the student class
        //System.out.println("hi i am constructor");
        this.name=name;
    }

    Student(){
System.out.println("hi i am constructor");
    }

    Student(int rollNo){
  this.rollNo=rollNo;
    }
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
}
}

    class Pen{
     private   String name;
      private  String colour;
       private int tip;

       String getName(){
        return this.name;
       }
        void setName(String newName){
            name=newName;
        }
        String getColour(){
           return this.colour=colour;
        }
        void setColour(String newColour){
            colour=newColour;
        }
        int getTip(){
             return this.tip=tip;
        }
        void setTip(int newtip){
            tip=newtip;
        }
    }
    

   
