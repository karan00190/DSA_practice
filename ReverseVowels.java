// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E'|| ch=='I' || ch=='O'|| ch=='U')
        {
            return true;
        }
        
        return false;
        
        
    }
    public static String ToreverseVowels(String s)
    {
        char[] arr = s.toCharArray();
        int n = s.length();
        int i =0;
        int j =n-1;
        
        while(i<j)
        {
            if(!isVowel(arr[i]))
            {
                i++;
            }
            else if(!isVowel(arr[j]))
            {
                j--;
                
            }
            if(isVowel(arr[i]) && isVowel(arr[j]))
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                i++;
                j--;
            }
        }
        return new String(arr);
        
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(ToreverseVowels(s));
        
        
        
        
    }
}