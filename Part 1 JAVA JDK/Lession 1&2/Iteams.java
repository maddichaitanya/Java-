import java.util.Scanner;

public class Iteams {
    // home work
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pen cost : ");
        float pen = sc.nextFloat();
        System.out.println("Enter pencile cost : ");
        float pencile = sc.nextFloat();
        System.out.println("Enter eraser cost : ");
        float eraser = sc.nextFloat();

        float total = pen + pencile + eraser;
        System.out.println("Bill : " + total);

        float newtotal = total + (18f * total);
        System.out.println("new total with 18% gst : " + newtotal);

    }
}
