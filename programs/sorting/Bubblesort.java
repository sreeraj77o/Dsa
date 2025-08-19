public class Bubblesort
{
    public static void main(String[] args)
    {
        int nums[] = {9,3,5,2,1,8,7,6,4,0};
        int temp= 0;
        int size = nums.length;

        System.out.print("Before Sorting: ");
        for(int num:nums)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            System.out.print("After Sorting: ");
            for(int num:nums)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}