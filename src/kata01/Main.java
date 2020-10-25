package kata01;

import java.time.LocalDate; 
import java.time.Month;
import java.time.Period;
import static java.util.Calendar.MONTH;

public class Main {
    public static void main(String[] args){
        LocalDate birthdate = LocalDate.of(2000, Month.FEBRUARY,28);
        LocalDate actualDay = LocalDate.now();
        
        Person person = new Person("Raul Vega", birthdate, actualDay);  
        System.out.println(person.getName() + " is " + person.getYears(birthdate, actualDay) + " years old");
    }
}