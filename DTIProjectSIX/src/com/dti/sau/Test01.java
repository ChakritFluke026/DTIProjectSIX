package com.dti.sau;

public class Test01 {
    public static void main(String[] args) {
        //Array is Data Structure เอามาใช้กับการเขียนโปรแกรมในเรื่องของตัวแปร, พารามิเตอร์
        //ตัวแปรแบบอาร์เรย์
        int aa;

        int bb[]; //หรือ int [] bb;
        bb = new int[5];

        int cc[] = new int [5];

        cc[0] = 111;
        cc[4] = 555;
        System.out.println(cc[0]);
        System.out.println(cc[4]);

        int dd[] = {10, 20, 30, 40, 50};

        System.out.println("bb มี" + bb.length);
        System.out.println("cc มี" + cc.length);
        System.out.println("dd มี" + dd.length);

    }
}
