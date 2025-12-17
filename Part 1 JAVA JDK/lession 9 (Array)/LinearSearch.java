public class LinearSearch {
    public static int search(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 11, 22, 13, 4, 5 };
        int key = 22;
        int l = search(marks, key);
        if (l == -1) {
            System.out.println("key not founded : ");
        } else {
            System.out.println("key founded : " + l);
        }
    }

}
