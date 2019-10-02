package bank;


import javax.swing.JOptionPane;
import java.io.*;

public class Bank {

    public static void main(String args[]) {
        String str, str1;

        int choice,saldo, z, pin = 1234, counter = 0, a = 3;
        int t, s, tab = 50000;

        JOptionPane.showMessageDialog(null, "Selamat Datang\n ANJUNGAN TUNAI MANDIRI \n BANK OZORA \n\nMasukkan 4 Digit PIN Anda !", "WELCOME", 1);

        try {
            do {

                str = JOptionPane.showInputDialog(null, "Masukkan 4 Digit PIN Anda:",
                        "ATM OZORA", 0);
                pin = Integer.parseInt(str);
                counter += 1; //menghitung kesempatan login

                if (pin == 1234)//cek pin
                {
                    do {
                        str
                                = JOptionPane.showInputDialog(null, "[1] INFORMASI SALDO \n[2]PENYETORAN \n[3] PENARIKAN \n[4] PETUNJUK \n[5] KELUAR \n\nMasukkan Pilihan Menu:", "Pilih Transaksi", 3);

                        choice = Integer.parseInt(str);

                        switch (choice) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : " + tab); //informasi saldo

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "ATM BNI SYARIAH-BOJONEGORO", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM BNI SYARIAH - BOJONEGORO, ambil kartu ATM Anda.");
                                }

                                System.exit(0);

                            case 2:

                                str1 = JOptionPane.showInputDialog(null, "Masukkan jumlah penyetoran: "); //menabung
                                s = Integer.parseInt(str1);
                                //setor hasil = new setor();
                                menabung(tab, s);
                                tab = getsaldo();

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "ATM BNI SYARIAH-BOJONEGORO", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM BRI, ambil kartu ATM Anda.");
                                }
                                System.exit(0);

                            case 3:

                                str1 = JOptionPane.showInputDialog(null, "Masukkan jumlah penarikan : "); //pengambilan

                                t = Integer.parseInt(str1);
                                
                                ambil(tab, t);

                                tab = getsaldo();

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "ATM BNI SYARIAH-BOJONEGORO", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {

                                }
                            case 4:

                                JOptionPane.showMessageDialog(null, "Cara Penggunaan Aplikasi\n[1] Masukkan PIN dengan benar\n[2] Bertransaksilah dengan benar sesuai pilihan\n[3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung\n ", "INFO", 1);
                                break;

                            case 5:
                                z = JOptionPane.showConfirmDialog(null,
                                        "Anda ingin keluar ? ", "  Keluar", JOptionPane.YES_NO_OPTION, 0);

                                if (z == 0) {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM BRI, ambil kartu ATM Anda");
                                    {
                                        System.exit(0);
                                    }
                                }
                                    else
                                    break;

                            default:
                                JOptionPane.showMessageDialog(null, "Pilihan menu tidak tersedia\nSilahkan ulangi lagi", "ERROR", 0);
                        }
                    } 
                    while (1 == 1);
                } else if (counter < 3) {	//jika pin salah

                    a--; //menghitung kesalahan login dan memberikan kesempatan login

                    JOptionPane.showMessageDialog(null, "Pin Salah !\nPastikan PIN yang anda masukkan benar", "ERROR", 0);

                    JOptionPane.showMessageDialog(null, "\nKesempatan login " + a + " kali lagi" + "\n");

                } else {

                    JOptionPane.showMessageDialog(null, "Untuk bantuan nasabah,\nsilahkan menghubungi call center 555123 (Gratis)", "Kartu ATM anda diblokir!", 0);

                    System.exit(0);
                }
            } while (1 == 1);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan !\nPastikan kode yang anda masukkan berformat benar ! \nPROGRAM KELUAR! \nTerimakasih", "ERROR", 0);

        }
    }
    public static int saldo;
    private static void ambil(int tab, int t) {
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

    private static void menabung(int tab, int s) {
        if(s%100!=0){
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi kembali!","Transaksi Gagal",0 );
        }else if(s<50000){
            JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai adalah Rp 50000,00","ERROR",0);
        }else if(s>=50000){
            saldo = tab + s;
            JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : " +saldo);
        }
    }
    public static int getsaldo() {
       return saldo;
    }
    }
    


