package classex;

import java.lang.reflect.Constructor;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Person person = new Person("James");
        System.out.println(person);

        Class c1 = Class.forName("classex.Person");
        Person person1 = (Person) c1.newInstance();
        System.out.println(person1);
    }
}
