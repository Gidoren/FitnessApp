/***************************************************************************
the node class and lowest level of muscular structure in the body
we are using the heads to make minute comparisons between each other as
to not overwork them
***************************************************************************/
package com.example.justi.personaltrainer;

public class Heads {
	  public int Work;
	    String name;
	    public Heads()
	    {
	        Work = 0;
	        name = ""; 
	    }
	    public Heads(String S)
	    {
	        Work = 0;
	        name = S;
	    }
	    public String getName()
	    {
	        return name;
	    }
	    public int getWork()
	    {
	        return Work;
	    }
	    public void setName(String S)
	    {
	        name = S;
	    }
	    public void setWork(int w)
	    {
	        Work = w;
	    }
	    
            public void add(int w)
            {
                Work += w;
            }
            
	    public void WorkOut(int worked)
	    {
	    	Work+=worked;
	    }
	    
	}