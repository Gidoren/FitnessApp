/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.justi.personaltrainer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Calculator {

    static Body a;

    public Calculator()
    {
        //new JsonLoading();
        
        /* Beginning of hardcoded muscles*/
        JsonLoading workouts = new JsonLoading(); //Intantiate the JsonLoading class
        Muscle[] Anatomy = new Muscle[18];
        Heads[] shoulderH = new Heads[3],bicepsH = new Heads[3],tricepsH = new Heads[3];
        Heads[] forearmsH = new Heads[3], calvesH = new Heads[2], hamstringsH = new Heads[3];
        Heads[] gluteusH = new Heads[3],quadricepsH = new Heads[3], pectMaH = new Heads[3], serratusPosH = new Heads[2], teresH = new Heads[2];
        Heads pectMiH = new Heads(), rectusH = new Heads(), obliquesH = new Heads(), trapeziusH = new Heads(), latissH = new Heads(), thoraH = new Heads(), serratusH = new Heads();
        Anatomy[0] = new Muscle("shoulders");
        shoulderH[0] = new Heads("anterior");
        shoulderH[1]= new Heads("middle");        
        shoulderH[2]= new Heads("posterior");
        for (int i = 0; i < 3; i++)
            Anatomy[0].setHeads(shoulderH[i]);
        
        Anatomy[1]= new Muscle("biceps");
        bicepsH[0]= new Heads("long");
        bicepsH[1]= new Heads("short");
        bicepsH[2]= new Heads("brachialis");   
        for (int i = 0; i < 3; i++)
            Anatomy[1].setHeads(bicepsH[i]);
        
        Anatomy[2]= new Muscle("triceps");        
        tricepsH[0]= new Heads("lateral");
        tricepsH[1]= new Heads("long");
        tricepsH[2]= new Heads("medial");
        for (int i = 0; i < 3; i++)
            Anatomy[2].setHeads(tricepsH[i]);
        
        Anatomy[3]= new Muscle("forearms");
        forearmsH[0]= new Heads("bracioradialis");
        forearmsH[1]= new Heads("flexors");
        forearmsH[2]= new Heads("extensors");   
        for (int i = 0; i < 3; i++)
            Anatomy[3].setHeads(forearmsH[i]);
        
        Anatomy[4]= new Muscle("calves");
        calvesH[0]= new Heads("lateral");
        calvesH[1]= new Heads("medial");
         for (int i = 0; i < 2; i++)
            Anatomy[4].setHeads(calvesH[i]);       
        
        Anatomy[5]= new Muscle("hamstrings");
        hamstringsH[0]= new Heads("biceps femoris");
        hamstringsH[1]= new Heads("semitendonosis");
        hamstringsH[2]= new Heads("semimembranosis");
         for (int i = 0; i < 3; i++)
            Anatomy[5].setHeads(hamstringsH[i]);     
        
        
        Anatomy[6]= new Muscle("gluteus");
        gluteusH[0]= new Heads("medius");
        gluteusH[1]= new Heads("maximus");
        gluteusH[2]= new Heads("minimus");
        for (int i = 0; i < 3; i++)
            Anatomy[6].setHeads(gluteusH[i]);

        Anatomy[7]= new Muscle("quadriceps");
        quadricepsH[0]= new Heads("lateral");
        quadricepsH[1]= new Heads("intermedial");    
        quadricepsH[2]= new Heads("medial");
        for (int i = 0; i < 3; i++)
            Anatomy[7].setHeads(quadricepsH[i]);        
        
        Anatomy[8]= new Muscle("pectoralis major");
        pectMaH[0]= new Heads("clavicular");
        pectMaH[1]= new Heads("sternocostostal");
        pectMaH[2]= new Heads("abdominal");
        for (int i = 0; i < 3; i++)
            Anatomy[8].setHeads(pectMaH[i]);
        
        Anatomy[9]= new Muscle("pectoralis minor");
        pectMiH= new Heads( "pectoralis Minor");
        Anatomy[9].setHeads(pectMiH);
        
        Anatomy[10]= new Muscle("rectus abdominus");//asdasdasdsad
        rectusH= new Heads("rectus abdominus");
        Anatomy[10].setHeads(rectusH);

        
        Anatomy[11]= new Muscle("obliques");
        obliquesH= new Heads("obliques");
        Anatomy[11].setHeads(obliquesH);
        
        Anatomy[12]= new Muscle("serratus posterior");
        serratusPosH[0]= new Heads("superior");
        serratusPosH[1]= new Heads("inferior");
        for (int i = 0; i < 2; i++)        
            Anatomy[12].setHeads(serratusPosH[i]);
        
        Anatomy[13]= new Muscle("serratus");
        serratusH= new Heads("anterior");
        Anatomy[13].setHeads(serratusH);

        
        Anatomy[14]= new Muscle("trapezius");
        trapeziusH= new Heads("trapezius");
       Anatomy[14].setHeads(trapeziusH);
        
        Anatomy[15]= new Muscle("teres");        
        teresH[0]= new Heads("minor");
        teresH[1]= new Heads("major");
        for (int i = 0; i < 2; i++)
            Anatomy[15].setHeads(teresH[i]);
        
        
        Anatomy[16]= new Muscle("Latissimus dorsi");
        latissH= new Heads("latissimus dorsi");
        Anatomy[16].setHeads(latissH);
       
        Anatomy[17]= new Muscle("thoracolumbar fascia");
        thoraH= new Heads("thoracolumbar fascia");
        Anatomy[17].setHeads(thoraH);
        /*End of hardcoded muscles*/
        a = new Body();
        buildBody(a, Anatomy);
        //test the calculations of exercise on the work variable
        //found in the muscle heads node class
        //workCalculations("front deltoid raise");
        //workCalculations("side deltoid raise");
        //workCalculations("rear deltoid flies");

        //System.out.println(a.arms[0].muscleHeads[0].getWork());
    }

    /***********************************************************
    builds the body object using the data of muscles provided
    *************************************************************/
    public static void buildBody(Body a, Muscle[] Anatomy)
    {//adds all muscles to body
        for(int i =0; i < 18; i++)//there are 18 muscles currently accounted for and are hardcoded
        {
            a.addMuscle(Anatomy[i]);
        }
    }
    
    public static void printBody(Body a)
    {
        Muscle [] toPrint = a.getArms();
                int g = a.armsEls;
        for(int i = 0; i< a.backEls-1; i++)
        {
            System.out.println(toPrint[i].getName());
        }
        
    }
    
    //This is the function that your buttons call. There is a body (called a)
    //That you use for the body, and the name is the name of the workout, which
    //is then called to the JsonLoading function.
    public static void workCalculations(String name)
    {
        HashMap<String[],Integer> temp = JsonLoading.getWorkout(name);
        int calculation = 0;
         Set entrySet = temp.entrySet();
        Iterator it = entrySet.iterator();
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            String[] answers = (String[])me.getKey();
            switch(answers[0])
            {
                case("arms"):
                    a.arms[Integer.parseInt(answers[1])].muscleHeads[Integer.parseInt(answers[2])].add((Integer)me.getValue());
                    break;
                case("legs"):
                    a.legs[Integer.parseInt(answers[1])].muscleHeads[Integer.parseInt(answers[2])].add((Integer)me.getValue());
                    break;
                case("chest"):
                    a.chest[Integer.parseInt(answers[1])].muscleHeads[Integer.parseInt(answers[2])].add((Integer)me.getValue());
                    break;
                case("core"):
                    a.legs[Integer.parseInt(answers[1])].muscleHeads[Integer.parseInt(answers[2])].add((Integer)me.getValue());
                    break;
                case("back"):
                    a.legs[Integer.parseInt(answers[1])].muscleHeads[Integer.parseInt(answers[2])].add((Integer)me.getValue());
                    break; 
                    
            }/**********************************************************************************************************************************
            Comparison of various work values between muscle heads within the muscles in the arm region
            if the difference is greater than 6 a warning is issued to the client that they could be dealing damage towards
            themselves from overwork and must create more variety in their exercises.
            
            ************************************************************************************************************************************/
                

        }
        calculation = a.arms[0].muscleHeads[0].getWork() - a.arms[0].muscleHeads[1].getWork();
        if (calculation > 6)
            System.out.println("you are overworking your anterior head compared to your middle head in your shoulder");
        else if(calculation < -6)
            System.out.println("You are overworking your middle head compared to your anterior head in your shoulder");
        calculation = a.arms[0].muscleHeads[1].getWork()-a.arms[0].muscleHeads[2].getWork();
        if (calculation > 6)
            System.out.print("You are overworking your middle head compared to your posterior head in your shoulder");
        else if (calculation < -6)
            System.out.println("you are overworking your posterior head compared to your middle head in your shoulder");
        calculation = a.arms[0].muscleHeads[2].getWork() - a.arms[0].muscleHeads[0].getWork();
        if(calculation> 6)
            System.out.println("you are overworking your posterior head compared to your anterior head in your shoulder");
        else if  (calculation< -6)
            System.out.println("you are overworking your anterior head compared to your posterior head in your shoulder");

        calculation = a.arms[1].muscleHeads[0].getWork() - a.arms[1].muscleHeads[1].getWork();
        if (calculation > 6)
            System.out.println("you are overworking your long head compared to your short head in your biceps");
        else if(calculation < -6)
            System.out.println("You are overworking your short head compared to your long head in your biceps");
        calculation = a.arms[1].muscleHeads[1].getWork()-a.arms[1].muscleHeads[2].getWork();
        if (calculation > 6)
            System.out.print("You are overworking your short head compared to your bhrachialis head in your biceps");
        else if (calculation < -6)
            System.out.println("you are overworking your brachialis head compared to your short head in your biceps");
        calculation = a.arms[1].muscleHeads[2].getWork() - a.arms[1].muscleHeads[0].getWork();
        if(calculation> 6)
            System.out.println("you are overworking your brachialis head compared to your long head in your biceps");
        else if  (calculation< -6)
            System.out.println("you are overworking your long head compared to your brachialis head in your biceps");

        calculation = a.arms[2].muscleHeads[0].getWork() - a.arms[2].muscleHeads[1].getWork();
        if (calculation > 6)
            System.out.println("you are overworking your laterals head compared to your long head in your triceps");
        else if(calculation < -6)
            System.out.println("You are overworking your long head compared to your lateral head in your triceps");
        calculation = a.arms[2].muscleHeads[1].getWork()-a.arms[2].muscleHeads[2].getWork();
        if (calculation > 6)
            System.out.print("You are overworking your long head compared to your medial head in your triceps");
        else if (calculation < -6)
            System.out.println("you are overworking your medial head compared to your long head in your triceps");
        calculation = a.arms[2].muscleHeads[2].getWork() - a.arms[2].muscleHeads[0].getWork();
        if(calculation> 6)
            System.out.println("you are overworking your medial head compared to your lateral head in your triceps");
        else if  (calculation< -6)
            System.out.println("you are overworking your lateral head compared to your medial head in your triceps");

        calculation = a.arms[3].muscleHeads[0].getWork() - a.arms[3].muscleHeads[1].getWork();
        if (calculation > 6)
            System.out.println("you are overworking your brachioradialis head compared to your flexors head in your forearms");
        else if(calculation < -6)
            System.out.println("You are overworking your flexors head compared to your brachioradialis head in your forearms");
        calculation = a.arms[3].muscleHeads[1].getWork()- a.arms[3].muscleHeads[2].getWork();
        if (calculation > 6)
            System.out.print("You are overworking your flexors head compared to your extensors head in your forearms");
        else if (calculation < -6)
            System.out.println("you are overworking your extensors head compared to your flexors head in your forearms");
        calculation = a.arms[3].muscleHeads[2].getWork() - a.arms[3].muscleHeads[0].getWork();
        if(calculation> 6)
            System.out.println("you are overworking your flexors head compared to your brachioradialis head in your forearms");
        else if  (calculation< -6)
            System.out.println("you are overworking your brachioradialis head compared to your flexor head in your forearms");
    }

    public static int getArmsShoulderAnterior()
    {
        return a.arms[0].muscleHeads[0].getWork();
    }

    public static int getArmsShoulderMiddle()
    {
        return a.arms[0].muscleHeads[1].getWork();
    }

    public static int getArmsShouldersPosterior()
    {
        return a.arms[0].muscleHeads[2].getWork();
    }

    

}
