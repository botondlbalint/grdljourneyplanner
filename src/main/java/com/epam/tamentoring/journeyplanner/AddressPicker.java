package com.epam.tamentoring.journeyplanner;

import com.epam.tamentoring.addressservice.AddressFinder;

import java.util.Scanner;

/**
 * Created by Botond_Balint on 2/27/2016.
 */
public class AddressPicker {
    public static Address pickAddress(){
        System.out.println("Please provide some information about the address:");
        //dumbAddressPicker
        System.out.println("\t zip code");
        Scanner input = new Scanner(System.in);
        String zipCode = null;
        if (input.hasNextLine()) {
            zipCode = input.nextLine();
        }
        int i = 0;
        System.out.println("Choose street by its number");
        String[] addressOptions = AddressFinder.getAddressOptions(zipCode);
        for (String s : addressOptions) {
            i++;
            System.out.printf("%d. %s, %s\n", i, zipCode, s);
        }
        ;


        String streetName = null;
        int chosenOption = 0;
        if (input.hasNextInt()) {
            chosenOption = input.nextInt();
            input.nextLine();
            if ((chosenOption < 1) || (chosenOption > i)) throw new IllegalArgumentException();
            streetName = addressOptions[chosenOption - 1];
        }


        System.out.println("Introduce house number");
        String houseNumber = null;
        if (input.hasNextLine()) {
            houseNumber = input.nextLine();
        }
        return new Address(zipCode, streetName, houseNumber);


//        enhance address picker using newer version of AddressFinder library
//        System.out.print("\t zip code,street name");
//        Scanner input = new Scanner(System.in);
//        String zipCodeAndStreename = null;
//        if (input.hasNextLine()) {
//            zipCodeAndStreename = input.nextLine();
//        }
//
//        String[] addressLines = zipCodeAndStreename.split(",");
//        if (addressLines.length == 2) {
//            System.out.println("Pick a house number from the below options");
//            String[] addressOptions = AddressFinder.getAddressOptions(addressLines[0], addressLines[1]);
//            for (String s : addressOptions) {
//                System.out.printf("%s\n", s);
//            }
//            ;
//        } else {
//            if (addressLines.length == 1) {
//                int i = 0;
//                System.out.println("Choose street by its number");
//                String[] addressOptions = AddressFinder.getAddressOptions(addressLines[0]);
//                for (String s : addressOptions) {
//                    i++;
//                    System.out.printf("%d. %s, %s\n", i, addressLines[0], s);
//                }
//                ;
//
//
//                String streetName = null;
//                int chosenOption = 0;
//                if (input.hasNextInt()) {
//                    chosenOption = input.nextInt();
//                    input.nextLine();
//                    if ((chosenOption < 1) || (chosenOption > i)) throw new IllegalArgumentException();
//                    streetName = addressOptions[chosenOption - 1];
//                }
//                System.out.println("Pick a house number from the below options");
//                addressOptions = AddressFinder.getAddressOptions(addressLines[0], streetName);
//                for (String s : addressOptions) {
//                    System.out.printf("%s\n", s);
//                }
//            }
//        }
//        String houseNumber = null;
//        if (input.hasNextLine()) {
//            houseNumber = input.nextLine();
//        }
//        return new Address(addressLines[0], addressLines[0], houseNumber);

    }

}
