package com.epam.tamentoring.journeyplanner;

/**
 * Jouney Planner Main
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        System.out.println("Pick From address");
        Address from=AddressPicker.pickAddress();
        System.out.println("Pick To address");
        Address to=AddressPicker.pickAddress();
        System.out.println("From: " + from.toString() + "To: " + to.toString());

    }
}
