#Boolean Operators Problems:
"""
and, or, and not:
1.create a variable and set it equal to True using a statement containing an "and" Boolean operator
2.create a variable and set it equal to False using a statement containing an "and" Boolean operator
3.create a variable and set it equal to True using a statement containing an "or" Boolean operator
4.create a variable and set it equal to False using a statement containing an "or" Boolean operator
5.create a variable and set it equal to True using a statement containing an "not" Boolean operator
6.create a variable and set it equal to False using a statement containing an "not" Boolean operator
"""
# type your code for "and, or, and not" below this comment and above the one below it.------------------------------
val1 = 1 < 2 and 2 < 4
val = 24 == 5 and 5 > 2
val2 = 0 or 1 or 3
val3 = 3>4 or 5==5
val4 = 9 >10 or 25 != 25
val5 = 64 > 12 and not 64 > 74
val6 = 14 >= 5 and not 14 > 12



# ----------------------------------------------------------------------------------------------------------------------
"""
order of operations for Boolean operators:
1.make var1 evaluate to False by changing or removing a single Boolean operator
2.make var2 evaluate to True by changing or removing a single Boolean operator
"""
# type your code for "order of operations for Boolean operators" below this comment and above the one below it. --------
val7 = not 3 > 1 and 5 != 2 or 6 != 6
val8 = 4 * 2 != 6 and 7 % 6 == 1
# ----------------------------------------------------------------------------------------------------------------------
print(val1, val, val2, val3, val4, val5, val6, ":", val7, val8)