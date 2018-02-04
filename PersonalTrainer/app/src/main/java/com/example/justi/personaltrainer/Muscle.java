/*********************************************************************************************
Muscles contain the muscle head node objects that are a sub section of the muscles themselves
effectively a node within node that will be kept as arrays in the body class
*********************************************************************************************/
package com.example.justi.personaltrainer;

public class Muscle {
    public String name;
    Heads[] muscleHeads;
    int headsEls;
    public Muscle()
    {
        name = " ";
        muscleHeads = new Heads[5];
        headsEls = 0;
    }
    public Muscle(String x)
    {
        name = x;
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

