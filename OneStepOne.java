package Quiz5BruteForce;

import java.io.*;
import java.util.*;

public class OneStepOne {

    static int[] oneStepOne(int n) {
        n = n == 1 ? -1 : n;
        int[] salida = { n, n };
        return salida;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] respuesta = oneStepOne(n);
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
