////////////////////////////////////////
//
// Chii Miigwetch Nibi Manidoowi
//
////////////////////////////////////////
//
// Source of formula, concepts, and constants used.
// https://patents.google.com/patent/US20060014125A1/en
//
////////////////////////////////////////
//
//  This was written while waiting in line for
//    fry bread at the Grand Rapids Pow-wow...
//      ...also while eating frybread...
//        ...and wild rice soup! xD ...
//
////////////////////////////////////////

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
		
		
		//Variables
		// L = length of stride
		// W = mass
		// Mw = walking momentum goal for water to pass boundary
		//	 M = (point "e" at boundary) = 2.176634194*10^-8 kg*m/sec
		//	 w = walking momentum ratio = e^21.572952 = 2338912700
		
		Double Mw = 50.909573606; //kg*m/sec <---POINT "E"  
		Double MwConversion = Mw * 7.233015323; //ft*lbs/sec
		
		
		        Double T = 1.0; //second 
		
		
		// L = (Mw/W) * T
        System.out.println("");
		    System.out.println("Kilograms or Pounds?");
				String kilogramsOrPounds = in.nextLine();

        Double W = 1.0;
        Double WPounds = 1.0;

        int kPCount = kilogramsOrPounds.length();

        if ( kPCount > 6 ) {
          	System.out.println("");
    System.out.println("So it begins...");
		System.out.println("");
	  System.out.println("Weight in kilograms: ");
		W = in.nextDouble();
        } else {
            System.out.println("");
    System.out.println("So it begins...");
		System.out.println("");
		System.out.println("Weight in pounds: ");
    WPounds = in.nextDouble();
        }
		
		
		
		
		//THE CALCULATION
		//SACRED MUSIC WITH CLAPPING AND SHIT
		
    Double L = 1.0;
    Double LConverted = 1.0;

    if (kPCount > 6 ) {
        L = ( Mw / W ) * T;
    } else {
        LConverted = ( MwConversion / WPounds) * T;
    }
		
		
		//IMAGINE OOOO's and AAAHHH's
		
		
		
		//Output of length for steps per second
		System.out.println(".....here you are child.....");
		System.out.println("");
		System.out.println("..its been a long journey, and we still have a long way to go..");
		System.out.println("");

    if (kPCount > 6 ) {
        System.out.println("Each second you must place your heel a distance of " + L + " meters in order to \"walk\" with the creator..");
    } else {
        System.out.println("Place your heel every " + LConverted + " feet each second in order to \"walk\" the Manidoo way");
    }
		


  }
}
