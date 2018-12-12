#INPUT
# Create a class Student with name, age, height
# input a list of students [{name: 'abc', age: 15, height: 5.5}, {name: 'xyz', age: 20, height: 5.7} . . . ]
#OUTPUT
# the program should prompt from user. If user types 1, it should sort the students based on name, 2 sort on age, 3 sort on height
import select
import operator


class Student:
    """student details"""

    def __init__(self, name, age, height):
        self.name = name
        self.height = height
        self.age = age

    def __repr__(self):
        return '%s %d %f' % (self.name, self.age, self.height)


studobj = [
    Student('hemanth',24,5.10),
    Student('xyz',150,6.0),
    Student('abc',200,7.0),
]
print("************************")
print("1.Sort based on name.")
print("2.Sortbased on age")
print("3.Sort baswed on height")
print("*************************")
option = input("Enter 1 or 2 or 3 for sorting=")
if option == '1':
    value = sorted(studobj,key=lambda student: student.name)
    print(value)
elif option == '2':
    value=sorted(studobj, key=lambda student: student.age)
    print(value)
elif option == '3':
    value=sorted(studobj, key=lambda student: student.height)
    print(value)
else:
    print("Inavalid option")

