package persons;

public class Teacher extends Person {
    private String specialty;

    public String getSpecialty() {
        return specialty;
    }

    public Teacher(String name, int age, String specialty){
        super(name,age);
        this.specialty = specialty;
    }

    @Override
    public String toString(){
        return "Prof. " + this.getName() + ", " + this.specialty;
    }
}
