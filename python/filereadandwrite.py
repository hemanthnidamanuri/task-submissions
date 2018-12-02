#reading csv file and writing a new csv file
#input CSV files : main.csv
#output csv file : sample.csv
def fileinputandwrite():

	lensum = 0
	j = 0
	with open ("main.csv","r") as file:
		with open("sample.csv","w") as file2:
			for line in file:
				line = line.split(',')
				length = len(line)
				for x in range(0,(length+1)):
					if x % 2 ==0:
						file2.write(line[x]+",")
	file.close()
	file2.close()



