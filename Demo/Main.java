class Person{
    private int age;
    public int get(){   //get fun
        return age;
    }
    public void set(int newage){  //set fun where var is display
        this.age=newage;
        System.out.print(age);  } }
public class Main{
    public static void main(String[] args) {
        Person obj=new Person();
        obj.get();
        obj.set(21);    } }
