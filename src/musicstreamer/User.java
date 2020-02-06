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
    
    /**
     * Verifies user-entered credentials. Logs user in if the credentials are valid and displays an error message if credentials are invalid.
     * @param user - username entered by the user
     * @param pass - password entered by the user
     */
    void login(String user, String pass){
        //check if entered username and password are valid
        if(this.username.equals(user) && this.password.equals(pass)){
            //log in
        }
        else{
            //do not log in. display message.
        }
    }
    
    
    void createPlaylist(){
        ArrayList<Integer> playlistSongs = new ArrayList<Integer>();
        
        
    }
    
    void deletePlaylist(){
        
    }
}
