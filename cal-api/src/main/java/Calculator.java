public final class Calculator {
    /**
     *
     */
    private Calculator() {
    }
    /**
     * @param integer1
     * @param integer2
     */
    public static void addition(final int integer1, final int integer2) {
        int integer3 = integer1 + integer2;
        System.out.println("Multiplication is " + integer3);
    }

    /**
     * @param integer1
     * @param integer2
     */
    public static void subtraction(final int integer1, final int integer2) {
        int integer3 = integer1 - integer2;
        System.out.println("Multiplication is " + integer3);
    }

    /**
     * @param integer1
     * @param integer2
     */
    public static void multiplication(final int integer1, final int integer2) {
        int integer3 = integer1 * integer2;
        System.out.println("Multiplication is " + integer3);
    }

    /**
     * @param integer1
     * @param integer2
     */
    public static void division(final int integer1, final int integer2) {
        int integer3 = integer1 / integer2;
        System.out.println("Multiplication is " + integer3);
    }
}
