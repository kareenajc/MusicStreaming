/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicstreamer;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/**
 *@author 018639476
 * @author kareena chan
 */
public class User //implements Serializable
{
    String fName;
    String lName;
    String username;//should be unique for each user
    String password;
    List<String> playList; //list of user's favorite song ids

    public User(String fName, String lName, String username, String password) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.password = password;
        playList = new ArrayList<String>();
    }
    
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
        public List<String> getPlayList() {
        return playList;
    }

    public void setPlayList(List<String> playList) {
        this.playList = playList;
    }
    
    public void addSongToPlayList(String id){
        if(!playList.contains(id))//no duplicate
            playList.add(id);
    }
    
    public void removeSongFromPlayList(String id) 
    {
        for(int i = 0; i<playList.size(); i++)
        {
            if(playList.get(i).equals(id))
                playList.remove(i);
        }
    }
    
    public void deletePlaylist(){
        playList = new ArrayList<>();
    }
    
    public String toJson()
    {
        //converting User object to Json
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
    
    public boolean saveUser() 
    {
        try{
            String userJson = this.toJson();
            FileWriter writer = new FileWriter("data\\users\\"+this.username+".json");
            writer.write(userJson);
            writer.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
        
    }

}
