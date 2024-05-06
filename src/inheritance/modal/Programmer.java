package inheritance.modal;

public class Programmer extends Employee {

public int signUpBonus = 1000;     // signUpBonus is private

    // Method printSalary overrides the behaviour from Employee class
    @Override
    public float printSalary() {
        return salary + signUpBonus;
    }
}
