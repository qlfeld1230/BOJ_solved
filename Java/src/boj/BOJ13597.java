package boj;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ13597 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * 트라이두는 인기 게임인 트루코에서 파생된 카드 게임입니다.
         * 이 게임은 각 슈트마다 13장씩 총 52장의 표준 카드 덱을 사용하지만, 슈트는 무시됩니다.
         * 1에서 13까지의 정수로 간주되는 카드 값만 사용됩니다.
         * 
         * 이 게임에서는 각 플레이어에게 카드 3장이 나눠집니다.
         * 규칙은 간단합니다.
         * 
         * • 트리오(같은 값의 카드 3장)는 듀오(같은 값의 카드 2장)보다 더 좋습니다.
         * • 높은 값의 카드로 구성된 트리오는 낮은 값의 카드로 구성된 트리오보다 더 좋습니다.
         * • 높은 값의 카드로 이루어진 쌍은 낮은 값의 카드로 이루어진 쌍보다 더 좋습니다.
         * 
         * 게임에서는 많은 경우 승자가 없을 수도 있다는 점에 유의하세요.
         * 이런 경우에는 나눠진 카드를 덱에 다시 넣고 섞은 후 새로운 게임을 시작합니다.
         * 
         * 플레이어는 자신이 받아야 할 카드 두 장을 이미 받았으며, 각 카드의 값을 알고 있습니다.
         * 여러분의 과제는 세 번째 카드의 어떤 값이 플레이어가 게임에서 이길 확률을 최대화하는지를 결정하는 프로그램을 작성하는 것입니다.
         * 
         * 입력:
         * 입력은 두 개의 정수 A(1 ≤ A ≤ 13)와 B(1 ≤ B ≤ 13)를 포함하는 한 줄로 구성되며,
         * 각각은 받은 처음 두 카드의 값을 나타냅니다.
         * 
         * 출력:
         * 프로그램에서는 플레이어가 게임에서 이길 확률을 최대화하는 카드의 가치를 정수로 한 줄에 출력해야 합니다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 첫 번째 카드
        int B = Integer.parseInt(st.nextToken()); // 두 번째 카드

        sb.append(A > B ? A : B); // 더 큰 카드 값을 출력
        System.out.println(sb);
    }
}
