package com.dti.sau;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //Exception Handling การจัดการข้อผิดพลาดที่เกิดขึ้นคณะโปรแกรมทำงาน ***

        double num1, num2;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ป้อนตัวเลขที่ 1: ");
            num1 = sc.nextDouble();
            System.out.println("ป้อนตัวเลขที่ 2: ");
            num2 = sc.nextDouble();
            System.out.println("----------------------------------");
            System.out.println("ผลหารของ " +num1+"/"+num2+" มีค่าเป็น " + (num1 / num2));
        }catch (InputMismatchException ex){
            System.out.println("มีข้อผิดพลาดจากการป้อน กรุณาป้อนแต่ตัวเลขเท่านั้น");
        }
        

    }
}
