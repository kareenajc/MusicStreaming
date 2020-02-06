/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicstreamer;
import java.util.*;

/**
 *
 * @author kareena chan
 */
public class User {
    String fName;
    String lName;
    String username;
    String password;
    HashMap<String, List<Integer>> playlists;
    
    public User(String firstName, String lastName, String user, String pass){
        String fName = firstName;
        String lName = lastName;
        String username = user;
        String password = pass;
        HashMap<String, List<Integer>> playlists = new HashMap<String, List<Integer>>(); //key: playlist name. value: list of song indexes
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
    
    void createPlaylist(){
        ArrayList<Integer> playlistSongs = new ArrayList<Integer>();
        
        
    }
    
    void deletePlaylist(){
        
    }
}
