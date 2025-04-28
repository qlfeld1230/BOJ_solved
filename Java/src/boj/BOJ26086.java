package boj;

import java.io.*;

public class BOJ26086 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * 마음씨 착한 곰곰이는 임스에게 치킨 기프티콘을 여러 번 선물했다.
         * 
         * 기프티콘이 있다는 사실을 잊고 있던 임스는 치킨 댄스를 추는 곰곰이를 보고 그 사실이 생각났다.
         * 
         * 치킨 기프티콘을 선물받은 횟수 N과 선물의 남은 유효기간이 주어질 때,
         * 임스가 사용할 기프티콘의 개수를 구하시오.
         * 
         * 임스는 기프티콘을 아껴 사용하기 위해 유효기간이 90일 이하로 남은 기프티콘만 사용할 것이다.
         * 
         * 입력:
         * 첫 번째 줄에는 임스가 받은 기프티콘의 개수 정수 N이 주어진다. (1 ≤ N ≤ 1000)
         * 두 번째 줄부터 N개의 줄에 걸쳐 i번째 기프티콘의 남은 유효기간 xᵢ가 D-xᵢ와 같은 형식으로 주어진다. (1 ≤ xᵢ ≤ 365)
         * 
         * 출력:
         * 임스가 사용할 기프티콘의 개수를 출력하시오.
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int result = 0; // 사용할 기프티콘의 개수

        // 테스트 케이스만큼 반복
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            // 한자리수 일 경우
            if (str.length() < 4) {
                str = str.charAt(2) + "";
            } else { // 두자리수 일 경우
                str = str.substring(2, 3);
            }

            int num = Integer.parseInt(str); // 남은 유효기간
            if( num <= 90) {
                result++;
            }
        }

        // 결과 출력
        sb.append(result);
        System.out.println(sb);
    }
}
