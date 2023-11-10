/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_glu_cosd;

/**
 *
 * @author sophie
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    static int totalPerformances = 0;
    
    public Singer(String name, Song favoriteSong){
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
        this.favoriteSong = favoriteSong;
    } 
    
    public void performForAudience(int nPeople){
        setEarnings(earnings + (nPeople * 100));
        setNoOfPerformances(noOfPerformances + 1);
        System.out.println(name + " has performed for " + nPeople + " people.");
        totalPerformances += 1;
    } 
        
    public void performForAudience(int nPeople, Singer duo){
        double profitSplit = nPeople * 100 / 2;
        setEarnings(earnings + profitSplit);
        duo.setEarnings(duo.getEarnings() + profitSplit);
        setNoOfPerformances(noOfPerformances + 1);
        duo.setNoOfPerformances(duo.getNoOfPerf() + 1);
        System.out.println(name + " and " + duo.getName() + " have performed for " + nPeople + " people.");
        System.out.println(String.format("%s and %s split the profit and gained %f each.",name,duo.getName(),profitSplit));
        totalPerformances += 1;
    } 
    
    public void changeFavSong(Song favS){
       favoriteSong = favS;
    }
    
    
    
    public int getNoOfPerf(){
        return this.noOfPerformances;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getEarnings(){
        return this.earnings;
    }
    
    public Song favoriteSong(){
        return this.favoriteSong;
    }

    /**
     * @param noOfPerformances the noOfPerformances to set
     */
    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }

    /**
     * @param earnings the earnings to set
     */
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
       
    
    
}
