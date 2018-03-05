import java.util.Scanner;
import java.lang.Math;
/**
 * Returns most valuable combination of material haul. [with a carrying capacity]
 *
 * @author Jose Reyes
 * @version 02/01/2018
 */
public class GreedyGerbils
{
    // Main method
    public static void main(String[] args){
        // Carrying capacity
        int carryCap = 10;
        
        // Mineral supply
        int rhodSupply;
        int platSupply;
        int goldSupply;
        int ironSupply;
        
        // Mineral Haul
        int rhodHaul = 0;
        int platHaul = 0;
        int goldHaul = 0;
        int ironHaul = 0;
        
        // Storing initial mineral supply
        Scanner scnr = new Scanner(System.in);
        System.out.println("Input the total ounces for each metal:");
        System.out.print("Enter rhodium: ");
        rhodSupply = scnr.nextInt();        
        System.out.print("Enter platinum: ");
        platSupply = scnr.nextInt();
        System.out.print("Enter gold: ");
        goldSupply = scnr.nextInt();
        System.out.print("Enter iron: ");
        ironSupply = scnr.nextInt();
        
        if (rhodSupply > 0 && carryCap > 0 && (rhodSupply <= carryCap)){
            rhodHaul+=rhodSupply;
            carryCap-=rhodSupply;
        } else if(rhodSupply > 0 && carryCap > 0 && (rhodSupply >= carryCap)){
            rhodHaul+=rhodSupply - (rhodSupply - carryCap);
            carryCap-=rhodSupply;
        }
        
        if (platSupply > 0 && carryCap > 0 && (platSupply <= carryCap)){
            platHaul+=platSupply;
            carryCap-=platSupply;
        } else if(platSupply > 0 && carryCap > 0 && (platSupply >= carryCap)){
            platHaul+=platSupply - (platSupply - carryCap);
            carryCap-=platSupply;
        }
        
        if (goldSupply > 0 && carryCap > 0 && (goldSupply <= carryCap)){
            goldHaul+=goldSupply;
            carryCap-=goldSupply;
        } else if(goldSupply > 0 && carryCap > 0 && (goldSupply >= carryCap)){
            goldHaul+=goldSupply - (goldSupply - carryCap);
            carryCap-=goldSupply;
        }
        
        if (ironSupply > 0 && carryCap > 0 && (ironSupply <= carryCap)){
            ironHaul+=ironSupply;
            carryCap-=ironSupply;
        } else if(ironSupply > 0 && carryCap > 0 && (ironSupply >= carryCap)){
            ironHaul+=ironSupply - (ironSupply - carryCap);
            carryCap-=ironSupply;
        }
        
        // Prints final values
        System.out.println("The gerbil will return with " + rhodHaul
        + " Rhodium, " + platHaul + " Platinum, " + goldHaul + " Gold, " + ironHaul + " Iron.");
        
        
    }
}
