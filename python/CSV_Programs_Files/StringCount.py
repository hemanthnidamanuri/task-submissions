#count the number of words in a given sample file 
#input : Text.txt a text file
#output : word count EXAMPLE: 100
def main():
	stringcount = 0
	with open("Text.txt","r") as file:
		for line in file:
			word = line.split()
			stringcount = stringcount+len(word)
	print(stringcount)


if __name__ == '__main__':
	main()
