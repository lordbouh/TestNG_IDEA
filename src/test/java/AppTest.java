//package ru.skillfactory.qajava.maven;

import org.example.App;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.DataProvider;

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
    @DataProvider(name = "sumProvider")
     Object[][] dataProvider(){
        return new Object[][]{
                {10,30,40},
                {0,0,0},
                {-10,10,0}
        };
    }

    @Test(dataProvider = "sumProvider")
    public void testSum(int arg1, int arg2, int expected){
        int sum = App.sumNumbers(arg1,arg2);
        System.out.println(sum);
        assertEquals(sum, expected);
    }
}
