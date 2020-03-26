
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class frameutama extends JFrame {
    public frameutama(){
        this.setSize(200,200);
        this.setLocation(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    
    public void tmpil(){
        this.setVisible(true);
    }
    
   public void tmpil(String nama){
       this.setTitle(nama);
       this.setVisible(true);
   }
}
   
