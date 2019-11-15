"""
len() and str() practice:
1.create a variable and assign it the string "Python"
2.create another variable and assign it the length of the string assigned to the variable in step 1
3.create a variable and use string slicing and len() to assign it the length of the slice "yth" from the string assigned
to the variable from step 1
4.create a variable and assign it the float 1.32
5.create a variable and assign it the string "2" from the float assigned to the variable from the last problem (use the
str() string method for this)
"""
# type your code for "len() and str() practice" below this single line comment and above the one below it --------------
test = "Python"
testLngth = len(test)
sliced = len(test[1:4])
decimal = 1.32
strDecimal = (str(decimal))[3]

print(test," ", testLngth," ", sliced," ",decimal," ", strDecimal)

# ----------------------------------------------------------------------------------------------------------------------
