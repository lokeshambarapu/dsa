class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int count=0;
        List<Integer> l=new ArrayList<>();

        for(int i=0;i<nums.length;i=i+2)
        {
            int a=Math.min(nums[i], nums[i+1]);
            l.add(a);
            
        }
        for(int num:l)
        {
            count=count+num;
        }
        return count;
    }
}