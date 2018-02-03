/**
 * Created by Tayler on 4/5/2017.
 * Calculator to determine Resting Metabolic Rate of any particular person
 * False indicates male, True indicates female for gender
 */
public class RMRCalc
{
    private static WaterTracker WT;
    private double height;
    private double weight;
    private double activityLevel;
    private double cals;
    private int age;
    private boolean gender;

    public static void main(String [] args)
    {
        WT = new WaterTracker();
        RMRCalc rmrCalc = new RMRCalc(70, 150, 19, false, 1.375);
    }

    private RMRCalc(double h, double w, int a, boolean g, double al)
    {
        height = h * 2.54;

        weight = w * 0.45359237;
        age = a;
        gender = g;
        activityLevel = al;
        System.out.println(calculate() + " Cals/Day");
        Macros();
        System.out.println(WT.calc(w)+ " Ounces/Day");
    }

    private double calculate()
    {
        cals = 0;
        if (!gender) cals = (((9.99 * weight) + (6.25 * height)) - (4.92 * age) + 5) * activityLevel;
        else cals = (((9.99 * weight) + (6.25 * height)) - (4.92 * age) - 161) * activityLevel;
        cals = cals - 500;
        return cals;
    }

    private void Macros()
    {
        System.out.println(carbMacros() + " Grams Carbs/Day");
        System.out.println(fatMacros() + " Grams Fat/Day");
        System.out.println(protMacros() + " Grams Prot/Day");
    }
    private double carbMacros() {return (int)(cals * 0.35 / 4);}

    private double protMacros() {return (int)(cals * .45 / 4);}

    private double fatMacros() {return (int)(cals * .2 / 9);}
}
