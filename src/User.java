/**
 * Created by praktyka on 20.05.2019.
 */


public class User extends Person{

    public String name;

    public String password;


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }


    @Override
    void printSomething() {
        System.out.println("PrintSomething");
    }
}
