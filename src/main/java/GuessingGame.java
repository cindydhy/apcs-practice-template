public class GuessingGame {
    String secretWord;
    int length = secretWord.length();

    public void getGuess(String guess) {
        for (int i = 0; i <= length; i++) {
            if (guess.indexOf(i) == secretWord.indexOf(i))
                System.out.print("^");
            else 
                System.out.println("|_|");
        }
    }

    
    
}
