from body import Body
import functions as fun

def run():
	
	# Creating Bodies
	tayler = Body('Tayler Nielsen')
	# Changing muscle groups hit
	
	"""# Single Muscle
	tayler.biceps['long'] = True
	# Multiple muscles
	for muscle, hit in tayler.shoulders.items():
		tayler.shoulders[muscle] = True
	"""
	
	fun.add_workout(tayler,'rear deltoid flies', 3)
	fun.add_workout(tayler,'side deltoid raise', 3)
	fun.add_workout(tayler,'outside bicep curls', 3)
	fun.add_workout(tayler,'pronated bicep curls', 3)
	
	# Workouts
	#work.new_workout('neutral bicep curls',{'bicep long':'iso','bicep short':'sup','bicep brachialis':'sup'})
	#work.new_workout('supinated bicep curls',{'bicep long':'sup','bicep short':'iso','bicep brachialis':'sup'})
	#work.new_workout('outside bicep curls',{'bicep long':'sup','bicep short':'iso','bicep brachialis':'sup'})
	#work.new_workout('pronated bicep curls',{'bicep long':'sup','bicep short':'sup','bicep brachialis':'iso'})
	
	
	# Print each body
	fun.print_dict(tayler.muscles)
	#fun.easyRead(tayler.muscles)
	
run()
