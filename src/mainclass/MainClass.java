
package mainclass;

import javax.swing.UIManager;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try { 
  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set"); 
        }
        
        new MainSystemLogin("adminLogin.dat","studentRecord.dat","facultyLogin.dat");
    }
    
}
