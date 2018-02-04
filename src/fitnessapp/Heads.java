
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
	    
	    public void WorkOut(int worked)
	    {
	    	Work+=worked;
	    }
	    
	}