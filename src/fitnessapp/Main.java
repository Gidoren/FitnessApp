/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessapp;

public class Main {
    public static void main(String[] args)
    {
        Muscle[] Anatomy = new Muscle[19];
        Heads[] shoulderH = new Heads[3],bicepsH = new Heads[3],tricepsH = new Heads[3];
        Heads[] forearmsH = new Heads[3], calvesH = new Heads[2], hamstringsH = new Heads[3];
        Heads[] gluteusH = new Heads[3],quadricepsH = new Heads[3], pectMaH = new Heads[3], serratusPosH = new Heads[2], teresH = new Heads[2];
        Heads pectMiH = new Heads(), rectusH = new Heads(), obliquesH = new Heads(), trapeziusH = new Heads(), latissH = new Heads(), thoraH = new Heads(), serratusH = new Heads();
        
        Anatomy[0].setName("shoulder");
        shoulderH[0].setName("anterior");
        shoulderH[1].setName("middle");        
        shoulderH[2].setName("posterior");
        for (int i = 0; i < 3; i++)
            Anatomy[0].setHeads(shoulderH[i]);
        
        Anatomy[1].setName("biceps");
        bicepsH[0].setName("long");
        bicepsH[1].setName("short");
        bicepsH[2].setName("brachialis");   
        for (int i = 0; i < 3; i++)
            Anatomy[1].setHeads(bicepsH[i]);
        
        Anatomy[2].setName("triceps");        
        tricepsH[0].setName("lateral");
        tricepsH[1].setName("long");
        tricepsH[2].setName("medial");
        for (int i = 0; i < 3; i++)
            Anatomy[2].setHeads(tricepsH[i]);
        
        Anatomy[3].setName("forearms");
        forearmsH[0].setName("bracioradialis");
        forearmsH[1].setName("flexors");
        forearmsH[2].setName("extensors");   
        for (int i = 0; i < 3; i++)
            Anatomy[3].setHeads(forearmsH[i]);
        
        Anatomy[4].setName("calves");
        calvesH[0].setName("lateral");
        calvesH[1].setName("medial");
         for (int i = 0; i < 3; i++)
            Anatomy[4].setHeads(calvesH[i]);       
        
        Anatomy[5].setName("hamstrings");
        hamstringsH[0].setName("biceps femoris");
        hamstringsH[1].setName("semitendonosis");
        hamstringsH[2].setName("semimembranosis");
         for (int i = 0; i < 3; i++)
            Anatomy[5].setHeads(hamstringsH[i]);     
        
        
        Anatomy[6].setName("glueteus");
        gluteusH[0].setName("medius");
        gluteusH[0].setName("maximus");
        gluteusH[0].setName("minimus");
        for (int i = 0; i < 3; i++)
            Anatomy[6].setHeads(gluteusH[i]);

        Anatomy[7].setName("quadriceps");
        quadricepsH[0].setName("lateral");
        quadricepsH[1].setName("intermedial");    
        quadricepsH[2].setName("medial");
        for (int i = 0; i < 3; i++)
            Anatomy[7].setHeads(quadricepsH[i]);        
        
        Anatomy[8].setName("pectoralis major");
        pectMaH[0].setName("clavicular");
        pectMaH[1].setName("sternocostostal");
        pectMaH[2].setName("abdominal");
        for (int i = 0; i < 3; i++)
            Anatomy[8].setHeads(pectMaH[i]);
        
        Anatomy[9].setName("pectoralis minor");
        pectMiH.setName( "pectoralis Minor");
        Anatomy[9].setHeads(pectMiH);
        
        Anatomy[10].setName("rectus abdominus");//asdasdasdsad
        rectusH.setName("rectus abdominus");
        Anatomy[10].setHeads(rectusH);

        
        Anatomy[11].setName("obliques");
        obliquesH.setName("obliques");
        Anatomy[11].setHeads(obliquesH);
        
        Anatomy[12].setName("serratus posterior");
        serratusPosH[0].setName("superior");
        serratusPosH[1].setName("inferior");
        for (int i = 0; i < 2; i++)        
            Anatomy[12].setHeads(serratusPosH[i]);
        
        Anatomy[13].setName("serratus");
        serratusH.setName("anterior");
        Anatomy[13].setHeads(serratusH);

        
        Anatomy[14].setName("trapezius");
        trapeziusH.setName("trapezius");
       Anatomy[14].setHeads(trapeziusH);
        
        Anatomy[15].setName("teres");        
        teresH[0].setName("minor");
        teresH[1].setName("major");
        for (int i = 0; i < 2; i++)
            Anatomy[15].setHeads(teresH[i]);
        
        
        Anatomy[16].setName("Latissimus dorsi");
        latissH.setName("latissimus dorsi");
        Anatomy[16].setHeads(latissH);
       
        Anatomy[17].setName("thoracolumbar fascia");
        thoraH.setName("thoracolumbar fascia");
        Anatomy[17].setHeads(thoraH);
    }

    
}
