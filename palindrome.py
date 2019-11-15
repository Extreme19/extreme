"""
a palindrome checks the entered word to see if its the same from left or right
"""
palindrome = input('enter the palindrome word')
left = []
right = []
for leftToRight in palindrome:
    left.append(leftToRight)
i = 0
length = len(left)
while i < len(left) :
    right.insert(i, left[(length - (i+1))])
    i += 1
if left == right:
    print(left, " is a palindrome")
elif left != right:
    print(left, "not palindrome")
