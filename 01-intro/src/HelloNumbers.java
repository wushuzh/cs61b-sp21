class HelloNumbers {
    public static void main(String[] args) {
        int x;
        x = 0;
        while (x < 10) {
            System.out.println(x);
            x = x + 1;
        }
        // x = "horse";
        // String x = "horse";
    }
}

/**
 * 1. Before Java variables can be used, they must be declared.
 * 2. Java variables must have a specific type.
 * 3. Java variables types can never change.
 * 4. In Java, types are verified before the code runs ! If there are type
 * issues, the code WILL NOT COMPILE.
 * 
 * python code can crash due to type errors when it's running:
 * ```print(5 + "horse")```
 * think about what may happens to you when you're using an application written
 * by python
 */