package lists;

import java.util.ArrayList;

public class FindMinStringMain {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("fox");
        listOfStrings.add("dog");
        listOfStrings.add("cat");
        listOfStrings.add("hey");
        listOfStrings.add("longer");
        listOfStrings.add("ab");
        listOfStrings.add("aaa");
        
        String min = listOfStrings.get(0);
        for(String currenString : listOfStrings){
            if(min.compareTo(currenString) > 0){
                min = currenString;
            }
        }
        System.out.println("The min is : " + min);
    }
}
