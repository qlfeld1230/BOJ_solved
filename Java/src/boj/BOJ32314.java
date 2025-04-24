package boj;

import java.io.*;
import java.util.*;

public class BOJ32314 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * Adapters (Transformers) are used with many devices (e.g., cell phones) to convert the 110 volt coming out of the outlet.
         * The adapter for Dr. Orooji's Christmas Tree broke and Dr. O could not find that model online or in stores.
         * The tree adapter was showing the “ampere” but the adapters online were showing “watt” and “volt”!
         * So, Dr. O had to refer to the “Electricity 101 Book” to figure out what to buy:
         * 
         * • Watt: measure of power
         * • Volt: measure of electric potential
         * • Ampere: measure of current
         * • watt = ampere × volt → ampere = watt / volt
         * 
         * Given the ampere for Dr. O’s Christmas tree, and the watt and volt for a candidate adapter,
         * determine if the candidate adapter will work with the tree.
         * The adapter will work if its ampere is greater than or equal to the tree’s ampere.
         * 
         * 입력:
         * The first input line contains an integer, a (1 ≤ a ≤ 20), indicating the ampere for the Christmas tree.
         * The second input line contains two integers: w (1 ≤ w ≤ 2000), indicating the watt for the candidate adapter
         * and v (1 ≤ v ≤ 100), indicating the volt for the candidate adapter.
         * Assume that the input will not result in fractions in divisions.
         * 
         * 출력:
         * Print 1 if the candidate adapter will work with the tree, 0 (zero) otherwise.
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int treeAmpere = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());

        int adapterWatt = Integer.parseInt(st.nextToken());
        int adapterVolt = Integer.parseInt(st.nextToken());

        int result = (adapterWatt / adapterVolt >= treeAmpere) ? 1 : 0;
        
        // 결과 출력
        sb.append(result);
        System.out.println(sb);
    }
}
