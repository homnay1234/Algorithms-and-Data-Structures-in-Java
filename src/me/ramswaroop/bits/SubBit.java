package me.ramswaroop.bits;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ramswaroop
 * @date: 6/4/15
 * @time: 10:54 PM
 */
public class SubBit {

    /**
     * Returns the number formed with the bits from {@param start}
     * and {@param end} of {@param num} (both inclusive).
     *
     * @param num
     * @param start
     * @param end
     * @return
     */
    public static int getSubBit(int num, int start, int end) {
        num <<= (32 - end);
        num >>>= (start - end + 31);
        return num;
    }

    public static void main(String a[]) {
        System.out.println(getSubBit(15, 1, 2));
    }
}