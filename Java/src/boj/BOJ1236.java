package boj;

import java.io.*;
import java.util.*;

public class BOJ1236 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: N x N 크기의 행렬에서 모든 행과 열에 적어도 한 명 이상의 경비원이 있어야 한다.
         * N x N 행렬의 상태가 주어졌을 때, 경비원이 필요한 최소 수를 구하는 프로그램 작성.
         * 
         * 입력: 첫째 줄에 성의 세로 크기 N과 가로 크기 M이 주어진다. 
         * N과 M은 50보다 작거나 같은 자연수이다. 
         * 둘째 줄부터 N개의 줄에는 성의 상태가 주어진다. 
         * 성의 상태는 .은 빈칸, X는 경비원이 있는 칸이다.
         * 
         * 출력: 첫째 줄에 추가해야 하는 경비원의 최솟값을 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        // 상태를 입력받을 배열
        int[][] castle = new int[N][M];

        // 결과 값
        int result = 0;

        // 배열에 상태 입력
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'X') { 
                    castle[i][j] = 1;
                }
            }
        }

        // 행과 열에 경비원이 있는지 확인할 리스트
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        // 행에 경비원이 없다면 추가
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < M; j++) {
                if (castle[i][j] == 1) {
                    cnt = 1;
                }
            }
            if (cnt == 0) {
                row.add(i);
            }
        }

        // 열에 경비원이 없다면 추가
        for (int i = 0; i < M; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (castle[j][i] == 1) {
                    cnt = 1;
                }
            }
            if (cnt == 0) {
                col.add(i);
            }
        }
        
        // 행과 열 모두 경비원이 없는 경우 우선적으로 추가
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (row.contains(i) && col.contains(j)) {
                    castle[i][j] = 1;
                    row.remove(Integer.valueOf(i)); 
                    col.remove(Integer.valueOf(j)); 
                    result++;
                }
            }
        }

        result += row.size();
        result += col.size();

        // 결과 출력
        sb.append(result);
        System.out.println(sb);
    }
}

