print("Hello")

# single line comments are written like this
""" 
multi line comments are written like this
"""
first_num = 1
second_num = 9
# 

print(isinstance(second_num,str))

third_num = first_num + second_num 

print(third_num)

x,y,z = 10,3,"World"

print(x)
print(y)
print(z)


message = """Hello 
how"""

print(message)

# boolean types
x = True
y = False


abx = 1 + 10j
print(type(abx))


# python storage structures
# variables

# list
# tuple
# set
# dictionary

# create a list

# permits duplicates
# maintains insertion order
# can store different data types
nums = [9,1,3,10,9,"Hello",True]
print(nums)

# access the list elements by index
print(nums[0])

# acces the list elements with an index range
print(nums[0:2])

print(nums[4:])


# access the last element of the list
print(nums[-1])

# length / size of list
print(len(nums))

# add element at the end of the list - tail
nums.append("Welcome")

print(nums)

# modify values via index 
nums[2] = 71

print(nums)

print("Python List")

# new line character
print("\n")
print(nums[:])


# conditional statements

# if else if else
# get value for x from command line
#x = 11
x = int(input("Please give your value for x :"))

# logical operators
# and
# or
# not

if x > 10 and x < 15:
    print("x is greater than 10")
elif x > 10 and x < 20:
    print("x seems greater than 10 but lesser than 20")
else:
   print("x seems smaller than 10")

if(x < 9):
    if x > 4:
        print("test")
    print("Hello")


# def helo():
#     print("")
#     if x < 11:
#         if x > 5 and x < 9:
#             print("Yes is quite small")
#     print("Oops")

# Assignment 1 : Gimme the list of all the students that have passed in a class with proper grading system.
#               e.g. if a student has 3 subjects : Math / Physics / Chemistry
#                    if he scores less than 50 % in two of those subjects he fails over all
#                    however if he fails in only 1 subject then he fails in just 1 subject, that should be considered 
#                    as re appear
# 
#               Expectations : 
#                           1. Get a list of students failing in more than 2 or more subjects i.e. overall performance of class
#                           2. Get a list of students failing in 1 subject only - i.e. re appearing student
#                           3. Calculate the overall class performance based on students passed - point #1
#                           4. Calculate the overall performance based on grading system, to showcase the %age of
#                              students falling under 
#                                       a. Distinction - 80 % 
#                                       b. First Division - 60 - 79 % 
#                                       c. Second Division - 50 - 59 %



# for loop & while loop

nums = [10,11,17,-1,2]
for i in nums:
    print(i)

# sum 

sum = 0
for i in nums:
    sum = sum + i

print("Sum is ",sum)


# range function

# range(start,end, increment)
nums = range(2,9,2)

print("Traverse via the range values")
for i in nums:
    print(i)


# traverse via the list values using range function to get the index as well

for index in range(len(nums)):
    print("Element in num ",nums[index])

# create an empty list
lst = []
# lst[0] = False
# lst[0] = True
# lst[0] = False

lst.append(False)
lst.append(True)
lst.append(False)
lst.append(False)

# traverse via the values
for l in lst:
    print("Boolean ",l)

lst1 = list()

# lst1[0] = "Hello"
# lst1[1] = "Hi"
# lst1[2] = "Hey"

lst1.append("Hello")
lst1.append("Hey")
lst1.append("Hola")

for ls in lst1:
    print("String ",ls)


# slicing

lst1[0:1]

# add a record at a particular position
lst.insert(0,"Welcome")

# get the position of an element
position = lst.index(False)
print("POSITION ",position)

print("Mix Blendid lst ........")
print(lst)
# extends : add a list to end of another list


n_lst = ["Error","Exception"]
lst1.extend(n_lst)

print(lst1)

# while loop

count = 0

while(count < 5):
    print("Count ",count)
    count = count + 1

for i in range(5):
    if i % 2 == 0:
        print(i)
        if(i == 4):
            break       
        # break - will exit from the loop
        # continue - skip the execution at that point & continue the iteration
        # pass - skip / ignore the statements after this point
        # 
for i in range(0,10):
    if i % 3 == 0:
        pass
        print("I is ",i)

# Assignment 2: Give me a tower of hanoi 

#                   1
#               3       3
#           5       5      5 
#       

# Line 1 : 1s = 1
# Line 2 : 3s = 3 * 2 = 6
# Line 5 : 5s = 5 * 3 = 15
