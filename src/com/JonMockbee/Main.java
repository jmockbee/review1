package com.JonMockbee;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("value was 1");
//        } else if (value == 2) {
//            System.out.println("value was 2");
//        } else {
//
//            System.out.println(was not 1or 2);
//
//        }
        int switchValue = 4;

        switch (switchValue){
            case 1:
                System.out.println("Value was ");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3 ,4 or 5");
                break;
            default:
                System.out.println("was not one or two");
                break;
        }
        /// more code here after break;

    }

}

