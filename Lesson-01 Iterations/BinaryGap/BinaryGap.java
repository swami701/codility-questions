/**
 * BinaryGap
 */
public class BinaryGap {
    public static void main(String[] args) {
        System.out.println("Binary Gap");
        System.out.println("9: " + solution(9));
        System.out.println("529: " + solution(529));
        System.out.println("20: " + solution(20));
        System.out.println("15: " + solution(15));
        System.out.println("32: " + solution(32));
        System.out.println("1041: " + solution(1041));
    }

    private static int solution(int N) {
        int res = 0;
        boolean isCountable = false;
        int cnt = 0;
        while (N > 0) {
            if (N % 2 == 1) {
                if (isCountable) {
                    res = (cnt > res) ? cnt : res;
                    cnt = 0;
                } else {
                    isCountable = true;
                }
            } else {
                if (isCountable) {
                    cnt++;
                }
            }
            N /= 2;
        }
        return res;
    }
}