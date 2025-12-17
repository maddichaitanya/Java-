public class TrapWater {
    public static int trapwater(int number[]) {

        int n = number.length;
        // calculate left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = number[0]; // first array of element
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(number[i], leftmax[i - 1]); // fing the max vlaue from left to right
        }
        // calculate right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = number[n - 1]; // last array of element
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(number[i], rightmax[i + 1]);// fing the max vlaue from right to left
        }
        int trapwater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel = min(left boubary,right boundary)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trap water=waterlevel-number[i]
            trapwater += waterlevel - number[i];

        }
        return trapwater;

    }

    public static void main(String[] args) {
        int number[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapwater(number));
    }

}
