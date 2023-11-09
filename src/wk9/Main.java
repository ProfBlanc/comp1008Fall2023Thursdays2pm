// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Animal{
    
    private String sound="";
    private double height;
    String name="Animal";
    
    public String getSound(){
        return sound;
    }
    public double getHeight(){
        return height;
    }
    public void setSound(String sound){
        this.sound = sound;
    }
    public void setHeight(double height){
        this.height = height;
    }
    
    public Animal(){}
    public Animal(String sound, double height){
        setHeight(height);
        setSound(sound);
    }
    
    public String toString(){
        return String.format("Name=%s, Sound=%s, Height=%.1f", name, sound, height);
    }
    
}
class Cat extends Animal{
    private int paws;
    public int getPaws(){
        return paws;
    }
    public void setPaws(int paws){
        this.paws = paws;
    }
    public Cat(){}
    
    public Cat(String sound, double height){
        super(sound, height);
        
        //setSound(sound);setHeight(height);
        
        //this.name = String.valueOf(sound);
    }
    public Cat(String sound, double height, int paws){
        
        //this(sound, height);
        super(sound, height);
        setPaws(paws);
        
    }
    /*
    
    overloading: new variatoin
    overriding: new implementation
    
    What's with the @ symbol
        annotation
            speaks to compliter
                verify that the method signatures exist in parent class(es)
    */
    @Override
    public String toString(){
        return super.toString() + ", Paws = " + paws;
    }
}

class Lion extends Cat{}
class HelloWorld {
    static void example1(){
        
        /*
        
            inheritance?
                something being passed down to you 
                
            OLD                     NEW
            
            base                    derived
            parent                  child
            super                   sub
            
            
            Java: only inherit from ONE other class
            
            
        Great Grandmother       GrandMother           Mother            Female
        
        
        direct inheritance
        
        indirect inheritance
            
            
            Object
                default constructor
                toString(), getClass(), hashCode(), equals()
        What is inherited by child class
            default constructor
            all non-private instance variables
            all non-private methods
        
        When to create a subclass?
            create a newer version
            create something more specific
        
    
        general                     specific
        
        Animal          Cat         Lion
        
            
        
            
        */
        
        
        HelloWorld hw = new HelloWorld();
        System.out.println(hw);
        
        
    }
    static void example2(){
        Cat c = new Cat();
        System.out.println(c.getHeight());
    }
    static void example3(){
         Cat c = new Cat("meow", 10);
        System.out.println(c.getHeight());
    }
    static void example4(){
        Animal a1 = new Animal("Hello", 10);
        
        Cat c1 = new Cat("meow", 20);
        c1.name = "Cat";
        System.out.println(a1);
        System.out.println(c1);
        
    }
    static void example5(){
        
        Animal a1 = new Animal("Hello", 10);
        
        Cat c1 = new Cat("meow", 20, 4);
        c1.name = "Cat";
        System.out.println(a1);
        System.out.println(c1);
       
        
    }
    static void example6(){

        Animal a1 = new Cat();
        System.out.println(a1);
        
        
        Animal[] animals = {new Animal(), new Cat(), new Lion()};
        
        //System.out.println(animals[0].name);
         System.out.println();
         System.out.println("Loop");
 System.out.println();
        
        for(Animal animal : animals){
            
            if(animal instanceof Cat){
                System.out.println("Paws = " + ((Cat)(animal)).getPaws());
            }
            else{
                System.out.println("Paws method not found");
            }
            
        }

    }
    
    
    public static void main(String[] args) {
       example6();
    }
}
