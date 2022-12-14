package GroceryListApp;

// TODO: hashmap
// TODO: keys are the grocery types
// TODO: keys contain array lists

import grades.Student;
import util.Input;

import java.util.*;

public class groceryApp {
        static HashMap<String, HashMap<String, ArrayList<String>>> yourLists = new HashMap<>();
        static boolean firstLoad = true;


    // TODO: add logic for stage 3

    public static void main(String[] args) {
        if (firstLoad){
            welcome();
            firstLoad = false;
        }
        startApp();

    }

    public static void welcome(){
        System.out.println("Welcome to the List app");
        System.out.println("Lets set up your first list");
        System.out.println("Enter the name of your first List");
        String userList = Input.getString().toLowerCase();
        addList(userList);
    }

    public static void startApp(){
        stageOne();
    }

    public static void stageOne(){
        System.out.println("View the following lists or Add a new one");
        System.out.println("Lists:\n");
        viewLists();
        System.out.println("----------------------------");
        System.out.println("Type the list you would like to open OR type \"Add\" / \"Delete\" to modify your lists");
        String answer = Input.getString().toLowerCase();
        if (Objects.equals(answer, "add")){
            System.out.println("Enter the new list name");
             String newList =Input.getString();
             addList(newList);
             stageOne();
        }
        else if (Objects.equals(answer, "delete")){
            System.out.println("Which one would you like to delete?");
            String newList = Input.getString().toLowerCase();

            while (!yourLists.containsKey(newList)){
                System.out.println("Invalid, try again");
                newList = Input.getString().toLowerCase();
            }
            System.out.println("Are you sure?");
            if (Input.yesNo()){
                removeList(newList);
                stageOne();
            }
            else {
                stageOne();
            }
        }
        else{
            while(!yourLists.containsKey(answer)){
                System.out.println("Invalid entry, please try again");
                answer = Input.getString().toLowerCase();
            }
            stageTwo(answer);
        }
    }

    public static void stageTwo(String list){
        System.out.println();
        System.out.println("These are the current categories you have in the list");
        System.out.println("---------------------");
        viewCatagorys(list);
        System.out.println("---------------------");
        System.out.println("Type in the category you would like to open OR type \"Add\" or \"Delete\" to modify or type \"Back\" to go back to lists");
        String answer = Input.getString().toLowerCase();
        if (answer.equals("add")){
            System.out.println("Type the category you would like to add");
            String newCat = Input.getString().toLowerCase();
            addCatagory(list, newCat);
            stageTwo(list);
        }
        else if (answer.equals("back")){
            stageOne();
        }
        else if (answer.equals("delete")){
            System.out.println("Which category would you like to delete?");
            String deleteAnswer = Input.getString().toLowerCase();
            while (!yourLists.get(list).containsKey(deleteAnswer)){
                System.out.println("Invalid entry please try again");
                deleteAnswer = Input.getString().toLowerCase();
            }
            if(Input.yesNo()){
                removeCatagory(list, deleteAnswer);
                stageTwo(list);
            }
            else{
                stageTwo(list);
            }
        }
        else{
            if(!yourLists.get(list).containsKey(answer)){
                System.out.println("Invalid entry \n Please try again");
                stageTwo(list);
            }
            else{
                stageThree(list,answer);
            }
        }
    }

    public static void stageThree(String list, String catagory){

    }


    public static void addList(String input){
        yourLists.put( input , new HashMap<>());
    }

    public static void addCatagory(String list ,String input){
        yourLists.get(list).put(input, new ArrayList<>());
    }

    public void addItem(String list, String catagory, String item){
        yourLists.get(list).get(catagory).add(item);
    }

    public static void removeList(String input){
        yourLists.remove(input);
    }

    public static void removeCatagory(String list ,String input){
        yourLists.get(list).remove(input);
    }

    public void removeItem(String list, String catagory, String item){
        int temp = yourLists.get(list).get(catagory).lastIndexOf(item);
        yourLists.get(list).get(catagory).remove(temp);
    }

    public static void viewLists(){
        for (Map.Entry<String, HashMap<String,ArrayList<String>>> e: yourLists.entrySet()) {
            System.out.println(" - "+e.getKey());
        }
    }

    public static void viewCatagorys(String list){
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
