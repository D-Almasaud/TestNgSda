package sda.tests.Day16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C03UsingParameters {


    @Test
    @Parameters("name")
    public void parameterizedTest(String name){
        System.out.println("Welcome"+name);
    }
    @Test
    @Parameters({"name","surname","age"})
    public void parameterizedTest(String name, String surname , String age){
        System.out.println("Hello"+name +" "+ surname+" "+age);
    }
}
