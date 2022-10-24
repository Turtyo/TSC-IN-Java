package persons;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class Club {
    private String name;
    private TreeMap<String,Person> members;

    public Club(String name){
        this.name = name;
        members = new TreeMap<String,Person>();
    }

    public void enroll(Person person){
        this.members.put(person.getName(),person);
    }

    public Double meanAge(){
        Double mean = 0.;
        int numberOfMembers = this.members.size();
        if(numberOfMembers == 0){
            return 0.;
        }
        for(Map.Entry<String,Person> entry: this.members.entrySet()){
            mean = mean + entry.getValue().getAge();
        }
        return mean/numberOfMembers;
    }

    public void display(){
        System.out.println(this.name);
        Set<String> names = this.members.keySet();
        System.out.println("");
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("");
        System.out.println(this.meanAge());
    }
}
