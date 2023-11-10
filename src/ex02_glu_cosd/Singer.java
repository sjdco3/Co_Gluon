/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_glu_cosd;

/**
 *
 * @author sophie
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String n, Song f){
        name = n;
        noOfPerformances = 0;
        earnings = 0;
        favoriteSong = f;
    } 
    
    public void performForAudience(int nPeople){
        earnings = earnings + (nPeople * 100);
        noOfPerformances += 1;
        System.out.println(name + " has performed for " + nPeople + " people");
    }
    
    public void changeFavSong(Song favS){
       favoriteSong = favS;
    }
}
