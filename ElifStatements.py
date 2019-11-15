#If, Else, and Elif Problems:
"""
For this problem you are going to make a program that simulates the output of a vending machine that only takes in
coins of American currency.
1.Your program should take an integer as an input from the user (either a 1, 2, or 3) that corresponds with an option
for a drink from the vending machine outlined below and assign the corresponding price to a variable as a float.
Use your knowledge of if, elif, and else statements to complete this part of the problem. Your code should
have an else statement that prints a message and ends the program using sys.exit() if the user does not enter a valid
input number.
Vending Machine:
1.water = $1.00
2.cola = $1.50
3.gatorade = $2.00
2.After placing an order, the user should be prompted to enter inputs 4 times:
1.The first time, the user should be prompted to enter the number of quarters they put in the machine. Assign this
number to a variable as an integer.
2.The second time, the user should be prompted to enter the number of dimes they put in the machine. Assign this
number to a variable as an integer.
3.The third time, the user should be prompted to enter the number of nickles they put in the machine. Assign this
number to a variable as an integer.
4.The fourth time, the user should be prompted to enter the number of pennies they put in the machine. Assign this
number to a variable as an integer.
3.Create a variable to hold the total value of all the coins the user has put into the machine.
4.Use flow control statements to print the user's change or output a message asking the user to try again depending
on whether the total value of the coins the user has put into the machine is enough to pay for the item they ordered.
New knowledge for this problem:
1.%f format specifier
2.import sys and sys.exit()
3.int()
"""
import sys
choice = int(input(print("Welcome what would you like?, please enter 1 for water($1.00), 2 for cola($1.50),"
                         " 3 for gatorade($2.00)")))
if choice == 1:
    water = 1.00
    quarters = int(input(print("enter the number of quarters you had put in the machine")))
    dimes = int(input(print("enter the number of dimes you had put in the machine")))
    nickels = int(input(print("enter the number of nickels you had put in the machine")))
    pennies = int(input(print("enter the number of pennies you had put in the machine")))
    totalValueOfCoin = quarters + dimes + nickels + pennies
    if totalValueOfCoin > water:
        print("You bought Water and your change is: ", totalValueOfCoin - water)
    elif totalValueOfCoin < water:
        print("Oops! you appear to be short of cash for what you want... please try again")
elif choice == 2:
    cola = 1.50
    quarters = int(input(print("enter the number of quarters you had put in the machine")))
    dimes = int(input(print("enter the number of dimes you had put in the machine")))
    nickels = int(input(print("enter the number of nickels you had put in the machine")))
    pennies = int(input(print("enter the number of pennies you had put in the machine")))
    totalValueOfCoin = quarters + dimes + nickels + pennies
    if totalValueOfCoin > cola:
        print("You bought Cola and your change is: ", totalValueOfCoin - cola)
    elif totalValueOfCoin < cola:
        print("Oops! you appear to be short of cash for what you want... please try again")
elif choice == 3:
    gatorade = 2.00
    quarters = int(input(print("enter the number of quarters you had put in the machine")))
    dimes = int(input(print("enter the number of dimes you had put in the machine")))
    nickels = int(input(print("enter the number of nickels you had put in the machine")))
    pennies = int(input(print("enter the number of pennies you had put in the machine")))
    totalValueOfCoin = quarters + dimes + nickels + pennies
    if totalValueOfCoin > gatorade:
        print("you bought Gatorade and Your change is: ", totalValueOfCoin - gatorade)
    elif totalValueOfCoin < gatorade:
        print("Oops! you appear to be short of cash for what you want... please try again")
else:
    sys.exit()