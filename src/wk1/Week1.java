package wk1;

import java.util.Scanner;

public class Week1{

    //psvm+tab
    public static void main(String[] args) {

        //sout+tab
        System.out.println("Hello from Week 1");

        Home home = new Home();
        System.out.println(home.address);


        /*
                    ask user for Name, age, address
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();  // 'Ben Blanc\n'
        System.out.println("Enter age");
        byte age = input.nextByte(); //'100\n'
        input.nextLine(); //consume '\n'
        System.out.println("Enter address");
        String address = input.nextLine();

        System.out.println("Name = " + name + ", Age = " + age + ", Address = " + address);
    }

}

//class Two{}
