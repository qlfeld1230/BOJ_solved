package boj;

import java.io.*;

public class BOJ21354 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * Axel vill tävla med Petra om vem som sålt flest äpplen respektive päron, 
         * men Petra tycker inte att man kan "jämföra äpplen och päron". 
         * De kommer överens om att de istället ska jämföra hur mycket de tjänat. 
         * De ber dig skapa ett program som skriver ut vem som tjänat mest. 
         * Äpplen kostar 7 kronor styck och päron 13 kronor styck.
         * 
         * 입력:
         * En rad med två heltal A, P (0 ≤ A, P < 1000), 
         * antalet äpplen Axel har lyckats sälja, och antalet päron Petra har lyckats sälja.
         * 
         * 출력:
         * Programmet ska skriva ut en rad med en sträng: 
         * den person som har tjänat mest, "Axel" eller "Petra". 
         * Om de sålt för lika mycket ska du skriva "lika".
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input[] = br.readLine().split(" ");
        
        int A = Integer.parseInt(input[0]);
        int P = Integer.parseInt(input[1]); 

        A *= 7;
        P *= 13; 

        if(A > P) {
            sb.append("Axel");
        } else if(A < P) {
            sb.append("Petra");
        } else {
            sb.append("lika");
        }

        // 결과 출력
        System.out.print(sb);
    }
}
