class Hw0Ex1 {
    public static void main(String[] args) {
        printStarts(5);
    }

    public static void printStarts(int n) {
        String stars = "*";
        for (int i = 0; i <= n; i++) {
            System.out.println(stars);
            stars += "*";
        }
    }
}