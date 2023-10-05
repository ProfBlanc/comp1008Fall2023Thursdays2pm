package wk5;

public class Car {

    /*
            private instance variables
                color: String: min 3 chars      default value = black
                doors: int: either 2, 4 or 5    default value = 2
                weight: double: min 1000        default value = 1000
            default constructor
            3-args constructor
            toString

     */
   private String color = "black";
   private int doors = 2;
   private double weight = 1000;

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      if(color.length() >= 3)
         this.color = color;
   }

   public int getDoors() {
      return doors;
   }

   public void setDoors(int doors) {
      if(doors == 2 || doors == 4 || doors == 5)
         this.doors = doors;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      if(weight >= 1000)
         this.weight = weight;
   }

   public Car(){}
   public Car(String color, int doors, double weight) {
      setWeight(weight);
      setColor(color);
      setDoors(doors);
   }

   @Override
   public String toString() {
      return "Car{" +
              "color='" + color + '\'' +
              ", doors=" + doors +
              ", weight=" + weight +
              '}';
   }
}
