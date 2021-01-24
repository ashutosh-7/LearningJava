package com.gravity.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorStart {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello there, Please Enter two numbers:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int number1=Integer.parseInt(br.readLine());
        int number2=Integer.parseInt(br.readLine());
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        CalculatorImpl obj=new CalculatorImpl();
        int decision=Integer.parseInt(br.readLine());
        System.out.print("Answer = ");
        switch (decision)
        {
            case 1:
            {
                System.out.print(obj.add(number1,number2));
                break;
            }
            case 2:
            {
                System.out.print(obj.sub(number1,number2));
                break;
            }
            case 3:
            {
                System.out.print(obj.mul(number1,number2));
                break;
            }
            case 4:
            {
                int answer = obj.mul(number1,number2);
                if(number1==1 || number2==1)
                {
                    System.out.println(answer);
                }
                else
                {
                    System.out.println("This is not a valid inputs, Please enter valid inputs.");
                }
                break;
            }
            default:{
                System.out.println("This is not a valid option");
                break;
            }
        }

    }
}
