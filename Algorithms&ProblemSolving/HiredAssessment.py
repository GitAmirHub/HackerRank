prices = [11,0,-1,6,13,-2]
def soloution(prices):
    highest = max(prices)
    lowest = 0
    i = 0
    #print("highest index value is ", prices.index(highest))
    while i < prices.index(highest):
        if prices[i] < lowest:
            lowest = prices[i]
        i += 1
        #print(i, lowest)
    #print(highest, lowest)
    return abs(highest - lowest)