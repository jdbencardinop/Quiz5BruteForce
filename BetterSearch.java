package Quiz5BruteForce;

import java.io.*;
import java.util.*;

public class BetterSearch {

    static int[] betterSearch(int n) {
        int[] salida = { -1, -1 };
        int[] primos = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97 };
        for (int i = 0; i < primos.length; i++) {
            if (n >= Math.floor(n / primos[i]) + (primos[i] - (Math.floor(n / primos[i])) % primos[i])) {
                salida[0] = (int) (Math.floor(n / primos[i]) + (primos[i] - (Math.floor(n / primos[i])) % primos[i]));
                salida[1] = primos[i];
                return salida;
            }
        }
        return salida;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] respuesta = betterSearch(n);
        if (respuesta[0] == -1)
            System.out.println(-1);
        else
            System.out.println(respuesta[0] + " " + respuesta[1]);
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
