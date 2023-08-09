import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Please write the first word:");
//        String str1 = sc.nextLine();
//        System.out.println("Please write the second word:");
//        String str2 = sc.nextLine();
//        String str1Low = str1.toLowerCase();
//        String str1Up = str1.toUpperCase();
//
//        String str2Low = str1.toLowerCase();
//        System.out.println("I got the word " + str1);
//        System.out.println("In lower case = " + str1Low);
//        System.out.println("In upper case = " + str1Up);
//
//        String str1 = "hello";
//        String str2 = "hello";
//
//        System.out.println("Case sensitive check " + (str1.equals(str2) ? "equal" : "not equal"));
//        System.out.println("Not case sensitive check " + (str1.toLowerCase().equals(str2Low.toLowerCase()) ? "equal" : "not equal"));
//        System.out.println("Not case sensitive check " + (str1Low.equals(str2Low) ? "equal" : "not equal"));
//
//        System.out.println("First word has " + str1.length() + " letters");
//        System.out.println("Second word has " + str2.length() + " letters");
//        System.out.println(str1.indexOf("a"));
//        System.out.println(str1.trim());
//        System.out.println("first letter = " + str1.charAt(0));
//        System.out.println("last letter = " + str1.charAt(str1.length()-1));
//        System.out.println(str1.equals(""));
//        System.out.println(str1.isEmpty());
//        System.out.println(str1.substring(6));
//        System.out.println(str1.substring(6,10));
//
//        System.out.println("Please provide the start index");
//        int startIndex = sc.nextInt();
//        System.out.println(str1.substring(startIndex));
//
//        System.out.println("Please type your name:");
//        String name = sc.nextLine();
//        System.out.println("Please type your age");
//        int age = sc.nextInt();
//
//        String msgWithoutFormat = "Hello, " + name + " you are connected, and you are " + age + " years old";
//        System.out.println(msgWithoutFormat);
//        String msgWithFormat = String.format("Hello, %s you are connected, and you are %s years old",name,age);
//        System.out.println(msgWithFormat);
//
//        msgWithFormat = msgWithFormat.replaceAll(name,"Somebody");
//        System.out.println(msgWithFormat);
//
//        System.out.println("\"hello\"");
//        System.out.println(" hello \n world ");
//        System.out.println(" \\ hello \\ ");
//
//        String fullName = "Harry.Potter";
//        String firstName = fullName.substring(0,fullName.indexOf("."));
//        String lastname = fullName.substring(fullName.indexOf(".")+1,fullName.length());
//        String msg = String.format("Welcome to the course: your first name is: %s and your last name is: %s",firstName,lastname);
//        System.out.println(msg);
//

//        System.out.println(Math.sqrt(49));
//        System.out.println(Math.pow(3,3));
//        double randomNumber = Math.random();
//        System.out.println(randomNumber);
//        int randomNumberRounded = (int)Math.round(randomNumber);
//        int randomNumberCeil = (int)Math.ceil(randomNumber);
//        int randomNumberFloor = (int)Math.floor(randomNumber);
//        System.out.println("Rounded = " + randomNumberRounded);
//        System.out.println("Ceil = " + randomNumberCeil);
//        System.out.println("Floor = " + randomNumberFloor);

        int random = (int)(Math.random() * 10) + 1;

        LocalDate localDateNow = LocalDate.now();
        LocalTime localTimeNow = LocalTime.now();
        LocalDateTime localDateTimeNow = LocalDateTime.now();

//        System.out.println(localDateNow);
//        System.out.println(localTimeNow);
//        System.out.println(localDateTimeNow);


        LocalDate myLocalDate = LocalDate.of(2023,9,9);
        LocalDate myLocalDate2 = LocalDate.of(2023, Month.SEPTEMBER,9);
//        System.out.println(myLocalDate);

        LocalTime myLocalTime = LocalTime.of(18,23);
        LocalTime myLocalTime2 = LocalTime.of(17,15,45);
//        System.out.println(myLocalTime);
//        System.out.println(myLocalTime2);

        LocalDateTime myLocalDateTime = LocalDateTime.of(myLocalDate,myLocalTime);
        LocalDateTime myLocalDateTime2 = LocalDateTime.of(2022,3,15,17,35);

//        System.out.println(myLocalDateTime);
//        System.out.println(myLocalDateTime2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yy hh:mm a E");
        System.out.println(myLocalDateTime2);
        System.out.println(myLocalDateTime2.format(formatter));






















    }
}