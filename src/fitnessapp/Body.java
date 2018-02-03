public class Body {
private Muscle[] arms = new Muscle[10];
private int armsEls = 0;
private Muscle[] legs = new Muscle[10];
private int legsEls = 0;
private Muscle[] chest = new Muscle[10];
private int chestEls = 0;
private Muscle[] back = new Muscle[10];
private int backEls = 0;
private Muscle[] core = new Muscle[10];
private int coreEls = 0;

public void addMuscle(Muscle x, String name)
{
	if(x.getName() == "bicep" || x.getName() == "tricep" || x.getName() == "forearm" || x.getName() == "shoulders")
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
		armsEls++;
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
