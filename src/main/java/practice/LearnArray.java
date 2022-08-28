package practice;

import java.util.Arrays;
import java.util.Collections;

public class LearnArray {
    //Sorting Elements in an Array
    public void sortArray(){
        String[]states = { "Florida", " California", "Georgia","Texas"};
        Arrays.sort(states);
        //Print elements in array without loop
        System.out.println(Arrays.toString(states));
    }

    //Sorting Elements in an Array in Descending order
    public void sortArrayInDescendingOrder() {
        String[] states = { "Florida", "California", "Georgia", "Texas"};
        Arrays.sort(states, Collections.reverseOrder());
        //Print elements in array without loop
        System.out.println(Arrays.toString(states));
    }
}
