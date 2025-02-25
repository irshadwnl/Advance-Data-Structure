package String;
import java.util.*;
public class freqOfCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str=s.toLowerCase();
        int freq[]=new int[26];
        for(char ch:str.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.print((char)((char)i+'A')+" -> "+ freq[i]+" ");
            }
        }
    }
    
}