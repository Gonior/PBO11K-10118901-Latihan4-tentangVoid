/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan4.tentangvoid;

/**
 *
 * @author 
 * NAMA         : Dedi Cahya
 * KELAS        : IF-11-K
 * NIM          : 10118901
 * DESKRIPSI    : Menampilkan Jumlah kambing dengan void
 */
public class PBO11K10118901Latihan4TentangVoid {

    public void tambahKambing() {
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        
        System.out.println("Jumlah Kambing setelah ditambah:" + jumlahKambing);
    }
    public static void main(String[] args) {
        PBO11K10118901Latihan4TentangVoid kambingJantan = new PBO11K10118901Latihan4TentangVoid();
        kambingJantan.tambahKambing();
    }
    
}
