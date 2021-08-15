public class Java_Practice_27 {
    //Java Program to Reverse a Sentence Using Recursion
    public static void main(String[] args) {
        String Sentence = "My name is Imtiaz";
        String reversedSentence = reverse(Sentence);
        System.out.println("The reversed sentence is " + reversedSentence);
    }
    public static String reverse(String Sentence) {
        if (Sentence.isEmpty())
            return Sentence;
        else
            return reverse(Sentence.substring(1)) + Sentence.charAt(0);
    }
}