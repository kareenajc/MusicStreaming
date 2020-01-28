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
            //reading from .json file and converting a list of json strings to a list of java objects using Gson. 
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader("C:\\Users\\018639476\\Documents\\NetBeansProjects\\MusicStreamer\\src\\musicstreamer\\music.json"));
            SongRecord[] data = gson.fromJson(reader, SongRecord[].class);
            System.out.println(data.length);
            System.out.println(data[9999].getSong().getLoudness());
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
