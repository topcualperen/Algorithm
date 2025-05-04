class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:

        '''
        newLen = len(nums) * 2

        resultList = []

        for i in range(newLen):

            resultList.append(nums[i % len(nums)])
    

        return resultList
        '''

        return nums + nums