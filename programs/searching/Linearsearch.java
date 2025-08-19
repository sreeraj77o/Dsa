public class Linearsearch{
    public static int linearSearch(int[] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {1,3,5,7,9,11,13,15,17,19,21};
        int target = 19;
        int result = linearSearch(nums,target);
        System.out.println("Index of " + target + " is " + result );
    }
}