//TIME COMPLEXITY ---> O(n^2)
public class Bubble_Sort
{
    public static void bubbleSort(int n[])
    {
        for(int i=0; i<n.length-1; i++)
        {
            int swaps = 0;
            for(int j=0; j<n.length-1-i; j++)
            {
                if(n[j] > n[j+1])
                {
                    swaps++;
                    int temp;
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
            if(swaps == 0)
                break;
        }
        for(int i=0; i<n.length; i++)
            System.out.print(n[i]+" ");
    }
    public static void main(String[] args)
    {
        int n[] = {1,2,3,4,5,6};
        bubbleSort(n);
    }
}
