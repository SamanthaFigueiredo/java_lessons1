import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        
        LocalTime specificTime = LocalTime.of(10, 30); // Example: 10:30 AM


        
        int hour = specificTime.getHour();
        int minute= specificTime.getMinute();
        System.out.println("Specific Time : " + hour+ " : "+ minute);
    }
}
