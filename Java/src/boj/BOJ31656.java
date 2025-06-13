package boj;

import java.io.*;

public class BOJ31656 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * 밤은 앨리스에게 좋아하는 프로그래밍 문제에 대해 문자를 보내고 있는데, 키보드에 커피를 쏟았더니 이제 타이핑할 때 키가 멈춥니다.
         * 며칠 전에는 앨리스에게 곧 있을 "UAPC" 대회에 대해 이야기하려고 했는데,
         * 실키가 멈춘 탓에 실수로 "UAAAAAAPC"를 보냈습니다!
         * 밤은 대학생이라 새 키보드를 살 돈이 없습니다. 밤은 앨리스에게 메시지를 수정하는 프로그램을 만들어 달라고 부탁했습니다.
         * 
         * 여러분의 편의를 위해, 밤은 같은 편지의 복사본이 여러 개 있는 메시지를 사용하지 않기로 했습니다
         * (예: "커피" 사건에 대해서는 쓰지 않기로 했습니다).
         * 따라서 중복된 내용은 항상 한 글자로 줄여야 합니다.
         * 
         * 입력:
         * 입력은 문자열로 구성됩니다. S, 어디든 1 ≤ |S| ≤ 1000인 Bob이 Alice에게 보낸 전체 메시지입니다.
         * 메시지에는 공백으로 구분된 단어가 여러 개 있을 수 있으므로 전체 문자열은 공백을 포함하되
         * S는 메시지의 일부를 간주되어야 합니다.
         * 
         * 문자열엔대문자, 소문자, 숫자, 공백만 포함됩니다.
         * 다행히 커피가 밤의 스페이스바에 닿지 않았기 때문에 공백이 여러 개 연속으로 나타나는 일은 없습니다.
         * 
         * 출력:
         * 반복되는 연속된 문자를 하나의 문자로 압축하여 메시지를 출력합니다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        if (input.length() > 0) {
            sb.append(input.charAt(0));
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) != input.charAt(i - 1)) {
                    sb.append(input.charAt(i));
                }
            }
        }
        // 결과 출력
        System.out.print(sb);
    }
}
