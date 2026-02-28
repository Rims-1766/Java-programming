import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            
            int bags = (N + 9) / 10;   // Ceiling division
            
            System.out.println(bags);
        }
        sc.close();
    }
}
