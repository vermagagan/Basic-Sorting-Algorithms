//TIME COMPLEXITY ------> O(n^2)
public class Selection_Sort
{
    public static void selectionSort(int n[])
    {
        for(int i=0; i<n.length-1; i++)
        {
            int min=i;
            for(int j=i+1; j<n.length; j++)
            {
                if(n[j] < n[min])
                {
                    min = j;
                }
            }
            int temp;
            temp = n[min];
            n[min] = n[i];
            n[i] = temp;
        }
        for(int i=0; i<n.length; i++)
            System.out.print(n[i]+" ");
    }
    public static void main(String[] args)
    {
        int n[] = {1,5,2,4,6,7,8};
        selectionSort(n);
    }
}
