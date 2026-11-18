class Solution {
    public int romanToInt(String s) {
        int ans = 0;
 for (int i = 0; i < s.length(); i++) {
            int a = 0;
if (s.charAt(i) == 'I') a = 1;
else if (s.charAt(i) == 'V') a = 5;
else if (s.charAt(i) == 'X') a = 10;
else if (s.charAt(i) == 'L') a = 50;
else if (s.charAt(i) == 'C') a = 100;
else if (s.charAt(i) == 'D') a = 500;
 else if (s.charAt(i) == 'M') a = 1000;
 if (i + 1 < s.length() && a < getValue(s.charAt(i + 1))) {
     ans = ans - a;
    } else {
                ans = ans + a;
            }
        }
 return ans;
    }
public int getValue(char c) {
    if (c == 'I') return 1;
    if (c == 'V') return 5;
     if (c == 'X') return 10;
    if (c == 'L') return 50;
 if (c == 'C') return 100;
    if (c == 'D') return 500;    return 1000;
    }
}
