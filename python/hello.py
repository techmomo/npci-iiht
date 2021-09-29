from os import name
import os


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

# Assignment 2: Give me a tower of hanoi - 5 levels

# Expected OUTPUT PART 1:
#                   1
#               3       3
#           5       5      5 
#       

# Expected OUTPUT PART 2:

# Row 1 : 1s = 1
# Row 2 : 3s = 3 * 2 = 6
# Row 3 : 5s = 5 * 3 = 15


# Assignment 3: 
# Expected OUTPUT PART 1: (the step increment is being )
#                   1
#               4       5
#           7       8      9 
#       

# Expected OUTPUT PART 2:

# Row 1 : = 1
# Row 2 : = 4 + 5 = 9
# Row 3 : = 7 + 8 + 9 = 24

# (Last row will have the 
# sum of all the rows )Row 4 : = Row 1 + Row 2 + Row 3 = 1 + 9 + 24 = ?

# Expected OUTPUT PART 3:

# Create a matrix from the Inversed Tower of Hanoi
# e.g. for above tower
#  [7,8,9]
#  [4,5,0]
#  [1,0,0]

#  [7,8,9]
#  [4,5,0]
#  [1,0,0]
# Expected OUTPUT PART 4:

# Calculate the sqaure of the generated matrix
# 
#  [49,64,81]
#  [16,25,0]
#  [1,0,0]



# tuple

nums_tuple = (10,12,9,4)

print(nums_tuple)

xx,yy,zz,aa = nums_tuple

print(xx)
print(yy)
print(zz)

for n in nums_tuple:
    print(n)


# check for an element , if it exists
print(10 in nums_tuple)

nums_tuple_ls = list(nums_tuple)
nums_tuple_ls.append(15)
nums_tuple = tuple(nums_tuple_ls)

print(nums_tuple)


# cleaning the tuple

#del nums_tuple

print(min(nums_tuple))


multi_tuple = ("hi",1,2)

# not permitted in case of heterogeneous values
#print(min(multi_tuple))

m_tuple = (10,20,[25,75,85])

print(m_tuple)

# modify the list within the tuple
m_tuple[2][1] = -22

print(m_tuple)

#           Find the occurences at each level for all the root elements, incase they dont exist , we can skip their execution    
# Assignment 1: (1,2,5, - Root
#                   (5,8,9,- Level 1
#                       (1,5), (8,7,1, - Level 2
#                           (5,1) - Level 3
#                               ))) 
# Expected :
#               1
#                 -
#                   1 1
#                     1
#               5
#                 5
#                   -
#                     5


is_tuple = isinstance(m_tuple,list)
print("Is Tuple ",is_tuple)


# Strings 


msg = 'Hello how are you'
msg1 = "Hi , 'Mr James' we welcome you"

msg2 = '''He asked, "did you talk to Andrews?"
I said yes he was good '''


print(msg)
print(msg1)
print(msg2)

print(msg[5:-2])

#msg[1]='a'

#print(msg)


# traverse via the string

count = 0

for _char in msg:
    print(_char)
    if(_char == 'h' or _char == 'H'):
        count = count + 1
print('H was found ',count)


# format method
# curly braces are used for replacements
raw_string = "{} {} , {}".format('Welcome','to','Disney Land')
print(raw_string)

# positioned placeholders

raw_string = "{1} {2} , {0}".format('Welcome','to','Disney Land')
print(raw_string)

# keyword placeholders
raw_string = "{a}, {c}, {b}".format(a='Hello',b='Welcome',c='Wonderland')
print(raw_string)


# list =  [] - maintains order / allows duplication / allows modifications
# tuple = () - maintains order / allows duplication / doesnt allow modifications
# set = {} - no order / doesnt allow duplication (supports uniqueness) / doesnt allow modifications
# dict = {:} - no order / uniqueness for keys / key is immutable (string / number or tuple)

user_ids = {1,9,22,18,17,9}

print(user_ids)

# enable modifications in a set

user_ids.add(2)
print(user_ids)

# user_ids = {9,8,[5,6]}
# print(user_ids)


color_set = {'red','blue','green'}
add_color_set = {'pink','purple','blue'}

# union of two sets

# pipe operator
multi_color_set = color_set | add_color_set

print(multi_color_set)

# union function

multi_color_set = color_set.union(add_color_set)
print(multi_color_set)


# intersection of two sets

# difference of two sets that are only in color_set but not in add_color_set
multi_color_set = color_set - add_color_set
print(multi_color_set)

# difference of two sets that are only in add_color_set but not in color_set
multi_color_set = add_color_set - color_set
print(multi_color_set)

# same can be done via 
multi_color_set = color_set.difference(add_color_set)
print(multi_color_set)

#
multi_color_set = color_set.symmetric_difference(add_color_set)
print(multi_color_set)


# Assignment 1: Sort a group of elements in a set in descending order 
# Assignment 2: Check if 3 strings are anagram(different strings but same set of characters & their occurences) without using temp variable
# Assignment 3: Write a Program to find the numbers absent from a sequence of numbers e.g. [0,1,2,5] , 
#               step should be dynamic,missing number should be located based on the step
# Expected Output : 3,4 are missing


# lst = [1,3,5,9]
# step = 2

# empty dictionary
user_dict = {}

# integer keys
user_dict = {1:'One',2:'Two',3: 'Three'}
print(user_dict)

# complex / hetergeneous keys
user_dict = { 'One': 1, 2: 'Two', (1,2): (1,2,3)}
print(user_dict)

for u in user_dict.items():
    print('KEY :',u[0], ', VALUE :',u[1])

print('For Loop ends..')
# associative array
#print(user_dict['Five'])

# get method
print(user_dict.get('Five'))

user_dict['One'] = 'OneOne'

# add a new key / value pair
user_dict['Seven'] = 7

# use same key to add a new value 
user_dict['Seven'] = 9

print(user_dict)

# removals

result = user_dict.pop('One')

print('RESULT POP: ',result)
print(user_dict)

# removes the last record
result = user_dict.popitem()

print('RESULT Pop Item: ',result)
print(user_dict)

# remove all items in the dict
user_dict.clear()

print(user_dict)

# create dict from keys with a default value
marks_dict = {}.fromkeys(['Phy','Chem','Maths'],1)
print(marks_dict)

# dict comprehension

squares = { x: x for x in range(6)}

print(squares)


# conditional comprehension
odd_squares = {y : y * y for y in range(11) if y % 2 == 1}
print(odd_squares)

nums_dict = {5:'Five',8:'Eight',2:'Two',3: 'Three'}
# sort the dictionary

nums_dict = sorted(nums_dict)
print(nums_dict)

# check type 
if isinstance(odd_squares,dict):
    print('this is a dictionary')

# update 
odd_squares.update({ 10: 10})

print(odd_squares)


dict1 = {'One': 1,'Two': 2}
dict2 = {'Five':5, 'Six':6}

# concat 2 dictionaries
# dict1.update(dict2)
# print(dict1)

# concat using **kwargs
new_dict = {**dict2,**dict1}
print(new_dict)

# nested dictionaries

address = { 'city': 'bengaluru','state': 'Karnataka','zip': '560045'}
person = {'name': 'Mohsin','email': 'gg@gg.com','phone': '123456789','address': address}

print(person)

# view nested key values
print('City :',person['address']['city'])

# not allowed in case of nested dictionary / multi varied data items
# sort values
# sorted_person = sorted(person.values())
# print(sorted_person)

# Assignment : 


# function

# *args
# **kwargs
#callMe(**kwargs):

# callMe(name='Tech',id= 1)


# functions in python
def say_hello():
    print('Func: Hello')
    _xx = 11
    return 'Say hello'

# call the function
#print(_xx)
resp = say_hello()
print(resp)

# function with default value for the parameter
def calculate(i,j=0):
    return i + j

print(calculate(11))

print(calculate(11,9))



# *args - Arbitrary Arguments

def process(*msgs):
    for msg in msgs:
        print('Process :: ',msg)

process('Hello')
process('Welcome','to','Python')


# **kwargs - Keyword Arguments

def process_me(**items):
    for item in items.items():
        print('KEY :',item[0], 'VALUE :',item[1])

process_me(name='Hello')
process_me(name='John',email='joe@gmail.com',id= 101)


# global variable
index_val = -1

def execute(num1,num2):
    add = num1 + num2 - index_val
    diff = num1 - num2
    mul = num1 * num2
    div = num1 / num2
    global xyz
    xyz = 12
    # return multiple values
    return add, diff,mul,div


sum,diff,prod,div = execute(12,4)

print(sum)
print(diff)
print(prod)
print(div)
print(xyz)


# Assignment 4: sort the dict based on its values 
#               e.g. dict = {'One': 'Two','Two':'One','Five': 'Five'}
#               Expected Output : {'Five': 'Five','Two': 'One', 'One': 'Two'}

# Assignment 5: Write a Program to perform merge sort on a tuple , set , dict , list
#               Note : we can consider string values not integers

# global 
# local variables
# non local variables

def calc(_msg,i):
    _str = _msg
    print('Calc ')
    _index = i
    def add():
        nonlocal _index
        _index = 1
        print(_str)
        print("Index: ",_index)
    
    return add

# call outer method
add_calc = calc('calc_add',12)
# call returned method
add_calc()


# anonymous functions / lambdas

add_me = lambda x,y: x + y

result = add_me(10,2)
print('SUM ',result)


def calculate(action):
    if action == 'SUM':
        return lambda x,y : x + y
    elif action == 'DIFF':
        return lambda x,y : x - y
    elif action == 'MUL':
        return lambda x,y : x * y
    else:
        return 0

add = calculate('SUM')
print(add(9,2))
diff = calculate('DIFF')
print(diff(8,2))
prod = calculate('MUL')
print(prod(8,3))



# build in functions
# abs
# all , any
# callable, compile , complex
# map, filter, dict, list, tuple, eval, globals
# input, int, isinstance, type, len, max, min, next


# higher order functions

# filter - filter out elements meeting a particular criteria
all_nums = [9,19,1,2,7,6,8,4,24,12]

all_nums = list(filter(lambda x:x % 2 == 1,all_nums))
print(all_nums)

# transform the elements into another form
all_nums = list(map(lambda x: x * x, all_nums))

print(all_nums)

# Assignment 1: Write a program to leverage closure / lambdas to perform - accept the choice from the user what step he wants to execute
#               1. add a new element to the list - take the elements from the user
#               2. create dict from the list 
#               3. sort dict in descending order based on value 


# Assignment 2: Calculate the last 3 transaction(mini statement) done on a debit card w.r.to the amount available, 
#               note he cannot withdraw more than the balance & available currency notes
#               e.g. if an atm has 100 * 2 , 200 * 3, 500 * 10 = 200 + 600 + 5000 = 5800 
#                   the total withdrawal amount cannot be more than than 90 % of the ATM cash e.g. as per above 90% of 5800 
#                   (i.e. 5220 round off 5200 since we dont have 20 rs notes)
# Assumptions : 
#                   1. Currency in the ATM is fixed 
#                   2. Balance for the Debit Card is predeclared
#                   3. No of transactions to be shown is fixed to last 3
#  

dt = {}
def get_key(value):
    for k,v in dt.items():
        if(v == value):
            return k

get_key("v")


_dicth = {1:1,2:2}

# sorting a dict by value
sortd_dict = dict(sorted(_dicth.items(),key=lambda item : item[1] ))
sortd_dict = {key:val for key,val in sorted(_dicth.items(),key= lambda item : item[1])}

# def test():
#     return 1,"Helo"

# k,v = test()

for item in _dicth.items():
    print(item[1])

#Collections.sort(_dicth.entrySet(),(ob1,obj2)-> return obj1 - obj2)


# open()
# close()
# write()

# Mode - 
# r - to read a file
# w - to write to a file
# b - read in binary format
# a - for appending to an existing file
# + - concat operator in case we want to perform multiple operations on a file (read + write)


#file = open('sample.txt','r')

# with keyword
#with open('sample.txt','r', encoding='utf-8') as f:
    # traverse via the file object 
    # read all lines
    # for line in file:
    #     print(line)
#    print(f.read())

# file.write('Hello')
# file.write('\n')
# file.write('World')


#print(file.read(4))


# close a file
#file.close()
#print(file.readline(1))

file1 = open('sample.txt','a+')
#for line in file1:
#    print("LINE")
    # if file1.tell() > 9:
    #     file1.seek(5)
    # else:
    #     continue
#current file cursor location
#print(file1.tell())
#print(file1.readline())
# change the position of the cursor
#print(file1.seek(-10,2))
print(file1.read())
file1.seek(2)
file1.write('\nLine4')
#print(file1.tell())



with open('sample.txt','r') as f:
    print(f.tell())
    with open('newsample.txt','w') as f2:
        if f.tell() == 2:
            f2.write("Line4")
        f2.write(f.read())
    #os.rename('newsample.txt','sample.txt') 


# Assignment 3: Add a list to the file as comma separated values. 
#                   [
#                       [Mohsin,mm@gg.com,1283],
#                       [Test,tt@usr.com,9999],
#                       [UserName,email,126487,city,street ],
#                       [],
#                       [],
#                       [Test,tt@usr.com,9999,houston,long street,20122] X
#                   ]
#               & then read the content of the file & parse that into a tuple
# Assumption : First row of the file will have column headers
#              List to be written can have multiple values, however first three values would be : name, email, phone_no
#              Avoid duplicate users, 