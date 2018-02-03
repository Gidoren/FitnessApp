public class Muscle {
    public String name;
    Heads[] muscleHeads;
    int headsEls;
    public Muscle()
    {
        name = "";
        muscleHeads = new Heads[5];
        headsEls = 0;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String s)
    {
        name = s;
    }
    public void setHeads(Heads x)
    {
    	muscleHeads[headsEls] = x;
    	headsEls++;
    }
}
