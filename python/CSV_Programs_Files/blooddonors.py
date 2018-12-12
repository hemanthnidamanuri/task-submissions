#take sample json file containing blood donors list
#parse json file and take the list of dondors name and blood type
#create csv file write names and bloodgroups into new csv file

import json

def main():
	with open("blooddonors.json","r") as jsonfile:
		with open("blooddonors.csv","w") as csvfile:
			#loading json file
			donors_data = json.loads(jsonfile.read())
			donors_lst  = donors_data['donors']
			#writeing into csv file
			for i in donors_lst:
				csvfile.write(i['name']+',')
			csvfile.write('\n')
			for j in donors_lst:
				csvfile.write(j['bloodtype']+',')
			csvfile.write('\n')
	jsonfile.close()
	csvfile.close()

if __name__ == '__main__':
	main()