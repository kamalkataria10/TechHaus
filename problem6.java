import java.util.Scanner;

public class problem6 {
    public static String findStringWithMostVowels(String[] strings) {
        String maxVowelString = "";
        int maxVowels = 0;

        for (String str : strings) {
            int vowelsCount = countVowels(str);
            if (vowelsCount > maxVowels) {
                maxVowels = vowelsCount;
                maxVowelString = str;
            }
        }

        return maxVowelString;
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        String mostVowelsString = findStringWithMostVowels(strings);
        System.out.println("String with most vowels: " + mostVowelsString);

        scanner.close();
    }



}
