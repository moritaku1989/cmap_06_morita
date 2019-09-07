public class Word3{

    String word;
    String meaning;

    // コンストラクタ
    public Word3() {
        this.word = "temp";
        this.meaning = "temp";
    }

    // コンストラクタ
    public Word3(String word, String meaning) {
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

    /**
     * @return the word and the meaning with sentence
     */
    public String toString() {
        return ("単語: " + this.getWord() + " 意味: " + this.getMeaning());
    }

}