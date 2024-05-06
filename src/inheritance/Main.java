package inheritance;

import inheritance.modal.Programmer;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        // create a new instance of Programmer
        Programmer programmer = new Programmer();
        System.out.println("Programmer's salary: " + programmer.printSalary());

        System.out.println("Programmer's bonus: " + programmer.signUpBonus);

        // create another new instance of Programmer (for overloading method)
        Programmer programmer2 = new Programmer();
//        programmer2.printsalary = 6000f;
        System.out.println(programmer2.printSalary(6000));    // prints 6000.0
        System.out.println(programmer2.printSalary());   // prints 7000.0 (from overriding of printSalary)
    }
}
