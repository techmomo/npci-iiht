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

