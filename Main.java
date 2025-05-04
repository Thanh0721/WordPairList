public class Main {
    public static void main(String[] args) 
    {
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        System.out.println("Example 1 Pairs: " + exampleOne.getAllPairs());
        System.out.println("Example 1 Matches: " + exampleOne.numMatches());

        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        System.out.println("\nExample 2 Pairs: " + exampleTwo.getAllPairs());
        System.out.println("Example 2 Matches: " + exampleTwo.numMatches());

        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println("\nExample 3 Pairs: " + exampleThree.getAllPairs());
        System.out.println("Example 3 Matches: " + exampleThree.numMatches());
    }
}