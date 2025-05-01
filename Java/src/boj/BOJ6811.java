package boj;

import java.io.*;

public class BOJ6811 {
    // 📝 문제 설명
        /*
         * 문제:
         * Fishing habitat and fish species are a resource that must be carefully managed to ensure that they will be there for the future.
         * Accordingly, fishing limits have been established for a particular river based on the population of each species.
         * Specifically, points are associated with the fish caught and the total points you catch must be less than or equal to the points allowed for that river.
         * 
         * As an example, suppose each brown trout counts as 2 points, each northern pike counts as 5 points
         * and each yellow pickerel counts as 2 points, and the total points allowed must be less than or equal to 12.
         * One acceptable catch could consist of 3 brown trout and 1 northern pike, but other combinations would also be allowed.
         * 
         * Your job is to write a program to input the points allocated for a river,
         * and find how many different ways an angler who catches at least one fish can stay within his/her limit.
         * 
         * 입력:
         * You will be given 4 integers, one per line, representing trout points, pike points, pickerel points, and total points allowed in that order.
         * 
         * You can assume that each integer will be greater than 0 and less than or equal to 100.
         * 
         * 출력:
         * For each different combination of fish caught, output the combination of brown trout, northern pike, and yellow pickerel in that order.
         * The combinations may be listed in any order.
         * The last line of output should display the total number of unique ways to catch fish within the established limit.
         */
     public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int b = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        int count = 0;
        
        for (int pickerel = 0; pickerel * y <= t; pickerel++) {
            for (int pike = 0; pike * p + pickerel * y <= t; pike++) {
                for (int brown = 0; brown * b + pike * p + pickerel * y <= t; brown++) {
                    if (brown + pike + pickerel > 0) { // 최소 한 마리 이상 잡은 경우
                        System.out.printf("%d Brown Trout, %d Northern Pike, %d Yellow Pickerel\n", brown, pike, pickerel);
                        count++;
                    }
                }
            }
        }

        System.out.printf("Number of ways to catch fish: %d\n", count); // 조합 수 출력
    }
}
