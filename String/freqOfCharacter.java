package String;
import java.util.*;
public class freqOfCharacter {
    public static void main(String[] args) {
        // Input from user
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str=s.toLowerCase();
        // intitializing array
        int freq[]=new int[26];
        for(char ch:str.toCharArray()){
            freq[ch-'a']++;
        }
        // looping
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.print((char)((char)i+'A')+"->"+ freq[i]+" ");
            }
        }
    }
    
}