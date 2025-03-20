package boj;

import java.io.*;

public class BOJ1076 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 저항의 색 3개를 입력받아 첫 번째와 두 번째 색은 저항 값으로,
         * 세 번째 색은 곱하는 값으로 사용하여 저항값을 계산하는 프로그램 작성.
         * 입력:
         * 첫째 줄에 첫 번째 색, 둘째 줄에 두 번째 색, 셋째 줄에 세 번째 색이 주어진다.
         * 위의 표에 있는 색만 입력으로 주어진다.
         * 출력:
         * - 입력으로 주어진 저항의 저항값을 계산하여 첫째 줄에 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long result = 0;
        int count = 0;

        String value1 = "";
        String value2 = "";
        String multiplier1 = "";

        for (int i = 0; i < 3; i++) {
            String color = br.readLine();
            if (color.equals("black")) {
                if (count == 2) {
                    multiplier1 = "1";
                } else {
                    if (count == 0) {
                        value1 = "0";
                    } else {
                        value2 = "0";
                    }
                }
            } else if (color.equals("brown")) {
                if (count == 2) {
                    multiplier1 = "10";
                } else {
                    if (count == 0) {
                        value1 = "1";
                    } else {
                        value2 = "1";
                    }
                }
            } else if (color.equals("red")) {
                if (count == 2) {
                    multiplier1 = "100";
                } else {
                    if (count == 0) {
                        value1 = "2";
                    } else {
                        value2 = "2";
                    }
                }
            } else if (color.equals("orange")) {
                if (count == 2) {
                    multiplier1 = "1000";
                } else {
                    if (count == 0) {
                        value1 = "3";
                    } else {
                        value2 = "3";
                    }
                }
            } else if (color.equals("yellow")) {
                if (count == 2) {
                    multiplier1 = "10000";
                } else {
                    if (count == 0) {
                        value1 = "4";
                    } else {
                        value2 = "4";
                    }
                }
            } else if (color.equals("green")) {
                if (count == 2) {
                    multiplier1 = "100000";
                } else {
                    if (count == 0) {
                        value1 = "5";
                    } else {
                        value2 = "5";
                    }
                }
            } else if (color.equals("blue")) {
                if (count == 2) {
                    multiplier1 = "1000000";
                } else {
                    if (count == 0) {
                        value1 = "6";
                    } else {
                        value2 = "6";
                    }
                }
            } else if (color.equals("violet")) {
                if (count == 2) {
                    multiplier1 = "10000000";
                } else {
                    if (count == 0) {
                        value1 = "7";
                    } else {
                        value2 = "7";
                    }
                }
            } else if (color.equals("grey")) {
                if (count == 2) {
                    multiplier1 = "100000000";
                } else {
                    if (count == 0) {
                        value1 = "8";
                    } else {
                        value2 = "8";
                    }
                }
            } else if (color.equals("white")) {
                if (count == 2) {
                    multiplier1 = "1000000000";
                } else {
                    if (count == 0) {
                        value1 = "9";
                    } else {
                        value2 = "9";
                    }
                }
            }
            count++;
        }

        result += Integer.parseInt(value1 + value2);
        result *= Long.parseLong(multiplier1);

        // 결과 출력
        sb.append(result);
        System.out.println(sb);
    }
}
