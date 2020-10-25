package kata01;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Raul Vega", new Date(100,1,28)); //A year y is represented by the integer y + 1900;
        System.out.println(person.getName() + " is " + person.getAge() + " years old");
    }
}