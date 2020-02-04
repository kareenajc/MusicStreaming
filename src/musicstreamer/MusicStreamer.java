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
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
