/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicstreamer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStream;

import javazoom.jl.player.*;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author 018639476
 */
public class MusicStreamer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Gson gson = new Gson();
//        Release r1 = new Release("786876", "kjhkj");
//        String json = gson.toJson(r1);
//        System.out.println(json);
//        Gson g = new Gson();
//        String jsonObj = "{'id':'786876','name':'kjhkj'}";
        try{
            SongManager sm = new SongManager();
            List<SongRecord> l = sm.findSongByArtist("Casual");
            System.out.println(l.get(0).getRelease().getName());
            System.out.println(l.get(0).getArtist().getName());
            MusicStreamer.mp3play("data\\SOMZWCG12A8C13C480.mp3");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
          /**
     * Play a given audio file.
     * @param audioFilePath Path of the audio file.
     */
    static void mp3play(String file) {
        try {
            // It uses CECS327InputStream as InputStream to play the song 
             InputStream is = new CECS327InputStream(file);
             Player mp3player = new Player(is);
             mp3player.play();
	     }
	     catch (JavaLayerException exception) 
         {
	       exception.printStackTrace();
	     }
         catch (IOException exception)
         {
             exception.printStackTrace();
         }  
    }
    
}
