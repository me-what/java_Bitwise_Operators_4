// Побитовые операторы. Bitwise operators

public class Main {
    public static void main(String[] args) {
        int x = 342;
        System.out.println(Integer.toBinaryString(x)); // 101010110

        int x2 = 342;
        System.out.println(Integer.toBinaryString(~x2) + "\n"); // 11111111111111111111111010101001

        System.out.println(277&432); // 272
        System.out.println();

        System.out.println(277|432); // 437
        System.out.println();

        System.out.println(277^432); // 165
        System.out.println();

        int xx = 64; // значение
        int y = 3; // количество
        int z = (xx << y);
        System.out.println(" " + xx + " - " + Integer.toBinaryString(xx)); // 64 - 1000000
        System.out.println(z + " - " + Integer.toBinaryString(z));        // 512 - 1000000000
        System.out.println();

        int x3 = 64; // значение
        int y3 = 26; // количество

        int z3 = (x3 << y3);
        System.out.println(z3); // 0
        System.out.println();

        System.out.println(111111111 << 3); // 888888888
        System.out.println();

        int x4 = 64; // значение
        int y4 = 2; // количество
        int z4 = (x4 >> y4);
        System.out.println(z4 + "\n"); // 16

        System.out.println(35 >> 2); // 8
    }
}