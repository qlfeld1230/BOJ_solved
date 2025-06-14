package boj;

import java.io.*;

public class BOJ15216 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * The construction worker previously known as Lars has many bricks of height 1 and different lengths,
         * and he is now trying to build a wall of width w and height h.
         * Since the construction worker previously known as Lars knows that the subset sum problem is NP-hard,
         * he does not try to optimize the placement but he just lays the bricks in the order they are in his pile and hopes for the best.
         * First he places the bricks in the first layer, left to right;
         * after the first layer is complete he moves to the second layer and completes it, and so on.
         * He only lays bricks horizontally, without rotating them.
         * If at some point he cannot place a brick and has to leave a layer incomplete,
         * then he gets annoyed and leaves. It does not matter if he has bricks left over after he finishes.
         * 
         * Yesterday the construction worker previously known as Lars got really annoyed
         * when he realized that he could not complete the wall only at the last layer,
         * so he tore it down and asked you for help.
         * Can you tell whether the construction worker previously known as Lars will complete the wall with the new pile of bricks he has today?
         * 
         * 입력:
         * The first line contains three integers h, w, n (1 ≤ h ≤ 100, 1 ≤ w ≤ 100, 1 ≤ n ≤ 10 000),
         * the height of the wall, the width of the wall, and the number of bricks respectively.
         * The second line contains n integers xi (1 ≤ xi ≤ 10), the length of each brick.
         * 
         * 출력:
         * Output YES if the construction worker previously known as Lars will complete the wall, and NO otherwise.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        
        String input[] = br.readLine().split(" ");
        int w = Integer.parseInt(input[1]); // 벽의 너비
        int n = Integer.parseInt(input[2]); // 벽돌의 개수

        input = br.readLine().split(" ");
        int[] bricks = new int[n]; // 벽돌의 길이 배열
        for (int i = 0; i < n; i++) {
            bricks[i] = Integer.parseInt(input[i]);
        }

        int currentWidth = 0; // 현재 벽의 너비
        boolean canComplete = true; // 벽을 완성할 수 있는지 여부

        for(int i=0; i<n; i++) {
            currentWidth += bricks[i]; 

            if (currentWidth > w) {
                canComplete = false;
                break;
            }

            // 층 변환
            if (currentWidth == w) {
                currentWidth = 0; // 너비 초기화
            }
        }

        sb.append(canComplete ? "YES" : "NO");

        // 결과 출력
        System.out.print(sb);
    }
}
