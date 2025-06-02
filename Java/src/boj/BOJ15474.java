package boj;

import java.io.*;

public class BOJ15474 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * JOI 君は鉛筆を N 本買うために近くの文房具店に行くことにした。
         * 文房具店では鉛筆が一定の本数ずつのセットで売られている。セット X は A 本で B 円、セット Y は C 本で D 円である。
         * JOI 君はセット X かセット Y の一方を選び、選んだセットをいくつか購入する。両方のセットを購入することはできない。
         * N 本以上の鉛筆を得るために必要な金額の最小値を求めよ。
         * 
         * 입력:
         * 入力は以下の形式で標準入力から与えられる。
         * N A B C D
         * 
         * 출력:
         * JOI 君が N 本以上の鉛筆を手に入れるのに必要な金額の最小値を出力せよ。
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        
        String input[] = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        int C = Integer.parseInt(input[3]);
        int D = Integer.parseInt(input[4]);

        int sum=0, sumA = 0, sumC = 0;
        
        while(true) {
            sumA += B;
            sum += A;

            if(sum >= N) {
                break;
            }
        }

        sum = 0;
        while(true) {
            sumC += D;
            sum += C;

            if(sum >= N) {
                break;
            }
        }

        sb.append(sumA < sumC ? sumA : sumC);
        // 결과 출력
        System.out.print(sb);
    }
}
