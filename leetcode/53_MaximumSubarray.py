class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currentSum = nums[0]
        maximumSum = nums[0]

        for i in range(1, len(nums)):
            currentSum = max(nums[i], nums[i] + currentSum)
            maxSum = max(currentSum, maxSum)
        
        return maxSum