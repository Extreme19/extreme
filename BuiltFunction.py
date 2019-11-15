#Built-In Functions Problems:
"""
abs() and type():
1.use abs() to get and print the absolute value of a positive number
2.use abs() to get and print the absolute value of a negative number
3.use type() to get and print the type of a float
4.use type() to get and print the type of an integer
5.use type() to get and print the type of a boolean value
6.use type() to get and print the type of a string
"""
# ----------------------------------------------------------------------------------------------------------------------
val = int(input("enter a negative number"))

print("absolute value is", abs(val))
print(12, "is of the type: ", type(12))
print('x', "is of the type: ", type('x'))
print(0.67, "is of the type: ", type(0.67))
print(False, "is of the type: ", type(False))
print(12, "is the absolute value of: ", abs(12))


# ----------------------------------------------------------------------------------------------------------------------
"""
max() and min():
1.use max() to get and print the largest of inputs of your choosing that are all integers
2.use max() to get and print the alphabetical maximum of inputs of your choosing that are all strings
3.use min() to get and print the smallest of inputs of your choosing that are all floats
4.use min() to get and print the alphabetical minimum of inputs of your choosing that are all strings
"""
# ----------------------------------------------------------------------------------------------------------------------
a = 0
li = [3]
alph = [3]
for a in li[:]:
    li[a] = int(input("enter a number"))
    alph[a] = input("enter a letter")

maximumLi = max(li[0:3])

a = input("enter a number")
b = input("enter a number")
c = input("enter a number")
d = input("enter a letter")
e = input("enter a letter")
f = input("enter a letter")
print("the maximum number is: ", max(int(a),int(b), int(c)))
print("the minimum number is: ", min(int(a),int(b), int(c)))
print("the maximum letter is: ", max(d,e,f))
print("the minimum letter is: ", min(d,e,f))
# ----------------------------------------------------------------------------------------------------------------------