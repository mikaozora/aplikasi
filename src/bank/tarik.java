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
class tarik {
private int saldo;
    public void ambil(int tab, int t) {
        if(t%100!=0){
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin\nSilahkan ulangi lagi","Transaksi gagal",0);
        }else{
            if(t>tab){
                JOptionPane.showMessageDialog(null, "Saldo Anda tidak mencukupi\nSilahkan ulangi lagi","Transaksi gagal",0);
            }else if(t<50000){
                JOptionPane.showMessageDialog(null, "Besaran minimal pengambilan tunai adalah Rp 50000","Transaksi gagal",0);
            }
            else{
                saldo = tab-t;
                JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : " +saldo);
                JOptionPane.showMessageDialog(null,"Saldo minimal harus Rp 50000,00,Segera lakukan penyetoran untuk menghindaari penutupan akun.","CAUTION",2);
            }
        }
    }

    public int getsaldo() {
       return saldo;
    }
    
}
