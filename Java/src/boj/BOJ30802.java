package boj;

import java.io.*;
import java.util.*;

public class BOJ30802 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 2024년 2월 3일 개최 예정인 온사이트 그랜드 아레나에서는 참가자들에게 티셔츠 한 장과
         * 펜 한 자루가 포함된 웰컴 키트를 나눠줄 예정입니다.
         * 키트를 제작하는 업체는 다음과 같은 조건으로만 주문이 가능합니다.
         * 티셔츠는 S, M, L, XL, XXL, 그리고 XXXL의 6가지 사이즈가 있습니다.
         * 티셔츠는 같은 사이즈의 T장 묶음으로만 주문할 수 있습니다.
         * 펜은 한 종류로, P자루씩 묶음으로 주문하거나 한 자루씩 주문할 수 있습니다.
         * 총 N명의 참가자 중 S, M, L, XL, XXL, XXXL 사이즈의 티셔츠를 신청한 사람은 각각
         * S, M, L, XL, XXL, XXXL명입니다.
         * 티셔츠는 남아도 되지만 부족해서는 안 되고 신청한 사이즈대로 나눠주어야 합니다.
         * 펜은 남거나 부족해서는 안 되고 정확히 참가자 수만큼 준비되어야 합니다.
         * 티셔츠를 T장씩 최소 몇 묶음 주문해야 하는지, 그리고 펜을 P자루씩 최대 몇 묶음 주문할 수 있고,
         * 그 때 펜을 한 자루씩 몇 개 주문하는지 구하세요.
         * 
         * 입력:첫 줄에 참가자의 수 N이 주어집니다
         * 둘째 줄에 티셔츠 사이즈별 신청자의 수 S, M, L, XL, XXL, XXXL이 공백으로 구분되어 주어집니다
         * 셋째 줄에 정수 티셔츠와 펜의 묶음 수를 의미하는 정수 T와 P가 공백으로 구분되어 주어집니다
         * 
         * 출력: 첫 줄에 티셔츠를 T장씩 최소 몇 묶음 주문해야 하는지 출력하세요.
         * 다음 줄에 펜을 P자루씩 최대 몇 묶음 주문할 수 있는지와, 그 때 펜을 한 자루씩 몇 개 주문하는지 구하세요.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 참가자의 수
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 티셔츠 사이즈별 참가자 수
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int XL = Integer.parseInt(st.nextToken());
        int XXL = Integer.parseInt(st.nextToken());
        int XXXL = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        // 티셔츠와 팬의 묶음 수
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // 최소 티셔츠의 주문 개수
        int minTshirtOrder = 0;

        // 최소 티셔츠 주문 개수 계산
        minTshirtOrder += (S + T - 1) / T;
        minTshirtOrder += (M + T - 1) / T;
        minTshirtOrder += (L + T - 1) / T;
        minTshirtOrder += (XL + T - 1) / T;
        minTshirtOrder += (XXL + T - 1) / T;
        minTshirtOrder += (XXXL + T - 1) / T;

        sb.append(minTshirtOrder).append("\n");
        sb.append(P > N ? N : (N / P)).append(" ").append((N % P));
        System.out.print(sb);
    }
}
