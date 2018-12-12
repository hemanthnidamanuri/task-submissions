#in a given string print all characters except first and last
def stringslice(st):
	length = len(st)-1
	for i in range(1,length):
		print(st[i],end="")


if __name__ == '__main__':
	st = input("enter a string=")
	stringslice(st)