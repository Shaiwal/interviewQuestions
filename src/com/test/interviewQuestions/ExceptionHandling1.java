package com.test.interviewQuestions;

public class ExceptionHandling1 {

    public static void main(String[] args) 
    { 
        try
        { 
            System.out.printf("1"); 
            int sum = 9 / 0; 
            System.out.printf("2"); 
        } 
        catch(Exception e) 
        { 
            System.out.printf("4"); 
        }
       /*
        * unreachable code
        *  catch(ArithmeticException e) 
        
        { 
            System.out.printf("3"); 
        } */
        finally
        { 
            System.out.printf("5"); 
        } 
    } 
}
