package boj;

import java.io.*;

public class BOJ10188 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:  A quadrilateral is a 4-sided figure.
         *  For this program, print out a 4 sided figure using the capital letter X. The largest side will be 20, and the smallest side will be 1.
         * 
         * 입력: The first line consists of the number of data sets. Each data set consists of 2 integers, the length and width of the quadrilateral.
         * 
         * 출력: Print out the quadrilateral using the capital letter X, each quadrilateral separated by a blank line.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input[] = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            for(int j=0; j<b; j++){
                for(int k=0; k<a; k++){
                    System.out.print("X");
                }
                System.out.print("\n");
            }
            System.out.println();
        }
    }
}
