import java.util.*;

class Fractional{

    public static void main(String args[]){

        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int f=1;

        for(int i=1;i<=num;i++){
                f=f*i;
        }

        System.out.println("Fractional value : "+f);
         sc.close();

        }
    }
