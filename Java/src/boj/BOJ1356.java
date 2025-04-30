package boj;

import java.io.*;

public class BOJ1356 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * 유진수는 어떤 수를 10진수로 표현한 뒤 그 수를 두 부분으로 나눴을 때,
         * 앞부분 자리수의 곱과 뒷부분 자리수의 곱이 같을 때를 말한다.
         * 
         * 예를 들어, 1221은 유진수이다.
         * 12와 21로 나눴을 때, 앞부분 자리수의 곱 1*2는 뒷부분 자리수의 곱 2*1과 같기 때문이다.
         * 1236도 마찬가지로 유진수이다.
         * 하지만, 1234는 아니다.
         * 수를 나눌 때 항상 연속된 자리수를 나눠야 하고, 각 부분에 적어도 한자리는 있어야 한다.
         * 
         * 예를 들어, 12345는 총 4가지 방법으로 나눌 수 있다. 1-2345, 12-345, 123-45, 1234-5
         * 어떤 수 N이 주어질 때, 이 수가 유진수인지 구하는 프로그램을 작성하시오.
         * 
         * 입력:
         * 첫째 줄에 수 N이 주어진다.
         * 이 수는 2,147,483,647보다 작거나 같은 자연수이다.
         * 
         * 출력:
         * 첫째 줄에 N이 유진수이면 YES, 아니면 NO를 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String str = String.valueOf(num);
        String result = "NO";

        for (int i = 0; i < str.length(); i++) {
            String left = str.substring(0, i + 1);
            String right = str.substring(i + 1, str.length());

            int leftMul = 1;
            int rightMul = 1;

            for (int j = 0; j < left.length(); j++) {
                leftMul *= Integer.parseInt(String.valueOf(left.charAt(j)));
            }

            for (int j = 0; j < right.length(); j++) {
                rightMul *= Integer.parseInt(String.valueOf(right.charAt(j)));
            }

            if (leftMul == rightMul) {
                result = "YES";
                break;
            }
        }

        if (num < 10) {
            result = "NO";
        }

        sb.append(result);
        System.out.print(sb);
    }
}
