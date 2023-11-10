//EX05_GLU_Co_SD

package ex05_glu_cosd;
/**
 *
 * @author sophie
 */
import java.util.*;

public class Item {
    private String name, type;
    private double cost;
    private static ArrayList<Item> completeItemList = new ArrayList();

    public Item(String name, String type, double cost){
        this.name = name;
        this.type = type;
        this.cost = cost;
        completeItemList.add(this);
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public double getCost(){
        return cost;
    }
    public static Item getItem(int index){
        return completeItemList.get(index);
    }
    public static void printAllItems(){
        for(Item i: completeItemList){
            System.out.printf("Name: %s%nType: %s%nCost:%.2f%n",i.getName(),i.getType(),i.getCost());
        }
    }
}
