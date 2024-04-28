public class Counting_Sort
{
    public static void countingSort(int n[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n.length; i++)
            largest = Math.max(largest, n[i]);
        
        int count[] = new int[largest+1];
        for(int i=0; i<n.length; i++)
        {
            count[n[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++)
        {
            while(count[i] > 0)
            {
                n[j] = i;
                j++;
                count[i]--;
            }
        }

        for(int i=0; i<n.length; i++)
            System.out.print(n[i]+" ");
    }
    public static void main(String[] args)
    {
        int n[] = {2,6,3,5,1,8,9,4,7};
        countingSort(n);
    }
}
