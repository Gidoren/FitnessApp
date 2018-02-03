import sys
import workouts as work
from workouts import Workouts
work = Workouts()

def print_groups(body):#do not use this function print_dict is more manageable
	print(body.name)
	for part in body.muscles:
		print("\n" + str(part) + ":")
		for group, part in body.muscles[part].items():
			print("\n\t" + str(group) + ":")
			for head, use  in part.items():
				try: 
					if use.items():
						print("\n\t\t" + str(head) + ":")
						for head, use in use.items():
							print("\t\t\t" + str(head) + ": " + str(use))
						try: 
							if use.items():
								print("\n\t\t" + str(head) + ":")
								for head, use in use.items():
									print("\t\t\t" + str(head) + ": " + str(use))
						except AttributeError:	
							continue	
				except AttributeError:	
					print("\t\t" + str(head) + ": " + str(use))	
	print("\n")		
	
# Prints a dictionary into the console, formatting as it goes into dicts
def print_dict(dictionary, formatting = "\n"):
	for key, value in dictionary.items():
		sys.stdout.write(formatting + str(key) + ": ")
		if (type(value) == dict):
			print_dict(value, formatting + "\t")
		elif (type(value) == list):
			for index,value in enumerate(value):
				if (index == 0):
					sys.stdout.write(str(value))
				else:
					sys.stdout.write(", " + str(value))

# Searches a dictionary for a target, and returns the value of the
# target index
def search_dict(dictionary, target):
	for key,value in dictionary.items():
		if key == target:
			return value
	
# Takes a body and a workout name, and finds the corresponding
# muscle groups to add the workout to 
def add_workout(body, workout, sets = 1):
	for key, value in work.workouts[workout].items():
		body_map = key.split(",")
		searchList = body.muscles
		for part in body_map:
			searchList = search_dict(searchList, part)
		for counter in range(0,sets):
			searchList.append(value)

# Takes "iso" and "sup", quantifies them, and analyzes them giving a 
# rough estimate of how hard each muscle group has been worked
def easyRead(dictionary, formatting = "\n"):
	for key, value in dictionary.items():
		sys.stdout.write(formatting + str(key) + ": ")
		if (type(value) == dict):
			easyRead(value, formatting + "\t")
		elif (type(value) == list):
			work = 0
			for index,value2 in enumerate(value):
				if value2 == "iso":
					work = work + 5
				elif value2 == "sup":
					work = work + 2
			if work > 25:
				sys.stdout.write("Over Worked")
			elif work > 20:
				sys.stdout.write("Very Heavily Worked")
			elif work > 15:
				sys.stdout.write("Heavily Worked")
			elif work > 10:
				sys.stdout.write("Partially worked")
			elif work > 5:
				sys.stdout.write("Lightly Worked")
			elif work > 0:
				sys.stdout.write("Barely Worked")
			else:
				sys.stdout.write("Not Worked")
			
			sys.stdout.write(": " + str(work))
#work.new_workout('neutral bicep curls',{'bicep long':'iso','bicep short':'sup','bicep brachialis':'sup'})
#work.new_workout('supinated bicep curls',{'bicep long':'sup','bicep short':'iso','bicep brachialis':'sup'})
#work.new_workout('outside bicep curls',{'bicep long':'sup','bicep short':'iso','bicep brachialis':'sup'})
#work.new_workout('pronated bicep curls',{'bicep long':'sup','bicep short':'sup','bicep brachialis':'iso'})
