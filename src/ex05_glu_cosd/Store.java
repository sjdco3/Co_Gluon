//EX05_GLU_Co_SD

package ex05_glu_cosd;
/**
 *
 * @author sophie
 */
import java.util.*;

public class Store {
    private final String name;
    private double earnings;
    private final ArrayList<Item> itemList;
    private static final ArrayList<Store> storeList = new ArrayList();

    public Store(String name){
        this.name = name;
        itemList = new ArrayList();
        storeList.add(this);
    }

    public String getName(){
        return name;
    }
    public double getEarnings(){
        return earnings;
    }
    public void sellItem(int index){
        if(index + 1 <= itemList.size()) {
            earnings += itemList.get(index).getCost();
            System.out.println(this.getName() + " sold " + itemList.get(index).getName() + " for " + itemList.get(index).getCost());
        } 
        else {
            System.out.println("There are only " + itemList.size() + " items in " + this.getName());
        }
    }
    public void sellItem(String name){
        boolean nameFound = false;
        Item selItem = null;
        for(Item i: itemList) {
            if (i.getName().equals(name)) {
                selItem = i;
                nameFound = true;
                break;
            }
        }
        if(nameFound) {
            earnings += selItem.getCost();
            System.out.println(this.getName() + " sold " + selItem.getName() + " for " + selItem.getCost());
        } 
        else {
            System.out.println(this.getName() + " does not sell " + name);
        }
    }
    
    public void sellItem(Item i){
        if(itemList.contains(i)) {
            earnings += i.getCost();
            System.out.println(i.getName() + " has been sold for " + i.getCost());
        } 
        else {
            System.out.println(this.getName() + " does not sell " + i.getName());
        }
    }
    
    public void addItem(Item i){
        itemList.add(i);
    }
    
    public void filterType(String type){
        for(Item i: itemList) {
            if(i.getType().equals(type)) {
                System.out.print(i.getName() + " ");
            }
        }
        System.out.print("\n");
    }
    
    public void filterCheap(double maxCost){
        for(Item i: itemList) {
            if(i.getCost() <= maxCost) {
                System.out.print(i.getName() + " ");
            }
        }
        System.out.print("\n");
    }
    
    public void filterExpensive(double minCost){
        for(Item i: itemList) {
            if(i.getCost() >= minCost) {
                System.out.print(i.getName() + " ");
            }

        }
        System.out.print("\n");
    }
    
    public static void printStats(){
        for (Store i: storeList) {
        System.out.println(i.getName() + " has a total earnings of " + i.getEarnings());
        }

    }
}
