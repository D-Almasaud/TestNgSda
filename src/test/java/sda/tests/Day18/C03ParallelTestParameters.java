package sda.tests.Day18;

import org.testng.annotations.Test;

public class C03ParallelTestParameters {
    @Test(threadPoolSize = 4,invocationCount = 8,timeOut = 1000)
    public void test(){
        System.out.println("Thread Name is : "+Thread.currentThread().getId());
    }
}
