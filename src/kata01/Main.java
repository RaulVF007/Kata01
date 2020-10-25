package kata01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args){
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2000,2,28);
        
        Person person = new Person("Raul Vega", date); 
        System.out.println(person.getName() + " is " + person.getAge() + " years old");
    }
}