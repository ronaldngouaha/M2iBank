package com.m2i.course4;

import java.time.ZonedDateTime;
import java.time.ZoneId;


public class ExempleZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("America/Montreal"));
        System.out.println("ZonedDateTime : " + zoned);
    }
}
