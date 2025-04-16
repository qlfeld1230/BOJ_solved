package boj;

import java.io.*;

public class BOJ4096 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * 승환이는 팰린드롬을 좋아한다.
         * 지금 승환이의 자동차의 주행 거리계에 100000이 적혀있다.
         * 승환이는 1km만 더 주행을 하면 100001이 된다!
         * 승환이는 엄청나게 흥분했다.
         * 
         * 주행 거리계에 적혀져 있는 수가 주어졌을 때,
         * 몇 km를 더 주행하면 팰린드롬이 되는지 구하는 프로그램을 작성하시오.
         * 승환이는 모든 자리가 팰린드롬이 되어야 한다.
         * 따라서, 주행 거리계에 00121인 경우에는 팰린드롬이 아니다.
         * 
         * 입력:
         * 입력은 여러 테스트 케이스로 이루어져 있다.
         * 각 테스트 케이스는 한 줄로 이루어져 있고,
         * 현재 승환이의 주행 거리계에 적혀있는 수가 주어진다.
         * 이 숫자는 2자리와 9자리 사이(포함)이다.
         * 예를 들어, 주행 거리계에 적혀 있는 숫자의 갯수는, 입력으로 주어진 수의 숫자수와 같다.
         * 그래서, 입력이 004560이라면, 5자리 숫자이다.
         * 마지막 줄에는 0이 적혀 있다.
         * 
         * 출력:
         * 각 테스트 케이스에 대해서 주행 거리계의 수가 팰린드롬이 되기 위해 주행해야 하는 최소 거리를 출력한다.
         * 만약 이미 팰린드롬이라면 0을 출력한다.
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        String N;
        while(!(N = br.readLine()).equals("0")){
            
            int length = N.length(); // 문자열 길이
            long number = Long.parseLong(N); // 문자열을 숫자로 변환
            int count = 0;  // 얼마나 멀리 떨어져 있는지 체크

            while(!isPalindrome(number, length)){
                number++;
                count++;
            }
            
            sb.append(count).append("\n");
           
        }


        System.out.print(sb);
    }

    // 팰린드롬 체크 함수
    public boolean isPalindrome(long number, int length) {
        long divisor = (long)Math.pow(10, length - 1);
        long left = number;
        long right = number;

        for (int i = 0; i < length / 2; i++) {
            long leftDigit = left / divisor;
            long rightDigit = right % 10;

            if (leftDigit != rightDigit) return false;

            // 양쪽 한 자리씩 제거
            left %= divisor;
            right /= 10;
            divisor /= 10;
        }

        return true;
    }
       
}

