import java.util.*;
public class Body {
private Muscle[] arms = new Muscle[10];
private int armsEls = 0;
private Muscle[] legs = new Muscle[10];
private int legsEls = 0;
private Muscle[] chestAndCore = new Muscle[10];
private int chestEls = 0;
private Muscle[] back = new Muscle[10];
private int backEls = 0;


public void addMuscle(Muscle x, String name)
{
	if(x.getName() == "arms")
	{
		arms[armsEls] = x;
		armsEls++;
	}
	else if(x.getName() == "legs")
	{
		legs[legsEls] = x;
		legsEls++;
	}
	else if(x.getName() == "chestAndCore")
	{
		chestAndCore[chestEls] = x;
		chestEls++;
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

public Muscle[] getChestAndCore()
{
	return chestAndCore;
}

public Muscle[] getBack()
{
	return back;
}



}
