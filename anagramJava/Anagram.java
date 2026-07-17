import java.util.Scanner;

public class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2.toLowerCase();

        int[] count = new int[26];

        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            sc.close();
            return;
        }
        for(char ch : str1.toCharArray()){
            count[ch-'a']++;
        }
        for(char ch : str2.toCharArray()){
            count[ch-'a']--;
        }

        boolean ans = true;
        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                ans = false;
                break;
            }
        }

       System.out.println(ans ? "Anagram" : "Not Anagram");

       sc.close();
    }
}