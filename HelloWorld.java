import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.NoSuchElementException;
//import java.util.Random;
import java.util.concurrent.TimeUnit;




public class HelloWorld {
   public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.
      System.out.println("Hello, World.");
	  Date currentTime = new Date();
	  System.out.println(currentTime);
	  System.out.println(currentTime.getTime());
   }
}


//Date d1 = ...;
//Date d2 = ...;
//long seconds = (d2.getTime()-d1.getTime())/1000;