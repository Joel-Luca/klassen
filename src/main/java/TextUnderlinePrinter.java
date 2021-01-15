import java.util.Arrays;

public class TextUnderlinePrinter {
    public static void main(String[] args) {

        String outputText = "Man wird nicht dadurch besser, dass man andere schlecht macht.";
        String underlinedWord = "besser";
        System.out.println(outputText);
        underline(outputText, underlinedWord);
    }

    public static void underline(String output, String underlineWord) {
        String[] text = output.split(" ");

        for(int j = 0; j < text.length; j++) {
            String[] letters = text[j].split("");

            for(int i = 0; i < letters.length; i++) {
                if(letters[i].equals(",")) {
                    letters[i] = "";

                    text[j] = "";
                    for(String letter : letters) {
                        text[j] += letter;
                    }
                }
            }
        }

        String underline = "";

        for(String word : text) {
            if(!word.equals(underlineWord)) {
                for(int i = 0; i <= word.length(); i++) {
                    underline += " ";
                }
            }
            else {
                for(int i = 0; i < underlineWord.length(); i++) {
                    underline += "-";
                }
            }
        }
        System.out.println(underline);
    }
}
