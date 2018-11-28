#in a given list print the greates value in dictionary order
if __name__ == '__main__':
	clumsylist = "hemanth@7000000\tvamsi@6000000\tclass@5000000\tfinal@4000000"
	lst = []
	lst= clumsylist.split('\t')
	key= []
	value = []
	dct = {}
	for x in lst:
		i = x.split('@')
		key = i[0]
		value = i[1]
		dct[key] = value
	print(dct)
	mx = 0
	st="";
	for ke,val in dct.items():
		if (int(val)>int(mx)):
			mx = val
			st=str(ke)
	print(st,mx)