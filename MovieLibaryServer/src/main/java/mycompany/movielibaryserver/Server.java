/**
 * <h1>JavaFX Movie Library Server</h1> 
 * A main Class on the server Side of the program
 * The class will return the data requested by the ClientSide.
 */
package mycompany.movielibaryserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *Our server will return a response showing that it's running
 * 
 */
public class Server extends ServerInterfaceImplementation{
    
    public Server(){};
    
 /**
  * @param args the command line arguments
  */
    public static void main(String[] args) throws RemoteException {
       try{
  /**
  * Instantiating the implementation class 
  */    
       ServerInterfaceImplementation serverInterfaceImplementation = new ServerInterfaceImplementation();
       
  /**
  * Exporting the object of implementation class 
  */       
       MovieLibraryInterface stub = (MovieLibraryInterface) UnicastRemoteObject.exportObject(serverInterfaceImplementation, 0);
  /**
  * Binding the remote object in the registry 
  */  
       Registry registry = LocateRegistry.getRegistry();
       registry.rebind("serverStatus", stub);
 
       System.out.println("Server is running");
       }
       
      catch(Exception e){
          System.out.println("Connection Failed!");
          System.err.println("Server Excemption: "+ e.toString());
          e.printStackTrace();
      }
    }
}
