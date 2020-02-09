import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Pokemon{

    public String setName(){
        String name;
        final Scanner in = new Scanner(System.in);
        System.out.print("Enter your name :");
        name = in.next();
        
        return " " ;
    }
    //=====================Pokemon Starter=========================
    public String charmander(){
        String namemon1 = "charmande";

        int   hp1 = 86;
        int   cp1 = 102;
        System.out.println(namemon1);
        System.out.println("HP : "+hp1);
        System.out.println("CP : "+cp1);
        return " ";
     }

     public String Squirtle(){
        String namemon2 = "Squirtle";
        int   hp2 = 84;
        int   cp2 = 105;
        System.out.println(namemon2);
        System.out.println("HP : "+hp2);
        System.out.println("CP : "+cp2);
        return " ";
     }

    
     public String Pikachu(){
        String namemon3 = "Pikachu";
        int   hp3 = 102;
        int   cp3 = 110;
        System.out.println(namemon3);
        System.out.println("HP : "+hp3);
        System.out.println("CP : "+cp3);
        return " ";
     }
    //============================================================
    public String choosePokemon(){
        int threepokemon[];
        int x;
        System.out.println("Choose Your Pokemon");
            System.out.println("\t1. Charmander");
            System.out.println("\t2. Squirtle");
            System.out.println("\t3. Pikachu");

        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter Pokemon (1,2,3) : ");
        x = in1.nextInt();
        if(x == 1){
            //System.out.println("NAME"+setName(name));
            charmander();
          }
        else if(x == 2){
            //System.out.println("NAME"+setName(name));
            Squirtle();
          }
        else if(x == 3){
            //System.out.println("NAME"+setName(name));
            Pikachu();
          }
        else {
            System.out.println("Error"); 
        }
        return " ";    
    }
    
}