package String;

public class Anagram {
    public static void main(String[] args) {
        // input
        String s1="wcrd";
        String s2="draw";
        int freq[]=new int[26];
        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            freq[ch-'a']--;
        }
        boolean check=false;
        // for each loop
        for(int i:freq){
            if(i!=0){
                check=true;
                break;
            }
        }
        if(check){
            System.out.println("Not Anagram");
        }else{
            System.out.println("Anagram");
        }
    }
}
