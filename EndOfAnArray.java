public class EndOfAnArray {
    public static void main(String[] args) {
        int[] nums = {0,0,8,0,7,0,5,0,6};
        int i = 0;
        System.out.print("\nOriginal array: \n");
        for (int n : nums)
            System.out.print(n+"  ");

        for(int j = 0, l = nums.length; j < l;) {
            if(nums[j] == 0)
                j++;
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i ++;
                j ++;
            }
        }
        while (i < nums.length)
            nums[i++] = 0;
        System.out.print("\nAfter moving 0's to the end of the array: \n");
        for (int n : nums)
            System.out.print(n+"  ");
        System.out.print("\n");

    }
}
