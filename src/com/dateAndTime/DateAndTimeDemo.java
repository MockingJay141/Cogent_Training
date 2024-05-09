package com.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * This is the class to the new Date and Time API features that were added in Java8
 * Like DateFormatter and Local and Zone time
 */
public class DateAndTimeDemo {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Current Date is: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Current Time is: " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time is: " + dateTime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(format);
        System.out.println("Formatted Date Time is: "+formattedDateTime);

        Month month = dateTime.getMonth();
        int day = dateTime.getDayOfMonth();
        int seconds = dateTime.getSecond();
        System.out.println("Month: " + month + " Day: " + day + " Seconds: " + seconds);

        LocalDate date1 = LocalDate.of(1950, 1, 26);
        System.out.println("Republic day: " + date1);

        LocalDateTime specificDate = dateTime.withDayOfMonth(24).withYear(2016);
        System.out.println("Specific Date with Current time: " + specificDate);
    }
}
