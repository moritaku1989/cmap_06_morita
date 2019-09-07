public class Word {

    String word;
    String meaning;

    // コンストラクタ
    public Word() {
        this.word = "temp";
        this.meaning = "temp";
    }

    // コンストラクタ
    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @return the meaning
     */
    public String getMeaning() {
        return meaning;
    }

}