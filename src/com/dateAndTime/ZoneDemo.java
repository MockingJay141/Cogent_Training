package com.dateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This is the class that is used further show the demo of the Date and Time features added with Java8
 * More specifically it shows us ZonedDateTime which helps us get Date and Time for a specific time zone.
 *
 */
public class ZoneDemo {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(format);
        System.out.println("Formatted Date Time: " + formattedDateTime);

        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("Current Zone is: " + currentZone);


        //Here we are getting the TimeZone for Tokyo and displaying the Date and Time in Tokyo.
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
        System.out.println("Tokyo Time zone is: " + tokyoZone);
    }
}
