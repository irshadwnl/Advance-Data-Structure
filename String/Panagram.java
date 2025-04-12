package String;

public class Panagram {
    public static void main(String[] args) {
        String str="the quick brown fox jumps over the lazy dog"; //String
        int freq[]=new int[26];
        // looping
        for(char ch:str.toCharArray()){
            if(ch==' ') continue;
            freq[ch - 'a']++;
        }
        boolean check=false;
        for(int i:freq){
            if(i==0){
                check=true;
                break;
            }
        }
        // condition
        if(check==true){
            System.out.println("Not Panagram");
        }else{
            System.out.println("Panagram");
        }
    }
}
