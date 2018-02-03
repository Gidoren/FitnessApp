package fitnessapp;

public class Heads
{
    public int frequency;
    String name;
    public Heads()
    {
        frequency = 0;
        name = ""; 
    }
    public Heads(String S)
    {
        frequency = 0;
        name = S;
    }
    public String getName()
    {
        return name;
    }
    public int getFrequency()
    {
        return frequency;
    }
    public void setName(String S)
    {
        name = S;
    }
    public void setFrequency(int f)
    {
        frequency = f;
    }
    
}
