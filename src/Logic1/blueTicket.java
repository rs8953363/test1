/*You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac.
Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum
is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.

blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10
 */
package Logic1;

public class blueTicket {
    public static void main(String[] args) {
        System.out.println(blueTicket(9, 1, 0));
        System.out.println(blueTicket(9, 2, 0));
        System.out.println(blueTicket(6, 1, 4));
    }

    public static int blueTicket(int a, int b, int c) {
        if ((a+b==10) || (a+c==10) || (b+c==10))
            return 10;
        else if ((a+b==10+b+c) || (a+b==10+a+c))
            return 5;
        else
            return 0;

    }
}
