package persons;

public class Person {
    private String name;
    public String getName() {
        return name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return this.name + " : " + this.age + " ans";
    }

    public void display(){
        System.out.println(this);
    }
    
}
