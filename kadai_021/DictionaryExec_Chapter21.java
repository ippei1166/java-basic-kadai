package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter21  words = new Dictionary_Chapter21();
		
		String[] wordConfirmation = { "apple", "banana", "grape", "orange" };
		for (int i = 0; i < wordConfirmation.length; i++) {
            words.searchword(wordConfirmation[i]);
        }
		
	}
}
