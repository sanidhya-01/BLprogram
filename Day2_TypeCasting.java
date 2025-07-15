import java.util.Scanner;

public class Day2_TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============== TYPE CASTING DEMO ==============");

        // Input for Byte
        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        // Widening
        short s = b;    // byte to short
        int i = s;      // short to int
        long l = i;     // int to long
        float f = l;    // long to float
        double d = f;   // float to double

        System.out.println("\n--- Widening Conversion ---");
        System.out.println("Byte    -> Short  : " + s);
        System.out.println("Short   -> Int    : " + i);
        System.out.println("Int     -> Long   : " + l);
        System.out.println("Long    -> Float  : " + f);
        System.out.println("Float   -> Double : " + d);

        // Input for Double
        System.out.print("\nEnter a double value: ");
        double d2 = sc.nextDouble();

        // Narrowing
        float f2 = (float) d2;
        long l2 = (long) f2;
        int i2 = (int) l2;
        short s2 = (short) i2;
        byte b2 = (byte) s2;

        System.out.println("\n--- Narrowing Conversion ---");
        System.out.println("Double -> Float  : " + f2);
        System.out.println("Float  -> Long   : " + l2);
        System.out.println("Long   -> Int    : " + i2);
        System.out.println("Int    -> Short  : " + s2);
        System.out.println("Short  -> Byte   : " + b2);

        // Char Conversion
        System.out.print("\nEnter a character: ");
        char ch = sc.next().charAt(0);
        int chAscii = ch;  // Widening (char to int)

        System.out.println("\n--- Character to ASCII ---");
        System.out.println("Character: " + ch);
        System.out.println("ASCII Code: " + chAscii);

        System.out.println("\n===============================================");
        System.out.println("        Thank you for using the demo!          ");
        System.out.println("===============================================");

        sc.close();
    }
}

