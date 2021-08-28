package com.company;

public class Main {

    public static void main(String[] args) {
        Monitor device1 = new Monitor("LG", 21);
        Monitor monitor1 = new Monitor(27);
//      device1.size = 27;
        System.out.println(device1.getSize());
        device1.setSize(27);
        System.out.println(device1.getSize());
        System.out.println(monitor1.getSize());
        Admin admin = new Admin();
        admin.setRole("SuperAdmin");
        System.out.println(admin.getRole());
    }
}
