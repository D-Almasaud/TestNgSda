package sda.tests.Day18;

import org.testng.annotations.Test;

public class C01ParallelTest01  {
    @Test
    public void Test01(){
      String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 01"+threadsName);
    }
    @Test
    public void Test02(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 02"+threadsName);
    }
    @Test
    public void Test03(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 03"+threadsName);
    }
    @Test
    public void Test04(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 04"+threadsName);
    }

    @Test
    public void Test05(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 05"+threadsName);
    }
    @Test
    public void Test06(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 06"+threadsName);
    }

    @Test
    public void Test07(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 07"+threadsName);
    }
    @Test
    public void Test08(){
        String threadsName =Thread.currentThread().getName();
        System.out.println("Thread executing for test 08"+threadsName);
    }


}
