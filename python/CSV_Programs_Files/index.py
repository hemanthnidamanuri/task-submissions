#TASK: read a csv file and print alternative rows to a new CSV file 
#reading Commanf and file reading programs must be written in two different files
#command line reading will be done index.py 
#file read and write will done in fileinputandwrite.py

import sys, getopt
from filereadandwrite import fileinputandwrite

from builtins import str


def main(argv):
    argv[0] = "input"
    switch(argv[0])


def filecall():
    fileinputandwrite()


def switch(arg):
    switcher = {
        input : filecall(),
    }


if __name__ == '__main__':
    main(sys.argv[1:])