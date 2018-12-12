#reading csv file and writing a new csv file with key value pair type and print alternative rows in csv file
#input CSV files : main.csv
#output csv file : sample.csv
import csv

def fileinputandwrite():
	with open ("main.csv","r") as file:
		with open("sample.csv","w") as file2:
			lst = []
			i=0
			reader = csv.DictReader(file)
			heads = reader.fieldnames
			length = len(heads)
			for row in reader:
				for x in range(0,(length+1)):
					if x % 2 ==0:
						key = heads[x]
						file2.write(key+",")
						file2.write(row[key]+",")
			file2.write('\n')

	file2.close()
	file.close()


