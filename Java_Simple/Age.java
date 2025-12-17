class Age{
    public static void main(String[] args){
        int[] ages={10,20,30,40,50};
        int maxage=ages[0];
        int minage=ages[0];
        for(int age:ages){
            if(age>maxage){
                maxage=age; }
            if(age<minage){
                minage=age;  }
                }
             System.out.println("max age of array: "+maxage);
             System.out.println("min age : "+ minage);
    }
}