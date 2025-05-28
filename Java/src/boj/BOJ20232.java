package boj;

import java.io.*;

public class BOJ20232 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: The team of problemsetters of Northwestern Russia Regional Contest welcomes you!
         *  Our regional contest was founded in 1995 under the name "Collegiate Programming Championship of St Petersburg".
         *  Help the contest archivist to remember the results of each contest and write a program that
         *  will read the year and print contest winners of that year in exactly the same format as above.
         *          
         *  
         * 입력: number between 1995 and 2023 inclusive, representing the year of the contest.
         * 
         * 출력: Print the winner of the contest in year exactly in the same format as in the list above.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        switch (N) {
            case 1995, 1998, 1999, 2001, 2002, 2003, 2004, 2005, 2009, 2010, 2011, 2012, 2014, 2015, 2016, 2017, 2019:
                sb.append("ITMO");
                break;
        
            case 1996, 1997, 2000, 2007, 2008, 2013, 2018:
                sb.append("SPbSU");
                break;

            default:
                sb.append("PetrSU, ITMO");
                break;
        }

        // 결과 출력
        System.out.print(sb);
    }
}
