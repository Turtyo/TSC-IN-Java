public class HelloArgsMain {
    public static void main(String[] args) {
        System.out.print("Hello to ");
        int maxIndex = args.length;
        for(int index = 0; index < maxIndex -1; index++){
            System.out.print(args[index] + " and ");
        }
        System.out.println(args[maxIndex -1] + " !");
    }
}
