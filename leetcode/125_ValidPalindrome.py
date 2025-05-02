class Solution:
    def isPalindrome(self, s: str) -> bool:

        new_string = ''.join(char for char in s if char not in string.punctuation and not char.isspace()).lower()

        reverse_string = new_string[::-1]

        if reverse_string == new_string:
            return True

        return False
        