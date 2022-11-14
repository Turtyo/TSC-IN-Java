package persons;

import java.io.IOException;
import java.util.ArrayList;

public class PersonReaderMain {
    public static void main(String[] args) throws IOException{
        ArrayList<Person> listOfPeople = PersonReader.read("./data/wrongFormat_1.txt");
        for(Person somePerson: listOfPeople){
            System.out.println(somePerson);
        }
    }
}
