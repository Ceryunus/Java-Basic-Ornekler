import java.time.LocalTime;

public class MyClock {
public static void main(String[] args) {
LocalTime time = LocalTime.now();
System.out.println(time);
LocalTime time2 = LocalTime.of(5, 20);
System.out.println(time2);
System.out.println(time.getClass().getSimpleName());


}
	

}
