/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS GAMING PC
 */
public class mbuatlagi {
    public static void main(String[] args) {
        String x,y;
        String pass;
        int choice,z;
        int nilai1;
        int nilai2;
        JOptionPane.showMessageDialog(null, "Haloo! LUWAK WHITE COFFEE \n\nPasswordnya.....", "WELCOME", 1);
        x= JOptionPane.showInputDialog(null, "[1] Kopi Nikmat Nyaman Diminum\n[2] Kopi Nikmat Ga Bikin Kembung\n[3] Kopine ra enak\n[4] Enakan Kopi Kapal Api");
        choice = Integer.parseInt(x);
        switch(choice){
            case 1: 
                x = JOptionPane.showInputDialog("PASSWORD ANDA BENAR!!\nMasukkan nilai 1 ");
                y = JOptionPane.showInputDialog("Masukkan nilai 2 ");

                nilai1 = Integer.parseInt(x);
                nilai2 = Integer.parseInt(y);
                int tambah = nilai1 + nilai2;
                JOptionPane.showMessageDialog(null,"Hasil dari "+nilai1+ "+" +nilai2+ "=" +tambah,"HASIL",0);
                z = JOptionPane.showConfirmDialog(null, "LANJUUT??", "KALKULATOR ELEK", JOptionPane.YES_NO_OPTION, 3);
                if(z==0){
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "MAKASIIIHH" );
                }
                    System.exit(0);
            case 2:
                JOptionPane.showMessageDialog(null, "PASSWORDNYA SALAH WLEKKKKK:p" );
                z = JOptionPane.showConfirmDialog(null, "LANJUUT??", "KALKULATOR ELEK", JOptionPane.YES_NO_OPTION, 3);
                if(z==0){
                    break;
                }
            case 3:
                JOptionPane.showMessageDialog(null, "LUWAK WHITE COFFE WOYY SENG PALENG WENAK!!!" );
                z = JOptionPane.showConfirmDialog(null, "LANJUUT??", "KALKULATOR ELEK", JOptionPane.YES_NO_OPTION, 3);
                if(z==0){
                    break;
                }
                
            case 4:
                JOptionPane.showMessageDialog(null, "KOPI KAPAL API GAENAK!!MURAHAN!!! KOPINE BAPAK-BAPAK MISKIN" );
                z = JOptionPane.showConfirmDialog(null, "LANJUUT??", "KALKULATOR ELEK", JOptionPane.YES_NO_OPTION, 3);
                if(z==0){
                    break;
                }
        }
        
    
        
        
        
    }
}
