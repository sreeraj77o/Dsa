public class Insertionsort
{
    public static void main(String[] args)
    {
        int arr[]={8,9,7,2,1,3,4};
        System.out.print("Before Sorting: ");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        for(int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.print("After Sorting: ");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}