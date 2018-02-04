
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessapp;

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
public class JsonLoading {
    
    private JsonElement jse;
    private JsonElement jse2;
    private final String API_TOKEN;
    private final String BlobCode;
    private final String url;
    private final String filename;
    private final String path;
    private File workoutList;
    Gson googleJson;
    
    public static void main(String [] args)
    {
        JsonLoading a = new JsonLoading();
        HashMap b = a.getWorkout("front deltoid raise");
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
        //System.out.println(a.getWorkout("front deltoid raise"));
        
        
    }
    public JsonLoading()
    {
        googleJson = new Gson();
        API_TOKEN = "8f22769dd8ec2d6e";
        filename = "workouts.txt";
        url = "https://jsonblob.com/api/jsonBlob/";
        BlobCode = "09565048-0908-11e8-8df3-4fb0a68d6481";
        path = "libs/" + filename;
        workoutList = new File(path);
        
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
                //System.out.println("Here (Line 65): " + isr);
                jse = parser.parse(isr);
                //System.out.println("Here (Line 67): " + jse);
                
                workoutList.createNewFile();
                PrintWriter writer = new PrintWriter(path, "UTF-8");
                String workoutsToWrite = jse.getAsJsonObject().toString();
                //System.out.println("Second Reading: " + workoutsToWrite);
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
               
                //System.out.println(workoutList.exists());
                //System.out.println(workoutList.canRead());
                //System.out.println("Success!");
            }
            else //If the workout List does exist
            {
                try
                {
                    FileReader fr = new FileReader(workoutList);
                    BufferedReader bfr = new BufferedReader(fr);
                    jse = parser.parse(bfr.readLine());
                    //System.out.println("Reading JSON From File: " + jse.toString());
                    
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
            
            //System.out.println( "Before the Reading" + jse.getAsJsonObject());
            jse = jse.getAsJsonObject().get("Workouts").getAsJsonObject();
        }
        catch (NullPointerException npe)
        {
            System.out.println("fail npe");
        }
    }
    
    public HashMap getWorkout(String name)
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
