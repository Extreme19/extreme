#For Loops and Tuples Problems:
"""
Tuples:
1.create a 4 element tuple that consists of a float, an integer, a Boolean value, and a string. Assingn this tuple to a
variable
2.print the tuple from step 1
3.print the the second element from the tuple you made in step 1
4.print the first element from the tuple you made in step 1
5.slice and print the first 3 elements of the tuple from step 1
6.slice and print the last 3 elements of the tuple from step 1
7.slice and print the middle 2 elements of the tuple from step 1
"""
# ----------------------------------------------------------------------------------------------------------------------
tuple1 = (34.567, True, 12, "Joshua")
print(tuple1)
print(tuple1[1])
print(tuple1[0])
print(tuple1[:3])
print(tuple1[1:])
print(tuple1[1:3])

# ----------------------------------------------------------------------------------------------------------------------
"""
For Loops:
1.create a variable and assign it the tuple ("Bohr", "Leibniz", "Einstein")
2.create a variable and assign it an empty list
3.create a variable and assign it the list [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
4.use a for loop to go through and print each of the elements from the tuple in step 1 individually
5.use a for loop and .append() to add the middle 6 elements to the empty list from step 2
6.print the new list
"""
# ----------------------------------------------------------------------------------------------------------------------
print("  ")
tuple2= ("Bohr","Leibniz", "Einstein")
tuple3 = []
tuple4 = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
for elements in tuple2:
    print(elements)
for val in tuple4[2:8]:
    tuple3.append(val)
print(tuple3)
# ----------------------------------------------------------------------------------------------------------------------