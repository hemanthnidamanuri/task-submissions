from pathlib import Path
import os

class fileoperatios():
    """docstring for fileoperatios"""
    def __init__(self):
        super(fileoperatios, self).__init__()


    def checkfile(self):

        filename = input("Enter a filename for checking=")
        location = Path('/home/hemanth/Documents/python/comp_task/filename')
        if(location.is_file()):
            print("file exist")
        else:
            print("file does not exist,do u want to create print yes for filecreation , no for abort")
            reply = input("enter yes or no for file creation")
            if(reply==yes):
                filecreation()
            else:
                menu()

    def filecreation(self):

        filename = input("enter a name of file to create=")
        print("checking weather file exist or not")
        ans=checkfile(filename)
        if (ans==no):
            print("creating file;")
            file = open("filename","r+")
            checkfile(filename)
    def deletefile(self):

        filename = input("Enter file name to delete file=")
        if (os.path.exists(filename)):
            os.remove(filename)
        else:
            print("file does not exists")

    def copy_data_from_one_file_to_another_file(self):

        source = input("Enter source file name=")
        destination = input("Enter destination for copying=")
        with open(source,"r") as file:
            with  open(destination,"w") as file2:
                for line in file:
                    file2.write(line)

    def append_data_from_one_file_to_another_file(self):

        source = input("Enter source file name=")
        destination = input("enter destination file=")
        with open(source,"r") as file:
            with open(destination,"a") as file1:
                for line in file:
                    file2.write(line)


    def replacefile(self):
        pass


    def switchcase(option):

        def one():
            checkfile()

        def two():
            filecreation()

        def three():
            deletefile()

        def four():
            copy_data_from_one_file_to_another_file()

        def five():
            append_data_from_one_file_to_another_file()

        def six():
            replacefile()

        switcher = {
            1:one(),
            2:two(),
            3:three(),
            4:four(),
            5:five(),
            6:six()
        }
        return switcher.get(option,"nothing")

    def menu(self):
        print("*********************")
        print("1.checkfile")
        print("2.createfile")
        print("3.deletefile")
        print("4.copy data from one file to another file")
        print("5.append data from one file to another file")
        print("6.replace file")
        print("**********************")
    option= input("Enter your option=")
    switchcase(option)


if __name__ == '__main__':
    obj = fileoperatios()
    obj.menu()

