package a;

import com.two.bean.Person;

import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger LOGGER= Logger.getLogger("Hello World");
    public static void main(String[] args) {
        System.out.println("Hello");
        Person person = new Person();
        System.out.println(person);
    }
}
