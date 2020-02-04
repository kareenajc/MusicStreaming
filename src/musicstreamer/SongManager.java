
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicstreamer;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author 018639476
 */
public class SongManager {
    List<SongRecord> dataList; //contains the list of all song-records
    HashMap <String, List<Integer>> songNameMap; //maps the name of an artist (key) to the list of song-records' indexes by that artist (value).
    SongManager() throws FileNotFoundException
    {
        //reading from .json file and converting a list of json strings to a list of java objects using Gson. 
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("data\\music.json"));
        SongRecord[] data = gson.fromJson(reader, SongRecord[].class);
        dataList = Arrays.asList(data);
        
        //creating the map <artist-name, song-record-index-list>
        //indeces are based on location of each songRecord in List<SongRecord> dataList
        songNameMap = new HashMap<>();
        for(int i = 0; i<dataList.size(); i++)
        {
            String key = dataList.get(i).getArtist().getName();
            if(songNameMap.containsKey(key))//if the key exists
            {
                List<Integer> indexList = songNameMap.get(key);//get the existing list (value) for the key
                indexList.add(i);//append i to existing list
                songNameMap.put(key, indexList);//replace the old list with updated list for the key in the map
            }
            else //if key does not exist
            {
                List<Integer> indexList = new ArrayList<>(); //make a new list for the key
                indexList.add(i); //add the index to the list
                songNameMap.put(key, indexList); //add the key and list (value) to the map
            }
        }
    }

    public HashMap<String, List<Integer>> getSongNameMap() {
        return songNameMap;
    }
    
    public List<SongRecord> findSongByArtist(String artist)
    {
        List<Integer> l = songNameMap.get(artist);
        List<SongRecord> records = new ArrayList<>();
        for(Integer i:l)
        {
            records.add(dataList.get(i));
        }
        return records;
    }
    
    
    
}
