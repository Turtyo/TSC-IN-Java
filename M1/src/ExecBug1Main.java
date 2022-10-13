public class ExecBug1Main {
    public static void main(String[] args){
        int x = 2 ;
        double y = 3.0 / 4.0;
        double z = x / y;
        System.out.println(x + "/" + y + " = " + z);
    }
}
