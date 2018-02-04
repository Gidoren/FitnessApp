package fitnessapp;

public class Body {
Muscle[] arms;
public int armsEls;
Muscle[] legs;
public int legsEls;
Muscle[] chest;
public int chestEls;
Muscle[] back;
public int backEls;
Muscle[] core;
public int coreEls;

public Body()
{
    /****************************************************************************
    muscle array objects that will be used to differentiate and segment the h
    ****************************************************************************/
	arms = new Muscle[10];
	armsEls = 0;
	legs = new Muscle[10];
	legsEls = 0;
	chest = new Muscle[10];
	chestEls = 0;
	back = new Muscle[10];
	backEls = 0;
	core = new Muscle[10];
	coreEls = 0;
}

/*****************************************************************************
AddMuscle Function
Compares the string names contained in the muscle object X.
if it falls into any of the conditionals for specific regions then the program
will increment that regions array indexer and will store the muscle object
into the proppsed muscle array for the region.
eg: biceps are kept in the arms array and armsEls is incremented to factor that
*******************************************************************************/
public void addMuscle(Muscle x)
{
	if(x.getName() == "biceps" || x.getName() == "triceps" || x.getName() == "forearms" || x.getName() == "shoulders")
	{
		arms[armsEls] = x;
		armsEls++;
	}
	else if(x.getName() == "quadriceps" || x.getName() == "gluteus" || x.getName() == "calves" || x.getName() == "hamstrings")
	{
		legs[legsEls] = x;
		legsEls++;
	}
	else if(x.getName() == "pectoralis major" || x.getName() == "pectoralis minor")
	{
		chest[chestEls] = x;
		chestEls++;
	}
	else if(x.getName() == "rectus abdominus" || x.getName() == "obliques" || x.getName() == "serratus")
	{
		core[coreEls] = x;
		coreEls++;
	}
	else
	{
		back[backEls] = x;
		backEls++;
	}
	
}
/*****************************
Acessor functions 
******************************/

public Muscle[] getArms()
{
	return arms;
}

public Muscle[] getLegs()
{
	return legs;
}

public Muscle[] getChest()
{
	return chest;
}

public Muscle[] getBack()
{
	return back;
}
public Muscle[] getCore()
{
    return core;
}



}
