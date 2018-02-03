import java.lang.*;
/**
 * Write a description of class MacroMaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MacroMaker
{
    String [][] taylerFood = new String[][]{
            {"Egg (PF)","0.6","6","5","1","1","0"},
            {"Egg White (P)","0.2","3.6","0.1","1","1","0"},
            {"Wheat Toast (C)","13","3.1","1","1","1","0"},
            {"Egg Omlette (FP)","2","26","28","0","1","1"},
            {"Egg Pancakes(CFP)","30","15","25","0","1","1"},
            {"Bacon Frittatas (PF)","3.3","38.3","36.7","0","1","3"},
            {"Greek Yogurt (PC)","10","17","1","1","1","0"},
            {"Almonds (FPC)","6","6","14","1","1","0"},
            {"Cashews (FCP)","12","8","22","1","1","0"},
            {"Apple (C)","25","0.5","0.3","1","1","0"},
            {"Nectarine (C)","15","1.5",".5","1","1","0"},
            {"Carrots (C)", "10","0.9","0.2","1","1","0"},
            {"Sweet Potatoes (C)","27","2.1","0.1","1","1","1"},
            {"Potatoes (C)","37","4.3","0.2","1","1","1"},
            {"Chicken Breast (P)","0","54","6.2","0","1","2"},
            {"Almond Milk (P)","0","2",".5","1","1","0"},
            {"Whey Protein (P)","3","27","2.5","0","1","1"},
            {"Baked Broccoli (F)","3","1","14","0","1","1"},
            {"Baked Asparagus (FCP)","10","5","14","0","1","2"},
            {"Milk (CPF)", "13","8","5","1","0","0"},
            {"Tomato Chicken (PFC)","16.3","56.3","20","0","1","6"},
            {"Tilapia Loin (P)","0","23","2.3","0","1","3"},
            {"Protein Bar (PCF)","15","18","7","1","1","0"},
            {"Isolate Protein (P)","3","30","1","0","1","1"},
    };

    String [][] savannaFood = new String [][]{
            {"Egg","0.6","6","5","1","1","0"},
            {"Egg White","0.2","3.6","0.1","1","1","0"},
            {"Wheat Toast","13","3.1","1","1","1","0"},
            {"Egg Omlette","2","26","28","0","1","1"},
            {"Egg Pancakes","30","15","25","0","1","1"},
            {"Bacon Frittatas","3.3","38.3","36.7","0","1","3"},
            {"Greek Yogurt","10","17","1","1","1","0"},
            {"Almonds","6","6","14","1","1","0"},
            {"Cashews","12","8","22","1","1","0"},
            {"Apple","25","0.5","0.3","1","1","0"},
            {"Nectarine","15","1.5",".5","1","1","0"},
            {"Carrots", "10","0.9","0.2","1","1","0"},
            {"Cashews","9","5","12","1","1","0"},
            {"Sweet Potatoes","27","2.1","0.1","1","1","1"},
            {"Potatoes","37","4.3","0.2","1","1","1"},
            {"Chicken Breast","0","27","3.1","0","1","2"},
            {"Almond Milk","0","2",".5","1","1","0"},
            {"Whey Protein","3","27","2.5","0","1","1"},
            {"Baked Broccoli","3","1","14","0","1","1"},
            {"Baked Asparagus","10","5","14","0","1","2"},
            {"Milk", "13","8","5","1","0","0"},
            {"Tomato Chicken","16.3","56.3","20","0","1","6"},
            {"Tilapia Loin","0","23","2.3","0","1","3"},
            {"Protein Bar","15","18","7","1","1","0"},
            {"Isolate Protein","3","30","1","0","1","1"},
    };
    String [] Data;
    int by = 1;
    int s1y = 1;
    int ly = 1;
    int s2y = 1;
    int dy = 1;
    String [][] temporary;
    static String [][] userFood;
    String [][] breakfast;
    String [][] snack1;
    String [][] lunch;
    String [][] snack2;
    String [][] dinner;
    String name;
    boolean found = false;
    int carbCount = 0;
    int protCount = 0;
    int fatsCount = 0;
    double actualCarbs = 0;
    double actualProts = 0;
    double actualFats = 0;
    Double d = new Double("6.25");
    /*
     * Sets up the program. Inputs the amount of carbs, proteins, and fats a user wants
     * for that specific day so changes in weight and calorie count can be automatically
     * accounted for without having to change the program. Only new foods have to be
     * inputed into the program manually
     */
    public MacroMaker (String user, int carbs, int proteins, int fats){
        name = user;
        carbCount = carbs;
        protCount = proteins;
        fatsCount = fats;
        if(name.equals("Tayler")){
            userFood = new String[(int)taylerFood.length][7];
            userFood = taylerFood;

        } else {
            userFood = new String[(int)savannaFood.length][7];
            userFood = savannaFood;
        }

    }

    /*
     * Adding a food Item to the breakfast list
     */
    public String [][] addBreakfast(String food){
        for(int y = 0; y < userFood.length; y++)
        {
            if (food.equals(userFood[y][0]))
            {
                String[] temp = new String [4];

                temp [0] = userFood[y][0];
                temp [1] = userFood[y][1];
                temp [2] = userFood[y][2];
                temp [3] = userFood[y][3];
                actualCarbs += d.parseDouble(userFood [y][1]);
                actualProts += d.parseDouble(userFood [y][2]);
                actualFats += d.parseDouble(userFood [y][3]);
                if (by > 1){
                    temporary = new String [by-1][4];
                    temporary = breakfast;
                }
                breakfast = new String [by][4];
                if (by > 1) {
                    for(int a = 0;a < by-1; a++)
                    {
                        breakfast[a] = temporary[a];
                    }
                }
                breakfast [by-1] = temp;
                by++;
            }
        }
        return breakfast;
    }

    public String [][] removeBreakfast(String food){
        int hero = findFirst(breakfast,food);
        if (hero != -1)
        {
            int a = 0;
            by--;
            String [][] temp = new String[by-1][];
            actualCarbs -= d.parseDouble(breakfast [hero][1]);
            actualProts -= d.parseDouble(breakfast [hero][2]);
            actualFats -= d.parseDouble(breakfast [hero][3]);
            for (int skipper = 0; skipper< breakfast.length; skipper++)
            {
                if (skipper == hero) {

                } else {
                    temp[a] = breakfast[skipper];
                    a++;
                }
            }
            breakfast = new String [by-1][4];
            breakfast = temp;
            return breakfast;
        } else {
            return breakfast;
        }
    }

    /*
     * adding a snack to the first snack of the day.
     */
    public String [][] addSnack1(String food){
        for(int y = 0; y < userFood.length; y++)
        {
            if (food.equals(userFood[y][0]))
            {
                String[] temp = new String [4];

                temp [0] = userFood[y][0];
                temp [1] = userFood[y][1];
                temp [2] = userFood[y][2];
                temp [3] = userFood[y][3];

                actualCarbs += d.parseDouble(userFood [y][1]);
                actualProts += d.parseDouble(userFood [y][2]);
                actualFats += d.parseDouble(userFood [y][3]);
                if (s1y > 1){
                    temporary = new String [s1y-1][4];
                    temporary = snack1;
                }
                snack1 = new String [s1y][4];
                if (s1y > 1) {
                    for(int a = 0;a < s1y-1; a++)
                    {
                        snack1[a] = temporary[a];
                    }
                }
                snack1 [s1y-1] = temp;
                s1y++;
            }
        }
        return snack1;
    }

    public String [][] removeSnack1(String food){
        int first = findFirst(snack1,food);
        if (first != -1)
        {
            int a = 0;
            s1y--;
            String [][] temp = new String[s1y-1][];
            actualCarbs -= d.parseDouble(snack1 [first][1]);
            actualProts -= d.parseDouble(snack1 [first][2]);
            actualFats -= d.parseDouble(snack1 [first][3]);
            for (int skipper = 0; skipper< snack1.length; skipper++)
            {
                if (skipper == first) {

                } else {
                    temp[a] = snack1[skipper];
                    a++;
                }
            }
            snack1 = new String [s1y-1][4];
            snack1 = temp;
            return snack1;
        } else {
            return snack1;
        }
    }

    /*
     * Adding a food item to the lunch list
     */
    public String [][] addLunch(String food){
        for(int y = 0; y < userFood.length; y++)
        {
            if (food.equals(userFood[y][0]))
            {
                String[] temp = new String [4];

                temp [0] = userFood[y][0];
                temp [1] = userFood[y][1];
                temp [2] = userFood[y][2];
                temp [3] = userFood[y][3];

                actualCarbs += d.parseDouble(userFood [y][1]);
                actualProts += d.parseDouble(userFood [y][2]);
                actualFats += d.parseDouble(userFood [y][3]);
                if (ly > 1){
                    temporary = new String [ly-1][4];
                    temporary = lunch;
                }
                lunch = new String [ly][4];
                if (ly > 1) {
                    for(int a = 0;a < ly-1; a++)
                    {
                        lunch[a] = temporary[a];
                    }
                }
                lunch [ly-1] = temp;
                ly++;
            }
        }
        return lunch;
    }

    public String [][] removeLunch(String food){
        int first = findFirst(lunch,food);
        if (first != -1)
        {
            int a = 0;
            ly--;
            String [][] temp = new String[ly-1][];
            actualCarbs -= d.parseDouble(lunch [first][1]);
            actualProts -= d.parseDouble(lunch [first][2]);
            actualFats -= d.parseDouble(lunch [first][3]);
            for (int skipper = 0; skipper< lunch.length; skipper++)
            {
                if (skipper == first) {

                } else {
                    temp[a] = lunch[skipper];
                    a++;
                }
            }
            lunch = new String [ly-1][4];
            lunch = temp;
            return lunch;
        } else {
            return lunch;
        }
    }

    /*
     * Adding a food to the second snack of the day
     */
    public String [][] addSnack2(String food){
        for(int y = 0; y < userFood.length; y++)
        {
            if (food.equals(userFood[y][0]))
            {
                String[] temp = new String [4];

                temp [0] = userFood[y][0];
                temp [1] = userFood[y][1];
                temp [2] = userFood[y][2];
                temp [3] = userFood[y][3];

                actualCarbs += d.parseDouble(userFood [y][1]);
                actualProts += d.parseDouble(userFood [y][2]);
                actualFats += d.parseDouble(userFood [y][3]);
                if (s2y > 1){
                    temporary = new String [s2y-1][4];
                    temporary = snack2;
                }
                snack2 = new String [s2y][4];
                if (s2y > 1) {
                    for(int a = 0;a < s2y-1; a++)
                    {
                        snack2[a] = temporary[a];
                    }
                }
                snack2 [s2y-1] = temp;
                s2y++;
            }
        }
        return snack2;
    }

    public String [][] removeSnack2(String food){
        int first = findFirst(snack2,food);
        if (first != -1)
        {
            int a = 0;
            s2y--;
            String [][] temp = new String[s2y-1][];
            actualCarbs -= d.parseDouble(snack2 [first][1]);
            actualProts -= d.parseDouble(snack2 [first][2]);
            actualFats -= d.parseDouble(snack2 [first][3]);
            for (int skipper = 0; skipper< snack2.length; skipper++)
            {
                if (skipper == first) {

                } else {
                    temp[a] = snack2[skipper];
                    a++;
                }
            }
            snack2 = new String [s2y-1][4];
            snack2 = temp;
            return snack2;
        } else {
            return snack2;
        }
    }

    /*
     * Adding a dinner item to the list
     */
    public String [][] addDinner(String food){
        for(int y = 0; y < userFood.length; y++)
        {
            if (food.equals(userFood[y][0]))
            {
                String[] temp = new String [4];

                temp [0] = userFood[y][0];
                temp [1] = userFood[y][1];
                temp [2] = userFood[y][2];
                temp [3] = userFood[y][3];

                actualCarbs += d.parseDouble(userFood [y][1]);
                actualProts += d.parseDouble(userFood [y][2]);
                actualFats += d.parseDouble(userFood [y][3]);
                if (dy > 1){
                    temporary = new String [dy-1][4];
                    temporary = dinner;
                }
                dinner = new String [dy][4];
                if (dy > 1) {
                    for(int a = 0;a < dy-1; a++)
                    {
                        dinner[a] = temporary[a];
                    }
                }
                dinner [dy-1] = temp;
                dy++;
            }
        }
        return dinner;
    }

    public String [][] removeDinner(String food){
        int first = findFirst(dinner,food);
        if (first != -1)
        {
            int a = 0;
            dy--;
            String [][] temp = new String[dy-1][];
            actualCarbs -= d.parseDouble(dinner [first][1]);
            actualProts -= d.parseDouble(dinner [first][2]);
            actualFats -= d.parseDouble(dinner [first][3]);
            for (int skipper = 0; skipper< dinner.length; skipper++)
            {
                if (skipper == first) {

                } else {
                    temp[a] = dinner[skipper];
                    a++;
                }
            }
            dinner = new String [dy-1][4];
            dinner = temp;
            return dinner;
        } else {
            return dinner;
        }
    }

    //Getters for the program
    public int findFirst (String [][] input, String food){
        int fin = -1;
        found = false;
        for (int i = 0; i < input.length;i++)
        {
            if (food.equals(input[i][0]) && found == false){
                fin = i;
                found = true;
            }
        }
        return fin;
    }
    public String returnUser(){
        return name;
    }
    public String [][] returnUserFood(){
        return userFood;
    }
    public int returnCarbs(){
        return carbCount;
    }
    public int returnProts(){
        return protCount;
    }
    public int returnFats(){
        return fatsCount;
    }
    public double returnCarbsLeft(){
        return carbCount-actualCarbs;
    }
    public double returnProteinsLeft(){
        return protCount-actualProts;
    }
    public double returnFatsLeft(){
        return fatsCount-actualFats;
    }
    public String [][] returnBreakfast(){
        return breakfast;
    }
    public String [][] returnSnack1(){
        return snack1;
    }
    public String [][] returnLunch(){
        return lunch;
    }
    public String [][] returnSnack2(){
        return snack2;
    }
    public String [][] returnDinner(){
        return dinner;
    }
}
