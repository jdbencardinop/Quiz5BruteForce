package Quiz5BruteForce;

import java.io.*;
import java.util.*;

public class AnotherBruteForce {

    static int[] anotherBruteForce(int n) {
        int[] salida = { -1, -1 };
        for (int i = 1; i <= n; i++) {// this is a
            for (int j = 1; j <= i; j++) {// this is b
                if (i % j == 0 && i * j > n && i / j < n) {
                    salida[0] = i;
                    salida[1] = j;
                    return salida;
                }
            }
        }
        return salida;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] respuesta = anotherBruteForce(n);
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
