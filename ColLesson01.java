import java.util.Scanner;

public class ColLesson01 {

    // 登録単語の最大数
    public static final int MAXNUM = 10;

    // 登録された単語を表示する関数
    public static void showWordArray(Word wordArray[], int cnt) {
        System.out.println();
        for (int i = 0; i < cnt; i++) {
            System.out.println("単語: " + wordArray[i].getWord() + " 意味: " + wordArray[i].getMeaning());
        }
        System.out.println(cnt + " 件、登録しました。");
    }

    // メイン関数
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // 配列は要素数を最大数確保する
        Word[] wordArray = new Word[MAXNUM];
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
                showWordArray(wordArray, cnt);
                break;
            }

            // 登録処理
            String[] splitInputText = inputText.split(" ");
            wordArray[cnt] = new Word(splitInputText[0], splitInputText[1]);

            cnt++;
        }

    }
}