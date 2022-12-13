package GroceryListApp;

// TODO: hashmap
// TODO: keys are the grocery types
// TODO: keys contain array lists

import grades.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class groceryApp {
        static HashMap<String, HashMap<String, ArrayList<String>>> yourLists = new HashMap<>();

//
//    Object firstKey = myHashMap.keySet().toArray()[0];
//    Object valueForFirstKey = myHashMap.get(firstKey);
//

    // TODO: create a method of get in for selection, to get index of selection
    // TODO: cycle through lists using this method, need to add a remove, using key words to check first
    // TODO: add method of finalizing a list as a method

    public static void main(String[] args) {



    }

    public void welcome(){
        System.out.println("Welcome to the List app");
        stageOne();
    }

    public void startApp(){

    }

    public void stageOne(){
        System.out.println("View the following lists or Add a new one");
        viewLists();
    }

    public void addList(String input){
        yourLists.put( input , new HashMap<>());
    }

    public void addCatagory(String list ,String input){
        yourLists.get(list).put(input, new ArrayList<>());
    }

    public void addItem(String list, String catagory, String item){
        yourLists.get(list).get(catagory).add(item);
    }

    public void removeList(String input){
        yourLists.remove(input);
    }

    public void removeCatagory(String list ,String input){
        yourLists.get(list).remove(input);
    }

    public void removeItem(String list, String catagory, String item){
        int temp = yourLists.get(list).get(catagory).lastIndexOf(item);
        yourLists.get(list).get(catagory).remove(temp);
    }

    public void viewLists(){
        int count = 0;
        for (Map.Entry<String, HashMap<String,ArrayList<String>>> e: yourLists.entrySet()) {
            System.out.println(count + " - "+e.getKey());
        }
    }

    public void viewCatagorys(String list){
        for (Map.Entry<String, ArrayList<String>> e: yourLists.get(list).entrySet()) {
            System.out.println("- "+e.getKey());
        }
    }

    public void viewItems(String list, String catagory){
        ArrayList<String> temp = yourLists.get(list).get(catagory);
        Object [] array = temp.toArray();
        for (Object s : array) {
            System.out.println("- "+s);
        }
    }
}
