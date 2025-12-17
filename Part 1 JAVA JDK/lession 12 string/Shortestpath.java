public class Shortestpath {

    public static float shortest(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            // south

            if (dir == 'S') {
                y--;

            }
            // north

            else if (dir == 'N') {
                y++;

            }

            else if (dir == 'E') {
                x++;

            }

            else if (dir == 'W') {
                x--;

            }

            else {
                System.out.println("not vallide");
            }

        }

        // return displacement

        int X2 = x * x; // square of x
        int Y2 = y * y;// square of y

        return (float) Math.sqrt(X2 + Y2);

    }

    public static void main(String[] args) {

        String str = "WNEENESENNN";
        System.out.println(shortest(str));

    }

}
