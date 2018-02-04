
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessapp;

//Imports
import java.io.InputStreamReader;
import java.net.URL;
import java.io.InputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import com.google.gson.*;
import java.util.HashMap;
import java.util.Set;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
/**
 * Class for grabbing the JSON file if it isn't locally on the machine.
 * @author Tayler
 */
//Constructor
public class JsonLoading {
    
    private static JsonElement jse;
    private static final String BlobCode = "09565048-0908-11e8-8df3-4fb0a68d6481";
    private static final String url = "https://jsonblob.com/api/jsonBlob/";
    private static final String filename = "workouts.txt";
    private static final String path = "libs/" + filename;
    private static File workoutList = new File(path);
    private static Gson googleJson = new Gson();;
    
    //Used for testing, Main method 
    public static void main(String [] args)
    {
        new JsonLoading();
        HashMap b = JsonLoading.getWorkout("front deltoid raise");
        Set entrySet = b.entrySet();
        Iterator it = entrySet.iterator();
        System.out.println("HashMap Key-Value Pairs: ");
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            String[] temp = (String[])me.getKey();
            System.out.println("Key is: " + "[" + temp[0] + ", " + temp[1] + ", " +temp[2] + "]"  + 
                    " & " + "value is: " + me.getValue());
        }
        
        
    }
    
    //Default constructor, it has to be initialized. before any static calls are made
    //It will find the download the JSon from online if it isn't on the local machine.
    public JsonLoading()
    {
        try
        {
            JsonParser parser = new JsonParser();
            
            //If the workout list doesn't exist
            if (!workoutList.exists())
            {
                System.out.println("Getting JSON from the web...");
                try
                {
                URL theRealURL = new URL(url + BlobCode);
                InputStream is = theRealURL.openStream();
                InputStreamReader isr = new InputStreamReader(is);
                jse = parser.parse(isr);
                
                workoutList.createNewFile();
                PrintWriter writer = new PrintWriter(path, "UTF-8");
                String workoutsToWrite = jse.getAsJsonObject().toString();
                writer.write(workoutsToWrite);
                
                writer.close();
                is.close();
                isr.close();
                }
                catch (java.net.MalformedURLException mue)
                {
                    System.out.println("fail mue");
                }
                catch (java.io.IOException ioe)
                {
                    System.out.println("fail ioe");
                }
               
            }
            else //If the workout List does exist
            {
                try
                {
                    FileReader fr = new FileReader(workoutList);
                    BufferedReader bfr = new BufferedReader(fr);
                    jse = parser.parse(bfr.readLine());
                    
                    fr.close();
                    bfr.close();
                }
                catch (java.io.FileNotFoundException fnfe)
                {
                    System.out.println("File Not Found");
                }
                catch(java.io.IOException ioe)
                {
                    System.out.println("IO Exception!");
                }
                
            }
            jse = jse.getAsJsonObject().get("Workouts").getAsJsonObject();
        }
        catch (NullPointerException npe)
        {
            System.out.println("fail npe");
        }
    }
    
    //The name of the workout is the input, and the output is a HashMap of the
    // mapping that correlates to a muscle head and a value of work done. All the
    //GUI has to do is to correlate button presses to a method call
    public static HashMap getWorkout(String name)
    {   
        //System.out.println("Searching for " + name);
        HashMap<String[],Integer> workouts = new HashMap();
        //System.out.print("Right Before the Array Call " + jse.toString());
       
        JsonObject objs = jse.getAsJsonObject().get(name).getAsJsonObject();
        
        for(int i = 1; objs.has(("key" + i)); ++i )
        {
            String[] temp = objs.get(("key"+i)).toString().split(",");
            workouts.put(temp,Integer.parseInt(objs.get(("value"+i)).toString()));
            //temp = (HashMap<String, Integer>)((Object)(objs.get(i)));
        }
        return workouts;
    }
}
