/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.edu.rmit.examples;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

/**
 *
 * @author v10532
 */
public interface ProductAdminRemoteHome extends EJBHome {

    vn.edu.rmit.examples.ProductAdminRemote create()  throws CreateException, RemoteException;
    
}
