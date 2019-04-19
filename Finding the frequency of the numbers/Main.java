import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        int k = in.nextInt();
        int ind;
        for(ind = 0; ind <arr_size; ind++){
            arr[ind] = in.nextInt();
        }
        int freq[] = new int[k];
        for(ind=0;ind<k;ind++)
        {
            freq[ind] = 0;
        }
        for(ind=0;ind<arr_size;ind++)
        {
           freq[arr[ind]-1]++;
        }
        for(ind=0;ind<k;ind++){
           System.out.println((ind + 1) + " " + freq[ind]);
        }
    }
}
     	// Type your code here
    