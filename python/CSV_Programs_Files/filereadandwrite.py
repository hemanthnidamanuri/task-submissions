#reading csv file and writing a new csv file with key value pair type and print alternative rows in csv file
#input CSV files : main.csv
#output csv file : sample.csv
import csv

def fileinputandwrite():
	with open ("main.csv","r") as file:
		with open("sample.csv","w") as file2:
			reader = csv.DictReader(file)
			for row in reader:
				file2.write(str(row))
			for line in file:
				line = line.split(',')
				length = len(line)
				for x in range(0,(length+1)):
					if x % 2 ==0:
						#For alternative rows
						print(line[x]+",")
	file.close()
	file2.close()



