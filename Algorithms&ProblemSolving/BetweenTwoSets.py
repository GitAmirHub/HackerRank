import math
import os
import random
import re
import sys

#
# Complete the 'getTotalX' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY a
#  2. INTEGER_ARRAY b
#

#Works on Python 3.9+ due to using math.lcm and math.gcd function
def getTotalX(a, b):
    # Write your code here
    lcm = math.lcm(*a)
    gcd = math.gcd(*b)
    count = 0

    for x in range(lcm, gcd + lcm, lcm):
        if gcd % x == 0:
            count += 1
    
    return count
