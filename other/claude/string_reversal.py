
def is_palindrome(s):
    cleaned = ''.join(c.lower() for c in s if c.isalnum())
    return cleaned == cleaned[::-1]

word = input("Enter a input: ")
if is_palindrome(word):
    print("It is a palindrome")
else:
    print("It is not a palindrome")