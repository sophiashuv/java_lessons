import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateConvertation {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println("Date is: " + date);

		dateToLocalDateTime(date);
		dateToLocalDate(date);
		dateToLocalTime(date);
	}

	public static void dateToLocalDateTime(Date date) {
		LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println("Local Date Time is: " +localDateTime);
	}

	public static void dateToLocalDate(Date date) {
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("Local Date is: "+localDate);
	}

	public static void dateToLocalTime(Date date) {
		LocalTime localTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
		System.out.println("Local Time is: "+localTime);
	}
}
