public class Hw0Ex2 {
    public static void main(String[] args) {
        int[] intNumbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
        System.out.println("Comput the max using While is " + maxInWhileForm(intNumbers));
        System.out.println("Comput the max using ForLoop is " + maxInForLoop(intNumbers));
        System.out.println("Feed the function with a null ");
        maxInWhileForm(new int[] {});
        System.out.println("Feed the function with an empty array:");
        maxInForLoop(null);

    }

    private static int maxInForLoop(int[] m) {
        assert m != null : "Array is null !";
        assert m.length > 0 : "Array is empty !";
        int largestSoFar = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] > largestSoFar) {
                largestSoFar = m[i];
            }
        }
        return largestSoFar;
    }

    private static int maxInWhileForm(int[] m) {
        assert m != null : "Array is null !";
        assert m.length > 0 : "Array is empty !";
        int largestSoFar = m[0];
        int i = 1;
        while (i < m.length) {
            if (m[i] > largestSoFar) {
                largestSoFar = m[i];
            }
            i++;
        }
        return largestSoFar;
    }
}
