package com.dti.sau;

public class Test02 {
    public static void main(String[] args) {
        DTI ob1 = new DTI();
        DTI ob2 = new DTI();
        DTI ob3 = new DTI();
        //-----------------------
        DTI info[] = new DTI[3];
        //-----------------------
        //info[0] = DTI();
        //info[1] = DTI();
        //info[2] = DTI();
        for(int i = 0; i < info.length; i++){
            info[i] = new DTI();
        }
    }
}
