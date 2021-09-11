package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Declaring Variables
        Scanner input = new Scanner(System.in);
        String noun,verb,adjective,adverb;

        //Noun Query
        System.out.println("Enter a noun:");
        noun = input.nextLine();

        //Verb Query
        System.out.println("Enter a verb:");
        verb = input.nextLine();

        //Adjective Query
        System.out.println("Enter an adjective:");
        adjective = input.nextLine();

        //Adverb Query
        System.out.println("Enter an adverb:");
        adverb = input.nextLine();

        //Final output
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + " That's hilarious!");

    }
}
