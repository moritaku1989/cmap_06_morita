import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {

    // 登録された単語を表示する関数
    public static void showWordArray(ArrayList<Word> wordArray) {
        System.out.println();
        for (int i = 0; i < wordArray.size(); i++) {
            System.out.println(wordArray.get(i).toString());
        }
        System.out.println(wordArray.size() + " 件、登録しました。");
    }

    // メイン関数
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // 配列は要素数を最大数確保する
        ArrayList<Word> wordArray = new ArrayList<Word>();
        int cnt = 0;

        // 文字を読み取るループ
        while(true) {
            if (cnt == 0) {
                System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
            } else {
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
            }

            String inputText = scanner.nextLine();

            // 終了処理
            if(inputText.equals("e")) {
                showWordArray(wordArray);
                break;
            }

            // 登録処理
            String[] splitInputText = inputText.split(" ");
            Word word = new Word(splitInputText[0], splitInputText[1]);
            wordArray.add(word);

            cnt++;
        }

    }
}
