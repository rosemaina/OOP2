/**
 * <h1>JavaFX Movie Library Interface</h1> 
 * Our interface has one method retrievingMovies();
 */
package mycompany.movielibaryserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author USER-PC
 */
public interface MovieLibraryInterface extends Remote{
    
    String retrievingMovies() throws RemoteException;    
}
