import math
import os
import random
import re
import sys

#scores = [3 ,4 ,21 ,36 ,10 ,28 ,35 ,5 ,24 ,42]
def breakingRecords(scores):
    lowest = scores[0]
    highest = scores[0]
    lowestCount = 0
    highestCount = 0
    x = 0
    while x < len(scores):
        if scores[x] < lowest:
            lowest = scores[x]
            lowestCount += 1
        if scores[x] > highest:
            highest = scores[x]
            highestCount += 1
        x += 1
    print(highestCount,lowestCount)