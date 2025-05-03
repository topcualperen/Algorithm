class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:

        newLen = max(len(word1), len(word2))

        resultString = ""

        for i in range(newLen):
            
            if len(word1) > i:
                resultString += word1[i]
            if len(word2) > i:
                resultString += word2[i]
        
        return resultString

        

        
        