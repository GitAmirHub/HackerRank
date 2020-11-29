import calendar

def is_leap(year):
    leap = False
    
    # Write your logic here
   # if year % 400 == 0 and year % 4 == 0:
    #    leap = True
    
    return calendar.isleap(year)
