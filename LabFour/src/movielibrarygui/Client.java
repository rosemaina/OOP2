/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielibrarygui;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author USER-PC
 */
public class Client {
    private Client(){}
    public static void main(String[] args) {
        
        try {
            
     /**
      *Getting the registry
      */
            Registry registry = LocateRegistry.getRegistry(null);
      /**
       *Looking up the registry for the remote object      
       */
            MovieLibraryInterface stub = (MovieLibraryInterface) registry.lookup("serverStatus");
      /**
       * Calling the remote method using the obtained object
       */      
            stub.retrievingMovies();
        } catch (Exception e) {
            System.err.println("Client Exception: "+ e.toString());
            e.printStackTrace();
        }
    }
    
}
