class LargerDemo {

    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(5, -10));
    }
}

/**
 * 1. To declare a function in Java, use "public static" (for today)
 * 2. ALL parameters of a function must have a type, and the function itself
 * must have a return type.
 * 3. ALL functions must be part of a class. In programming language
 * terminology, a function that is part of a class is called a "method" so all
 * functions in Java are methods.
 */