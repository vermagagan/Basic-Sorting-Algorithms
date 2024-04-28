//TIME COMPLEXITY ----> O(nlogn)import java.util.Arrays;

import java.util.Arrays;
public class Inbuilt_Sort
{
    public static void main(String[] args)
    {
        int n[] = {2,5,3,1,6};
        Arrays.sort(n);
        for(int i=0; i<n.length; i++)
            System.out.print(n[i]+" ");
    }
}
