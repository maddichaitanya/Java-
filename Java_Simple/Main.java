
public class Main {
    static int factorial(int n) {
    if (n > 1) {
      return n * factorial(n - 1);
          } 
    else {
      return 1;
            }
      }
    public static void main(String[] args) {
      int i=121;
      //while(i<5){
      //System.out.println("Hello, World! : " + i );
      //i++; }
    /* do{
      System.out.println("Hello, World! : " + i );
      i++;
    } while(i<5); 
    String result=(i % 2==0)?"even":"odd";*/ 
    System.out.println(factorial(6));
    Boolean result=true;
    if(i<=1){
     result= false;
    }
   else { 
    for(int k=2;k<=i/2;k++){
      
      if(i % k == 0){
         result= false;
         break;
      }
    } }
    String resu=(result)?"prime":"no prime";
    System.out.println(resu);
    }
}
