package com.designPattern.Builder;

public class Shop {

    public static void main(String[] args) {

        Phone phone1 = new PhoneBuilder().setOs("Android").setCamera(20).build();
        System.out.println(phone1);

        Phone phone2 = new PhoneBuilder().setOs("Android").setBattery(5000).build();
        System.out.println(phone2);

        Phone phone3 = new PhoneBuilder().setOs("IOS").setBattery(5000).setCamera(20).build();
        System.out.println(phone3);

        Phone phone4 = new PhoneBuilder().setProcessor("SnapDragon").setScreenSize(5.5).build();
        System.out.println(phone4);
    }
}
