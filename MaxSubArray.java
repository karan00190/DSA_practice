// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int MaxSubArray(int nums[],int k)
    {
        int n = nums.length;
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        int i =0;
        int j =0;
        
        while(j<n)
        {
            sum = sum + nums[j];
            if(j-i+1 < k)
            {
                j++;
            }
            else if(j-i+1 == k)
            {
                mx = Math.max(mx,sum);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,55,6,7,9,12,34};
        int k = 3;
        System.out.println("Maximum subarray is "+MaxSubArray(arr,k));
        
    }
}