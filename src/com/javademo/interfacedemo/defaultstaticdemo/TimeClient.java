package com.javademo.interfacedemo.defaultstaticdemo;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int year, int month, int day);
    void setDateTime(int year, int month, int day, int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
    
    
    // default and static methods in interface
    default ZonedDateTime getZonedDateTime(String zonedString) {
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zonedString));
    }
        
    static ZoneId getZoneId(String zoneString){
        try {
            return ZoneId.of(zoneString);
        } catch(DateTimeException | NullPointerException exception) {
            System.out.println("Empty or Invalid Zone String provided, using system default");
            return ZoneId.systemDefault();
        }
    }
}
