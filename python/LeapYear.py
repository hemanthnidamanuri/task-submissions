#check weather given date is a leapyar or not
def leapyear(date):
	pass
	year = int(date[6:])
	if (year % 4 ==0):
		print("given year is a leapyear")
	else:
		print("given year is not a leapyear")


if __name__ == '__main__':
	date = input("enter date=")
	leapyear(date)