class Body():
	
	def __init__(self, name):
		
		self.name = name
		
		#Arm Muscle Groups
		
		self.shoulders = {'anterior' : [], 'middle' : [], 
			'posterior' : []}
		self.biceps = {'long' : [], 'short' : [], 
			'brachialis' : []}
		self.triceps = {'lateral' : [], 'long' : [], 
			'medial' : []}
		self.forearms = {'brachioradialis' : [], 'flexors' : [], 
			'extensors' : []}

		self.arms = { 'shoulders' : self.shoulders, 
			'biceps' : self.biceps, 'triceps' : self.triceps, 
			'forearms' : self.forearms }
		
		# Leg Muscle Groups
		
		self.calves = {'lateral' : [], 'medial' : []}

		self.hamstrings = {'bicep femoris' : [], 
			'semitendonosis' : [], 'semimembranosis' : []}
		self.gluteus = {'medius' : [], 'maximus' : [], 
			'minimus' : []}
		self.quadriceps = {'lateral' : [], 'intermedial' : [], 
			'medial' : []}

		self.legs = { 'gluteus' : self.gluteus, 
			'quadriceps' : self.quadriceps, 
			'hamstrings' : self.hamstrings, 'calves' : self.calves }

		# Torso Muscle Groups
		
		self.pectoralis_major = {'clavicular head' : [], 
			'sternocostal head' : [], 'abdominal head' : [] }

		self.pectoralis_minor = {'pectoralis minor' : [] }

		self.pectorals = { 'pectoralis major' : self.pectoralis_major, 
			'pectoralis minor' : self.pectoralis_minor}

		self.rectus_abdominus = { 'rectus abdominis' : [] }

		self.obliques = { 'obliques' : [] }

		self.serratus_posterior = { 'inferior' : [], 
			'superior' : [] }

		self.serratus = { 'anterior' : [], 
			'posterior' : self.serratus_posterior }

		self.trapezius = { 'trapezius' : [] }

		self.teres = { 'major' : [], 'minor' : [] }

		self.latissimus_dorsi = { 'latissimus dorsi' : [] }

		self.thoracolumbar_fascia = { 'thoracolumbar fascia' : [] }

		self.torso = { 'pectorals' : self.pectorals, 
			'rectus abdominus' : self.rectus_abdominus, 
			'obliques' : self.obliques, 'serratus' : self.serratus, 
			'trapezius' : self.trapezius, 'teres' : self.teres, 
			'latissimus dorsi' : self.latissimus_dorsi, 
			'thoracolumbar fascia' : self.thoracolumbar_fascia}

		# All Muscle Groups
		
		self.muscles = {'arms' : self.arms, 'legs' : self.legs, 
			'torso' : self.torso}
