package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

                CellPhone phone1 = new CellPhone();
                CellPhone phone2 = new CellPhone();

                Scanner myscanner = new Scanner(System.in);

                System.out.println("What is the serial number for phone 1? ");
                int serialNumber = myscanner.nextInt();
                phone1.setSerialNumber(serialNumber);
                myscanner.nextLine();

                //second question and scanner
                System.out.println("What model is the phone? ");
                String model = myscanner.nextLine();
                phone1.setModel(model);


                //third question and scanner
                System.out.println("Who is your carrier? ");
                String carrier = myscanner.nextLine();
                phone1.setCarrier(carrier);


                //fourth question and scanner
                System.out.println("What is your phone number? ");
                String phoneNumber = myscanner.nextLine();
                phone1.setPhoneNumber(phoneNumber);

                //fifth question and scanner
                System.out.println("who is the owner of the phone");
                String owner = myscanner.nextLine();
                phone1.setOwner(owner);


                System.out.println("What is the serial number for phone 2? ");
                serialNumber = myscanner.nextInt();
                phone1.setSerialNumber(serialNumber);
                myscanner.nextLine();

                //second question and scanner
                System.out.println("What model is the phone? ");
                model = myscanner.nextLine();
                phone2.setModel(model);


                //third question and scanner
                System.out.println("Who is your carrier? ");
                carrier = myscanner.nextLine();
                phone2.setCarrier(carrier);


                //fourth question and scanner
                System.out.println("What is your phone number? ");
                phoneNumber = myscanner.nextLine();
                phone2.setPhoneNumber(phoneNumber);

                //fifth question and scanner
                System.out.println("who is the owner of the phone");
                owner = myscanner.nextLine();
                phone2.setOwner(owner);




        System.out.println("What is the serial number for phone 2? ");
        serialNumber = myscanner.nextInt();
        phone1.setSerialNumber(serialNumber);
        myscanner.nextLine();

        //second question and scanner
        System.out.println("What model is the phone3? ");
        model = myscanner.nextLine();
        phone2.setModel(model);


        //third question and scanner
        System.out.println("Who is your carrier? ");
        carrier = myscanner.nextLine();
        phone2.setCarrier(carrier);


        //fourth question and scanner
        System.out.println("What is your phone number? ");
        phoneNumber = myscanner.nextLine();
        phone2.setPhoneNumber(phoneNumber);

        //fifth question and scanner
        System.out.println("who is the owner of the phone");
        owner = myscanner.nextLine();
        phone2.setOwner(owner);


                phone1.dial(phone2.getPhoneNumber());
                phone2.dial(phone1.getPhoneNumber());



            }
            public static void display(CellPhone phone) {
                System.out.println("Cellphone information: ");
                System.out.println("Serial number: " + phone.getSerialNumber());
                System.out.println("Model: " + phone.getModel());
                System.out.println("Phone mumber: " + phone.getPhoneNumber());
                System.out.println("Owner: " + phone.getOwner());



            }
}