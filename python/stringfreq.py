#in a given string find out each charcter frequency
def stringfreq(st):
	dct = {}
	for key in st:
		if key in dct:
			dct[key] = dct[key]+1;
		else:
			dct[key] = 1
	print(dct)

if __name__ == '__main__':
	st = input("enter a given string=")
	stringfreq(st)