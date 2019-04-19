import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder temp = new StringBuilder("");
        int sb1_len = sb1.length();
        int sb2_len = sb2.length();
      int ind;
        for(ind = 0; ind <= (sb1_len -1); ind++){
            char ch = sb1.charAt(ind);
            temp.append(ch);     
        }
        for(int idx = 0; idx <= (sb1_len -1); idx++){
            char ch = sb1.charAt(idx);
            temp.append(ch);     
        }
        int temp_len = temp.length();
        // Substring searching function call
        int index = substring(temp, temp_len, sb2, sb2_len);
        if(index != -1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    public static int substring(StringBuilder str1, int str1_len, StringBuilder str2, int str2_len)
    {
        int matching_ind = -1;
        for (int i = 0; i < (str1_len - str2_len + 1); i++)
        {
            boolean is_matching = true;
            for(int j = 0; j < str2_len; j++)
            {
                if(str1.charAt(i + j) != str2.charAt(j))
                {
                    is_matching = false;
                }
            }
            if(is_matching == true)
            {
                matching_ind = i;
                break;
            }
        }
        return matching_ind;// Type your code here
    }
}