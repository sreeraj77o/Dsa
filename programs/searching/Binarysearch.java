public class Binarysearch{
    public static int binarySearch(int[] nums,int target)
    {
        int left= 0 ; 
        int right= nums.length - 1;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]< target)
            {
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int target =12;
        System.out.println("Index of " +target+ " is " +binarySearch(nums,target));
    }
}