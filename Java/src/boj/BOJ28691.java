package boj;

import java.io.*;

public class BOJ28691 { 
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 동아리 이름 첫 번째 글자가 주어지면 전체를 출력하라.
         * 
         * 입력: 첫 째줄에 동아리 이름 첫 글자가 주어진다.
         * 
         * 출력: 동아리 이름을 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char firstChar = br.readLine().charAt(0);

        switch (firstChar) {
            case 'M':
                sb.append("MatKor");
                break;
            case 'W':
                sb.append("WiCys");
                break;
            case 'C':
                sb.append("CyKor");
                break;
            case 'A':
                sb.append("AlKor");
                break;
            case '$':
                sb.append("$clear");
                break;
            default:
                break;
        }

        // 결과 출력
        System.out.println(sb);
    }
}
