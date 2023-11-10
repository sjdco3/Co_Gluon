//EX03_GLU_CoSD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03_glu_cosd;

/**
 *
 * @author sophie
 */
public class EX03_GLU_CoSD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasketballPlayer player1 = new BasketballPlayer();
        BasketballPlayer player2 = new BasketballPlayer();
        BasketballPlayer player3 = new BasketballPlayer();
        
        Song song1 = new Song("Dasal/Kasal", "OPM");
        Song song2 = new Song("Medisina", "OPM");
        
        Singer singer1 = new Singer("Zild", song1);
        singer1.performForAudience(12);
        singer1.changeFavSong(song2);
        Singer singer2 = new Singer("Zild2", song1);
        singer1.performForAudience(28,singer2);
    }
    
}
