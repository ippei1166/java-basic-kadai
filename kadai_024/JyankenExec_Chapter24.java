package kadai_024;

public class JyankenExec_Chapter24 {
    public static void main(String[] args) {
       
        Jyanken_Chapter24 game = new Jyanken_Chapter24();

         String myChoice = game.getMyChoice();

        // コンピュータの選択をランダムに取得
        String computerChoice = game.getRandom();

        // ゲームの結果を表示
        game.playGame(myChoice, computerChoice);
    }
}
