/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bungalaundry;
import java.util.ArrayList;
/**
 *
 * @author codexhaq
 */
public class Transaksi {
    private String namaOwner;
    private String txtDesc;
    private String txtAddress;
    private String txtNoHp;
    private int txtWeight;
    private String txtChoose;
    private String txtKurir;
    private int totalHarga;

    public ArrayList<Transaksi> listTrans;
    
    public Transaksi(){
        listTrans = new ArrayList<>();
    }
    //Overloading
    public Transaksi(String namaOwner, String txtDesc, String txtAddress, String txtNoHp, int txtWeight, String txtChoose, String txtKurir, int totalHarga) {
        this.namaOwner = namaOwner;
        this.txtDesc = txtDesc;
        this.txtAddress = txtAddress;
        this.txtNoHp = txtNoHp;
        this.txtWeight = txtWeight;
        this.txtChoose = txtChoose;
        this.txtKurir = txtKurir;
        this.totalHarga = totalHarga;
    }
    
    public void SimpanData(String nama, String desc, String alamat, String nohp, int berat, String pilih, String kurir, int harga){
       listTrans.add(new Transaksi(nama, desc, alamat, nohp, berat, pilih, kurir, harga)); 
    }
    
    public String CetakStruk(String nama, String desc, String alamat, String nohp, int berat, String type, String kurir, int harga){
        int type_price = 0;
        int kurir_price = 0;
        String cetak = "";
        cetak += "\n========================================";
        cetak += "\n|               Bunga Laundry          |";
        cetak += "\n========================================";
        cetak += "\nAtas Nama   \t: " + nama;
        cetak += "\nKeterangan  \t: \n";
        cetak += "\n" + desc + "\n";
        cetak += "\nAlamat      \t: \n";
        cetak += "\n" + alamat + "\n";
        cetak += "\nNo. Hp      \t: " + nohp;
        cetak += "\n========================================";
        cetak += "\nBerat       \t: "+ berat +" Kg";
        if(null != type)switch (type) {
            case "1":
                type_price = 3000;
                type = "Dry Cleaning";
                break;
            case "2":
                type_price = 5000;
                type = "Kilat Cleaning";
                break;
            case "3":
                type_price = 4000;
                type = "Washing Iron";
                break;
            case "4":
                type_price = 8000;
                type = "Kilat Washing Iron";
                break;
            default:
                type_price = 0;
                type = "";
                break;
        }
        cetak += "\nHarga Laundry \t: " + type;
        cetak += "\n                  " + berat + " x " + type_price + " = Rp." + (berat * type_price);
        if(type_price != 0){
            if(null == kurir) {
            } else {
                switch (kurir) {
                    case "1":
                        kurir_price = 4000;
                        break;
                    case "2":
                        kurir_price = 7000;
                        break;
                    case "3":
                        kurir_price = 12000;
                        break;
                    default:
                        kurir_price = 0;
                        break;
                }
            cetak += "\nEkpedisi \t: Rp. " + kurir_price;
            }
        }
        
        cetak += "\n========================================";
        cetak += "\nTotal Harga \t: Rp." + harga;
        cetak += "\n========================================";
        
        
        return cetak;
    }
    
    public void showData(){
        
        //this function using for debug data to ArrayList
        listTrans.forEach((data) -> {
            System.out.println("Data Masuk atas nama : " + data.getNamaOwner());
        });
        System.out.println("=============================================");
    };
    
    public ArrayList<Transaksi> data(){
        return listTrans;
    }
    
    public String getNamaOwner() {
        return namaOwner;
    }

    public String getTxtDesc() {
        return txtDesc;
    }

    public String getTxtAddress() {
        return txtAddress;
    }

    public String getTxtNoHp() {
        return txtNoHp;
    }

    public int getTxtWeight() {
        return txtWeight;
    }

    public String getTxtChoose() {
        return txtChoose;
    }

    public String getTxtKurir() {
        return txtKurir;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    
    
}
