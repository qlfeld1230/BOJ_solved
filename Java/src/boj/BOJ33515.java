package boj;

import java.io.*;
import java.util.*;

public class BOJ33515 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 형진이와 다른 두 팀원은 실수로 세 대의 노트북을 대회장에 가져오고 말았다. 
         * 하지만 대회장에선 한 대의 노트북만 사용할 수 있다. 세 사람 모두 자신의 노트북을 대회에서 사용하고 싶어 했고, 이에 “백준 온라인 저지(BOJ) 1001번 문제를 가장 먼저 푸는 사람”의 노트북을 사용하기로 내기를 걸었다.
         * 세 명 중 백준 1001번 문제를 가장 먼저 푼 사람의 노트북을 사용한다.
         * 풀이 시간이 가장 짧은 사람이 여러 명인 경우, 그들 중 형진이가 포함된다면 형진이의 노트북을 사용한다.
         * 다른 두 팀원이 백준 1001번 문제를 푸는 데 걸린 시간(초 단위)이 주어질 때, 형진이 자신의 노트북으로 대회에 참가하기 위해서는 다른 팀원들보다 같거나 더 빠른 시간 안에 문제를 풀어야 한다. 
         * 형진이의 노트북으로 대회에 참가하기 위해 형진이가 백준 1001번 문제를 푸는 데까지 필요한 최대 시간(초 단위)을 출력하시오.
         * 
         * 입력: 첫 번째 줄에 두 정수 T1, T2가 공백으로 구분되어 주어진다.  
         * 이는 형진이를 제외한 두 팀원이 백준 1001번 문제를 푸는 데 걸린 시간을 초 단위로 나타낸 것이다.
         * 
         * 출력: 형진이의 노트북으로 대회에 참가하기 위해 형진이가 백준 1001번 문제를 푸는 데까지 필요한 최대 시간을 초 단위로 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T1, T2;

        StringTokenizer st = new StringTokenizer(br.readLine());
        T1 = Integer.parseInt(st.nextToken());
        T2 = Integer.parseInt(st.nextToken());

        sb.append(T1 < T2 ? T1 : T2);

        // 결과 출력
        System.out.println(sb);
    }
}
