package boj;

import java.io.*;

public class BOJ10987 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 모음(a, e, i, o, u)의 개수를 출력하는 프로그램을 작성하시오.
         * 
         * 입력: 첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
         * 
         * 출력: 첫째 줄에 모음의 개수를 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int count = 0;

        for(int i=0; i< str.length(); i++){
            // 모음인지 확인
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }

        // 결과 출력
        sb.append(count);
        System.out.println(sb);
    }
}
