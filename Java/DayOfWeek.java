import java.time.LocalDate;

public class DayOfWeek {
    
        public static String findDay(int month, int day, int year){
            
            LocalDate lt = LocalDate.of(year,month,day);
            return lt.getDayOfWeek().name();
        }
        
    
}