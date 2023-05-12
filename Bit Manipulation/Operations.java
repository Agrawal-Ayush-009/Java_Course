import java.util.Scanner;

import javax.sound.midi.Synthesizer;
import javax.swing.plaf.synth.SynthIcon;

public class Operations {
    public static int clearBitRange (int n, int i, int j) {
        int a = (~0) << (j+1);
        int b = (1 << i) - 1;

        int bitmask = a | b;

        return n & bitmask;
    }

    public static int clear_i_bits (int n, int i) {
        int bitwise = (~0) << i; // or (-1) << i;
        
        return n & bitwise;
    }

    public static int updateBit (int n, int i, int newBit) {
        // if(newBit == 0) {
        //     System.out.println(clearBit(n, i));
        // } else{
        //     System.out.println(setBit(n, i));                                                                                    
        // }

        n = clearBit(n, i);
        int bitmask = newBit << i;
        
        return n | bitmask;
    }

    public static int clearBit (int n, int i) {
        int bitmask = 1 << i;
        int newBitMask = ~bitmask;

        return n & newBitMask;
    }

    public static int setBit (int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void getBit (int n, int i) {
        int bitmask = 1 << i;
        int bit = n & bitmask;
        if(bit == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();

        // getBit(n, i);
        // System.out.println(setBit(n, i));
        // System.out.println(clearBit(n, i));
        // System.out.println(updateBit(n, i, 1));
        // System.out.println(clear_i_bits(n, i));
        System.out.println(clearBitRange(n, i, sc.nextInt()));
    }
}