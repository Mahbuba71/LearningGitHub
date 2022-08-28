package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {
    public static void main(String[]args){
        //Creating Array
        String[] array = {"Java", "Python","PHP","C++"};
        System.out.println("Printing Array:" + Arrays.toString(array));
        //Converting Array to list
        List<String> list = new ArrayList<String>();
        for(String lang:array){
            list.add(lang);
        }

        System.out.println("Printing List: "+list);
    }
}
