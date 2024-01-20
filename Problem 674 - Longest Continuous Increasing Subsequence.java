class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int length = nums.length;

        int count = 1;  //initialize count to 1 for the first element
        int maxLength = 1;  //to maintain the maximum length of subsequences before current

        for (int i = 0; i < length - 1; i++) { //iterate through the array until length-1
            if (nums[i] < nums[i + 1]) { //if the next element is greater than current
                count++; //increment count of current subsequence
                maxLength = Math.max(maxLength, count); //maximum of current subsequence and subsequences encountered until now
            } else {
                count = 1;  //reset count for a new increasing subsequence
            }
        }

        return maxLength;
    }
}
