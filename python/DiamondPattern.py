def main():
	pass
	n = eval(input("Enter a num="))
	for i in range(0,n+1):
		for j in range(n,i,-1):
			print(" ",end = "")
		for k in range(1,i+1):
			print(k," ",end = "")
		print('\r')
	for i in range(n-1,0,-1):
		for j in range(n,i,-1):
			print(" ",end = "")
		for k in range(1,i+1):
			print(k," ",end = "")
		print('\r')
		
if __name__ == '__main__':
	main()