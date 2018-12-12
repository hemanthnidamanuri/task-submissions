#Read A csv file and transfer data from csv file to json file

import csv
import json


def main():
    with open("main.csv",'r') as file:
        with open("jsonfile.json",'w') as file2:
            for line in file:
            	word = json.dumps(line)
            	file2.write(word)


if __name__ == '__main__':
    main()
