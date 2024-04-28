//TIME COMPLEXITY -----> O(n^2)
public class Insertion_Sort
{
    public static void insertionSort(int n[])
    {
        for(int i=1;  i<n.length; i++)
        {
            int curr = n[i];
            int prev = i-1;
            while(prev >=0 && n[prev] > curr)
            {
                n[prev+1] = n[prev];
                prev--;
            }
            n[prev+1] = curr;
        }
        for(int i=0; i<n.length; i++)
            System.out.print(n[i]+" ");
    }
    public static void main(String[] args)
    {
        int n[] = {5,4,2,1,3};
        insertionSort(n);
    }
}
