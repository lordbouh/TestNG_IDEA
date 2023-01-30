//package ru.skillfactory.qajava.maven;

import org.example.App;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertEquals;

public class AppTest {
    public static void currentTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
        currentTime();
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
        currentTime();
    }
    @Test
    public void testSum(){
        int sum = App.sumNumbers(10,30);
        assertEquals(sum,40);
    }
}
