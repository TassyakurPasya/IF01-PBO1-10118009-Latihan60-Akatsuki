/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan60.akatsuki;

/**
 *
 * @author user
 */
public class akatsuki {
   protected String namaAnggota;
   protected String asal;
   protected String jurusAndalan;
   
   public akatsuki(String namaAnggota, String asal, String jurusAndalan){
       this.namaAnggota = namaAnggota;
       this.asal = asal;
       this.jurusAndalan = jurusAndalan;
   }
   public void tampil(){
       System.out.println("Nama Anggota : "+namaAnggota);
       System.out.println("Asal : "+asal);
       System.out.println("Jurus Andalan : "+jurusAndalan);
       System.out.println("");
   }
   
}
