/**
 * Created by Tayler on 4/11/2017.
 * Tracker for the amount of water taken in and the goal amount of water per day.
 */
class WaterTracker
{
    private double intake = 0;
    private double water = 0;

    WaterTracker()
    {

    }

    public double calc(double w)
    {
        water = w * .67;
        return water;
    }

    private void add(double in)
    {
        intake += in;
    }

    private void remove(double re)
    {
        intake -= re;
    }

    private void addDaily(int w)
    {
        water += w;
    }

    private void remDaily(int w)
    {
        water -= w;
    }
}
