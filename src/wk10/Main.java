// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//Student, MatureStudent, HonorRollStudent

class Student{
    private String name="Student";
    private int age;
    private double grade;
    public void setGrade(double grade){
        this.grade = grade;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGrade(){
        return grade;
    }
    
    public Student(){}
    public Student(String name, int age, double grade){
        setName(name);
        setAge(age);
        setGrade(grade);
    }
}

class MatureStudent extends Student{
    
    String job = "Working";
    
    public MatureStudent(){}
    public MatureStudent(String name, int age, double grade){
        super(name, age, grade);
    }
    public MatureStudent(String name, int age, double grade, String job){
        super(name, age, grade);
        this.job = job;
    }
    @Override
    public void setAge(int age){
        
        if(age < 30){
            throw new IllegalArgumentException("Age must be at least 30 years old!");
        }
        
        super.setAge(age);
        
    }
}

class HonorRollStudent extends Student{
    
    String prizes;
    public HonorRollStudent(){}
    public HonorRollStudent(String name, int age, double grade){
        super(name, age, grade);
    }
    public HonorRollStudent(String name, int age, double grade, String prizes){
        super(name, age, grade);
        this.prizes = prizes;
    }

@Override
public void setGrade(double grade){
    
    if(grade < 80){
        throw new IllegalArgumentException("Grade must be at least 80%");
    }
    
    super.setGrade(grade);
}
}


/*

        poly = many
        morphism = body, form
        
        polymorphism = many forms
        
        Overriding
            multiple implementations per object
        
        Overloading
            multiple variations
            
    
        
        Objects can be comprised of MULTIPLE components
        
        Internal 
            Abstract class:
                dedicated super class
                    cannot be instantiated
                has same features as concrete
                    instance variables, constants, methods, constructors
                incomplete class (functionality)
                general category/grouping of objects to form commonality
                
                CAN have an abstract method
                    method with NO default implementation (no method body)
        
        
        External
            Interface
                a list of requirements
                features of interface
                    constants, method declarations
                        all public
                user-interaction methods
                a class can implement multiple interfaces
                an interface an extend multple other interface
                
    Q1) Does this thing exists FUNCTIONALLY by itself?
        YES: concrete class
        NO: that means, entity is a component
    
    Q2) Is this component an inner or outer component
        INNER: Abstract class
        OUTER: Interface


Game part 1
Prof: State an object
You: abstract class, concrete class or interface


Human-C
Heart-A
Hair-I
Hand-I


House-C
Apartment-A
Room-A
Floor-A, or I
Door


Game part 2
Prof: Name a feature
You: if feature is allowed in: Concrete, Abstract, Interface or combination

-constructor: AC
-constants: CAI
-instance variables: AC
-methods with NO default implementation
aka abstract methods: AI
-methods WITH default implementation: CA



*/

abstract class Shape{
    String name;
    double length, width;
    public Shape(){}
    public Shape(String name, double length, double width){
        this.name = name;
        this.length=length;
        this.width=width;
    }
    public abstract double area();
    public abstract double perimeter();
    public abstract void foo(int a, double b);
}

abstract class ThreeDShape extends Shape{
    double depth;
    abstract double volume();
}
class Cube extends ThreeDShape{
    
    @Override
    public double volume(){
        return length * width * depth;
    }
       @Override
    public double area(){
        return length * width;
    }
    @Override
    public double perimeter(){
        return  2 * (length + width);
    }
    public void foo(int a, double b){
        System.out.println(a + " - " + b);
    }
    
}


class Rectangle extends Shape{
    public Rectangle(){}
    public Rectangle(String name, double length, double width){
        super(name, length, width);
    }
    @Override
    public double area(){
        return length * width;
    }
    @Override
    public double perimeter(){
        return  2 * (length + width);
    }
    public void foo(int a, double b){
        System.out.println(a + " - " + b);
    }
}


interface CollegeCourse{
    
    int MAX_GRADE = 100, MIN_GRADE = 0;
    
    void assignments(String[] evaluations);
    double tests(String test1, String test2);
    
}


class Comp1008 extends Rectangle implements CollegeCourse{
    
    @Override
    public void assignments(String[] evaluations){
        for(String eval : evaluations){
            System.out.println(eval);
        }
    }
    @Override 
    public double tests(String t1, String t2){
        
        return (t1.length() + t2.length()) / 2.0;
    }
}

interface SampleInterface1{
    void method1();
}
interface SampleInterface2{
    void method2();
}
interface SampleInterface3{
    void method3();
}

interface SampleInterface4 extends SampleInterface1, SampleInterface2, SampleInterface3{
    void method4();
}

class SampleClass1 implements SampleInterface4{
    
    public void method1(){}
    public void method2(){}
    public void method3(){}
    public void method4(){}
    
}


class HelloWorld {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Shape s1 = new Rectangle();
        CollegeCourse cc = new Comp1008();
        System.out.println(cc.tests("Mid-Term", "Final Exam"));
        Rectangle r2 = new Comp1008();
        Shape s2 = new Comp1008();
        

    }
}
