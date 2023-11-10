/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01_glu_cosd;

/**
 *
 * @author sophie
 */
public class EX01_GLU_CoSD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String player1 = "Luka Doncic";
        double height1 = 2.01;
        int age1 = 24;
        System.out.println("Basketball Player 1");
        System.out.println("Name: " + player1);
        System.out.println("Height: " + height1 + ' ' + 'm');
        System.out.println("Age: " + age1);
        System.out.println("");
        
        String player2 = "Lebron James";
        double height2 = 2.06;
        int age2 = 38;
        System.out.println("Basketball Player 2");
        System.out.println("Name: " + player2);
        System.out.println("Height: " + height2 + ' ' + 'm');
        System.out.println("Age: " + age2);
        System.out.println("");
        
        String player3 = "Kobe Bryant";
        double height3 = 1.98;
        int age3 = 41;
        System.out.println("Basketball Player 3");
        System.out.println("Name: " + player3);
        System.out.println("Height: " + height3 + ' ' + 'm');
        System.out.println("Age: " + age3);
        System.out.println("");
        
        System.out.print("Total ages of Lebron James and Kobe Bryant: ");
        System.out.println(age2 + age3);
        System.out.print("Luka Doncic is taller than Lebron James: ");
        System.out.println(age1 > age2);
        System.out.print("Lebron James is older than Luka Doncic: ");
        System.out.println(age2 > age1);
    }
    
}
