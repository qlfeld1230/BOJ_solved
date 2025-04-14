package boj;

import java.io.*;
import java.util.*;

public class BOJ10175 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 문자열이 주어지면 우점종이 존재하는지 또는 어떤 종이 우점종인지 판단하라.
         * 
         * 입력: 첫 째줄에 테스트케이스의 개수 N가 주어진다.
         * 다음 N번에 걸쳐 지역과 문자열이 주어진다.
         * 
         * 출력: 우점종을 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 테스트 케이스만큼 반복
        for (int t = 0; t < N; t++) {
            // 초기 상태 설정
            StringTokenizer st = new StringTokenizer(br.readLine());
            String region = st.nextToken();
            String str = st.nextToken();
            int Bobcat = 0;
            int Coyote = 0;
            int MountainLion = 0;
            int Wolf = 0;
            int max = 0;
            String maxSpecies = "none";
            // str의 각 문자에 대해 반복
            for (char c : str.toCharArray()) {
                switch (c) {
                    case 'B':
                        Bobcat += 2;
                        break;
                    case 'C':
                        Coyote++;
                        break;
                    case 'M':
                        MountainLion += 4;
                        break;
                    case 'W':
                        Wolf += 3;
                        break;
                }
            }

            if (max < Bobcat) {
                max = Bobcat;
                maxSpecies = "Bobcat";
            } else if (max == Bobcat) {
                maxSpecies = "none";
            }
            if (max < Coyote) {
                max = Coyote;
                maxSpecies = "Coyote";
            } else if (max == Coyote) {
                maxSpecies = "none";
            }
            if (max < MountainLion) {
                max = MountainLion;
                maxSpecies = "MountainLion";
            } else if (max == MountainLion) {
                maxSpecies = "none";
            }
            if (max < Wolf) {
                max = Wolf;
                maxSpecies = "Wolf";
            } else if (max == Wolf) {
                maxSpecies = "none";
            }

            // 우점종이 존재하는지 판단
            if (maxSpecies.equals("none")) {
                System.out.println(region + ":" + " There is no dominant species");
            } else if (Bobcat == max) {
                maxSpecies = "Bobcat";
            } else if (Coyote == max) {
                maxSpecies = "Coyote";
            } else if (MountainLion == max) {
                maxSpecies = "Mountain Lion";
            } else if (Wolf == max) {
                maxSpecies = "Wolf";
            }

            if (!maxSpecies.equals("none"))
                System.out.println(region + ":" + " The " + maxSpecies + " is the dominant species");

        }

        // 결과 출력
    }
}
