public class Body {
private Muscle[] arms;
public int armsEls;
private Muscle[] legs;
public int legsEls;
private Muscle[] chest;
public int chestEls;
private Muscle[] back;
public int backEls;
private Muscle[] core;
public int coreEls;

public Body()
{
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

public Muscle[] getArms()
{
	return arms;
}

public Muscle[] getLegs()
{
	return legs;
}

public Muscle[] getchest()
{
	return chest;
}

public Muscle[] getBack()
{
	return back;
}



}
