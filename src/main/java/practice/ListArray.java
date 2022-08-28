package practice;

import java.util.ArrayList;
import java.util.List;

public class ListArray{
    List<String> lists = new ArrayList<String>();

     public void addValuetoThelist(){
         lists.add("one");
         lists.add("two");
         lists.add("three");
    }
    public void printValueFromTheList(){
         System.out.println(lists);

         for(String list: lists){
             System.out.println("Print Value using for loop: " + list);
         }

         for (int i = 0; i < lists.size(); i++){
             System.out.println("Print value using for loop indexing: " + lists);
         }

         for (int i = 0; i < lists.size(); i++){
             System.out.println("Print value using for loop indexing: " + lists.get(i));
         }
    }

    public void removeValueFromTheList() {
        lists.remove( "two");
        System.out.println(lists);
    }
}
