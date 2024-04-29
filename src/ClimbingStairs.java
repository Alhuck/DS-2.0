import java.util.HashMap;
import java.util.Map;

//Dynamic Programming
public class ClimbingStairs {

    //
    // This pattern follows the Fibonacci series
    //
    //           _|
    //         _| 5 n(4)
    //       _| 3 n(3)
    //     _| 2 n(2)
    //    | 1 n(1)
    //    1 n(0)
    //
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairsWithMemo(n, new HashMap<Integer, Integer>());
    }

    public static int climbStairsWithMemo(int n, Map<Integer, Integer> m) {

        if (n == 0 || n == 1) {
            return 1;
        }
        if (!m.containsKey(n)) {
            m.put(n, climbStairsWithMemo(n - 1, m) + climbStairsWithMemo(n - 2, m));
        }

        return m.get(n);
    }

    public static void main(String[] args) {

        System.out.println(climbStairs(10));

    }
}
