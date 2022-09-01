import java.util.Arrays;

public class Hw0Ex4 {
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                continue;
            }
            for (int j = i + 1; j <= i + n; j++) {
                if (j > (a.length - 1)) {
                    break;
                }
                a[i] += a[j];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, -3, 4, 5, 4 };
        windowPosSum(a, 3);
        int[] expected = { 4, 8, -3, 13, 9, 4 };
        System.out.println("windowsPosSum changed array to:" + Arrays.toString(a));
        assert Arrays.equals(a, expected);

    }
}
