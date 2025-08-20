public class Selectionsort
{
    public static void main(String[] args)
    {
        int nums[] = {9,3,5,2,1,8,7,6,4,0};
        int temp= 0;
        int size = nums.length;
        int minIndex= -1;
        System.out.print("Before Sorting:");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
        for(int i=0;i<size-1;i++)
        {
            minIndex = i;
            for(int j=i+1;j<size-1;j++)
            {
                if(nums[minIndex]>nums[j])
                {
                    minIndex = j;
                }
            }
            temp =nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }
        System.out.println();
        System.out.print("After Sorting:");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
    }
}