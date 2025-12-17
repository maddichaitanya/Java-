class Details{

    int roll;
    String name;
    int marks;
}

public class Student{

public static void main(String[] args){

    Details s1=new Details();
    s1.roll=1;
    s1.name="chiku";
    s1.marks=78;

    Details s2=new Details();
    s2.roll=2;
    s2.name="nanu";
    s2.marks=78;

    Details s3=new Details();
    s3.roll=3;
    s3.name="kana";
    s3.marks=89;

    Details[] st=new Details[3];   //array of  student 
    st[0]=s1;
    st[1]=s2;
    st[2]=s3;

    for(int i=0;i<st.length;i++){

           System.out.println(st[i].roll + " " + st[i].name + " " + st[i].marks);
}


// for (Details d : st) {
//     System.out.println(d.roll + " " + d.name + " " + d.marks);
// }
}
}