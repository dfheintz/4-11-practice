# import library
from datetime import datetime

date_str = "2022-03-17 10:45:30"  # date time string

# create datetime object based on string
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S')
# reformat datetime object
formatted_date = datetime.strftime('%m/%d/%Y %H:%M:%S')

# print the reformatted date and time
print(formated_date)
