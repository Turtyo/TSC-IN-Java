public class RGBequalsmain {
    public static void main(String[] args){
        RGB color1 = new RGB(0.1,0.2,0.3);
        RGB color2 = color1;
        RGB color3 = new RGB(0.1,0.2,0.3);
        RGB color4 = null;
        RGB color5 = new RGB(0,0,0);

        System.out.println("Color1 equals color2 : " + color1.equals(color2));
        System.out.println("Color1 equals color1 : " + color1.equals(color1));
        System.out.println("Color3 equals color1 : " + color3.equals(color1));
        System.out.println("Color2 equals color 4 : " + color2.equals(color4));
        System.out.println("Color1 equals color 5 : " + color1.equals(color5));
    }
}
