package lists;

import java.util.ArrayList;

public class FindMinDoubleMain {
    public static void main(String[] args) {
            ArrayList<Double> listOfDouble = new ArrayList<Double>();
            listOfDouble.add(6.0);
            listOfDouble.add(3.0);
            listOfDouble.add(14.0);
            listOfDouble.add(2.0);
            listOfDouble.add(8.0);
            listOfDouble.add(6.0);
            listOfDouble.add(9.0);
            double min = listOfDouble.get(0);
            for(double currentValue : listOfDouble){
                if(currentValue < min){
                    min = currentValue;
                }
            }
            System.out.println("Min value in list : " + min);
    }
}
