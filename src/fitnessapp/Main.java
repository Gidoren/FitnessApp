/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessapp;


public class Main {
    public static void main(String[] args)
    {
        /* Beginning of hardcoded muscles*/
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
        
        
        Anatomy[6]= new Muscle("glueteus");
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
        Body a = new Body();
        buildBody(a, Anatomy);
        printBody(a);
        
    }

    
    public static void buildBody(Body a, Muscle[] Anatomy)
    {//adds all muscles to body
        for(int i =0; i < 18; i++)//there are 18 muscles currently accounted for and are hardcoded
        {
            a.addMuscle(Anatomy[i]);
        }
    }
    
    public static void printBody(Body a)
    {
        Muscle[] toPrint = a.getArms();
                int g = a.armsEls;
        for(int i = 0; i< a.armsEls; i++)
        {
            System.out.println(toPrint[i].getName());
        }
        
    }

}

