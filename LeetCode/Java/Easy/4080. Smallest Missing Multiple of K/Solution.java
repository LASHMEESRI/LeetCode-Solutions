class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set <Integer>multiplesSet = new HashSet<>();
        for(int num : nums){
            if (num%k==0 && num>0){
                multiplesSet.add(num);
            }
        }
        int candidate=k;
        while(true){
            if(!multiplesSet.contains(candidate)){
                return candidate;
            }
            candidate+=k;
        }
    }
}