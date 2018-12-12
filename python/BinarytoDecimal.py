#convert Binary number into a decimal 

def binarytodecimal(num):

	k = num
	dv,i,n=0,0,0
	while (num!=0):
		last= num % 10
		dv = dv+last*pow(2,i)
		num = num/10
		i +=1
	print(dv)

if __name__ == '__main__': 
	num = int(input("Enter a binary number="))
	binarytodecimal(num)
