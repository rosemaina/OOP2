/**
 * <h1>JavaFX Movie Library Interface Implementation</h1> 
 * The method retrievingMovies() is implemented
 * 
 */
package mycompany.movielibaryserver;

import java.rmi.RemoteException;

/**
 *
 * @author USER-PC
 */
public class ServerInterfaceImplementation implements MovieLibraryInterface{

    String ServerStatus = "Server Retrieved movies";
/** 
 * @return This method returns a String showing "Server retrieved movies"
 */    
    @Override
    public String retrievingMovies() throws RemoteException {
        return ServerStatus;
     }
}
