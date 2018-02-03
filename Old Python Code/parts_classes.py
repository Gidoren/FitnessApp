
class Arms():
	

	def __init__(self):
		
		self.shoulders = {'anterior' : False, 'middle' : False, 
		'posterior' : False}
		self.biceps = {'long' : False, 'short' : False, 'brachialis' : False}
		self.triceps = {'lateral' : False, 'long' : False, 'medial' : False}
		self.forearms = {'brachioradialis' : False, 'flexors' : False, 
		'extensors' : False}
		
		self.arms = { 'shoulders' : self.shoulders, 'biceps' : self.biceps, 'triceps' : self.triceps, 'forearms' : self.forearms }
