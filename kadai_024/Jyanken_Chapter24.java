package kadai_024;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter24 {
    HashMap<String, String> handsMap = new HashMap<String, String>();
    Scanner scanner = new Scanner(System.in);  

    public Jyanken_Chapter24() {
        handsMap.put("r", "グー");
        handsMap.put("s", "チョキ");
        handsMap.put("p", "パー");
    }

    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう ");
        String input = scanner.nextLine();  // 入力を受け取る
        String hand = handsMap.get(input);

        if (hand != null) {
            System.out.println("自分の手は " + hand);
            return input;  // 正しい入力の場合
        } else {
            System.out.println("入力された内容が間違っています。もう一度入力してください。");
            return getMyChoice();  // 不正な入力の場合
        }
    }

    public String getRandom() {
        String[] choices = {"r", "s", "p"};
        int index = new Random().nextInt(choices.length);  // ランダム
        String computerChoice = choices[index];
        System.out.println("対戦相手の手は " + handsMap.get(computerChoice));
        return computerChoice;
    }

    public void playGame(String myChoice, String computerChoice) {
        if (myChoice.equals(computerChoice)) {
            System.out.println("あいこです！");
        } else if ((myChoice.equals("r") && computerChoice.equals("s")) ||
                   (myChoice.equals("s") && computerChoice.equals("p")) ||
                   (myChoice.equals("p") && computerChoice.equals("r"))) {
            System.out.println("自分の負けです！");
        } else {
            System.out.println("あなたの勝ちです");
        }
    }

}
