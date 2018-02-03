public class Muscle {
    public String name;
    Heads[] muscleHeads;
    
    public Muscle()
    {
        name = "";
        muscleHeads = new Heads[5];
    }
    public String getName()
    {
        return name;
    }
    public void setName(String s)
    {
        name = s;
    }
    

}
