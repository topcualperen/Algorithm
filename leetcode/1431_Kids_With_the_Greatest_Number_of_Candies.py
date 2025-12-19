class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        
        maxCandy = max(candies)
        result = []
        for candy in candies:
            result.append(candy + extraCandies >= maxCandy)
        return result