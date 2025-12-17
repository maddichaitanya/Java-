class Pattern{
    public static void main(String args[]){
        char a='A';
        for(int i = 4; i >= 0 ; i--){
            for(int j = 1; j <= i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println(" ");
        }
    }
}
