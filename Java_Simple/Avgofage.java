class Avgofage{
    public static void main(String[] args){
        int[] ages={10,20,30,40,50};
        int avg,sum=0;   
        int leng=ages.length;
        for(int age:ages){  //for-each 
            sum += age;
        }
         avg=sum/leng;
        System.out.println("Avg of ages: "+ avg);
    }
}