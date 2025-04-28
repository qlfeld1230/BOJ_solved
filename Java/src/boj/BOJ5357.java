package boj;

import java.io.*;

public class BOJ5357 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * Redundancy in this world is pointless. Let’s get rid of all redundancy.
         * For example AAABB is redundant. Why not just use AB?
         * Given a string, remove all consecutive letters that are the same.
         * 
         * 입력:
         * The first line in the data file is an integer that represents the number of data sets to follow.
         * Each data set is a single string. The length of the string is less than 100.
         * Each string only contains uppercase alphabetical letters.
         * 
         * 출력:
         * Print the deduped string.
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
       

        // 테스트 케이스만큼 반복
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String result = "";


            for(int j=0; j< str.length(); j++){
                // 현재 문자와 다음 문자가 같지 않으면 결과에 추가
                if(j == str.length()-1 || str.charAt(j) != str.charAt(j+1)){
                    result += str.charAt(j);
                }
            }
          
            sb.append(result).append("\n");
        }

        // 결과 출력
        System.out.println(sb);
    }
}
