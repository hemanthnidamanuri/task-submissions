class Error(Exception):
	pass

class NotEligible(Error):
	pass

age  = eval(input("Enter your age = "))

try:
	if age > 21:
		pass
		print("eligible")
	else:
		raise NotEligible
except NotEligible:
	print("not eligible")