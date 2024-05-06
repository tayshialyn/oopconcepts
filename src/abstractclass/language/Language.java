package abstractclass.language;

public abstract class Language {

    // method SIGNATURE that belongs to the Language class
    public abstract void greeting(String value);

    // method DEFINITION that belongs to the Language class

    public void welcomeUser(String value) {
        System.out.println("Welcome to Java OOP, " + value);
    }
}

// 1. You CANNOT create an instance of an Abstract class
// 2. You CANNOT creata a body for an Abstract method (it's a signature)
// 3. But, you CAN create a method definition within an abstract class