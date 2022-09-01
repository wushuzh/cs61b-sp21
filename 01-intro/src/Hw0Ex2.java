public class Hw0Ex2 {
    public static void main(String[] args) {
        int[] intNumbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
        System.out.println("The max integer is " + max(intNumbers));
        System.out.println("Feed the function with an empty array:");
        max(new int[] {});
    }

    private static int max(int[] m) {
        assert m.length > 0 : "Array is empty !";
        int largestSoFar = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] > largestSoFar) {
                largestSoFar = m[i];
            }
        }
        return largestSoFar;
    }
}
