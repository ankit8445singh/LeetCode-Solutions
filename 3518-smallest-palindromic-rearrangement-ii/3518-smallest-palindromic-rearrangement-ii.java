import java.util.*;

class Solution {

    private static final long LIMIT = 1000000L;

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];

        for (char c : s.toCharArray())
            freq[c - 'a']++;

        StringBuilder half = new StringBuilder();
        char middle = 0;

        int[] halfFreq = new int[26];
        int halfLen = 0;

        for (int i = 0; i < 26; i++) {
            if ((freq[i] & 1) == 1)
                middle = (char) ('a' + i);

            halfFreq[i] = freq[i] / 2;
            halfLen += halfFreq[i];
        }

        long total = countWays(halfFreq, halfLen);

        if (total < k)
            return "";

        for (int pos = 0; pos < halfLen; pos++) {

            for (int ch = 0; ch < 26; ch++) {

                if (halfFreq[ch] == 0)
                    continue;

                halfFreq[ch]--;

                long ways = countWays(halfFreq, halfLen - pos - 1);

                if (ways >= k) {
                    half.append((char) ('a' + ch));
                    break;
                }

                k -= ways;
                halfFreq[ch]++;
            }
        }

        String left = half.toString();
        String right = new StringBuilder(left).reverse().toString();

        if (middle == 0)
            return left + right;

        return left + middle + right;
    }

    private long countWays(int[] freq, int len) {

        long ans = 1;

        int remaining = len;

        for (int i = 0; i < 26; i++) {

            int cnt = freq[i];

            if (cnt == 0)
                continue;

            ans *= combination(remaining, cnt);

            if (ans > LIMIT)
                ans = LIMIT;

            remaining -= cnt;
        }

        return ans;
    }

    private long combination(int n, int r) {

        if (r > n)
            return 0;

        r = Math.min(r, n - r);

        long res = 1;

        for (int i = 1; i <= r; i++) {

            res = res * (n - r + i) / i;

            if (res > LIMIT)
                return LIMIT;
        }

        return res;
    }
}