class DArray{
    public static void main(String[] args){
        int[][] mynum={{1,2,3},{4,5,6,7}};
        for(int i=0;i<mynum.length;i++){
            for(int j=0;j<mynum[i].length;j++){
                System.out.println( "myNumbers[" + i + "][" + j + "] = " + mynum[i][j]);
            }
        } 
    }}