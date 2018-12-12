#find the frequency and print the dictionary with commanu values with keys
def stringfreq(st):
	dct = {}
	newdct = {}
	for key in st:
		if key in dct:
			dct[key] = dct[key]+1;
		else:
			dct[key] = 1
	for k,v in dct.items():
		newdct.setdefault(v ,[]).append(k)
	print(newdct)

if __name__ == '__main__':
	st  = input("Enter a string=")
	stringfreq(st)