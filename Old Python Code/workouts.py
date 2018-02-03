import json
import requests

class Workouts():
	""" Class for dealing with the Json file that holds all of the 
		workouts. """
	def __init__(self):
		self.filename = 'workouts.json'
		self.BlobCode = 'de287001-ad6a-11e7-a347-bbe294d54576'
		self.url = 'https://jsonblob.com/api/jsonBlob/' + self.BlobCode
		self.workouts = {}
		try:
			with open(self.filename) as f_obj:
				self.workouts = json.load(f_obj)		
		except FileNotFoundError:
			r = requests.get(self.url)
			raw = r.json()
			self.workouts = raw['Workouts']
			self.save()
		
	
	#Save or update the file in the system	
	def save(self):
		with open(self.filename, 'w') as f_obj:
			json.dump(self.workouts, f_obj)
	
	#Uploads the json to the website
	def upload_to_jsonblob(self):
		raw = {}
		raw['Workouts'] = self.workouts
		r = requests.put(self.url, data = json.dumps(raw))
		print(r.status_code)
	
	#Prints out all workouts available	
	def printWorkouts(self):
		for key,value in self.workouts.items():
			print(key)
			for key2,value2 in value.items():
				print("\t" + key2 + ": " + value2)
	#Add a new workout
	def new_workout(self, name, muscles):
		try:
			self.workouts[name]
			print("Already a workout named: " + name)
		except KeyError:
			self.workouts[name] = muscles
			self.save()






# Exercises for the Biceps/Forearms

	# Flexors
def barbell_wrist_curls(body):
	
	body.forearms['flexors'] = True
	
	#Extensors
def barbell_reverse_wrist_curls(body):
	body.forearms['extensors'] = True

def dumbell_reverse_curls(body):
	body.forearms['extensors'] = True

# Exercises for the Torso
	
	# Pectoralis Minor
def decline_pushups(body):
	body.torso.pectoralis_minor['pectoralis minor'] = True

def chest_dips(body):
	body.torso.pectoralis_minor['pectoralis minor'] = True
	
	# Pectoralis Major

def standing_fly(body):	
	body.torso.pectoralis_major['clavicular head'] = True
	body.torso.pectoralis_major['sternocostal head'] = True
	body.torso.pectoralis_major['abdominal head'] = True
