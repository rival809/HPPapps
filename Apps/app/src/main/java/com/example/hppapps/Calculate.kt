package com.example.hppapps

import java.util.stream.*;

public class HelloWorld{
    public static void main(String []args){

        kalkulasi convert = new kalkulasi();
        convert.konversiSatuan();
        //Koversi satuan

        //----------------
        //Konversi Resep
        //----------------

        //Input Resep
        double jumlahResepSatuan = 20;

        //Input Satuan Resep
        String satuanResep = "mg";
        System.out.println("Resep: " + jumlahResepSatuan + " " + satuanResep);

        //panggil class konversi
        //masukkan ke dalam array arrayResepSatuan



        //----------------
        //Konversi Barang
        //----------------

        //Input Harga Barang
        double hargaBeliSatuan = 5000;
        System.out.println("Harga Beli Barang: Rp. " + hargaBeliSatuan);

        //Input Jumlah Barang
        double jumlahBeliSatuan = 350;

        //Input Satuan Barang
        String satuanBarang = "gram";
        System.out.println("Jumlah Beli Barang: " + jumlahBeliSatuan + " " + satuanBarang);

        //panggil class konversi
        //masukkan ke dalam array arrayResepSatuan

        //public class KalkulasiResep
        double hargaResepSatuan = hargaBeliSatuan / jumlahBeliSatuan * jumlahResepSatuan;

        System.out.println("\nHarga resep = Rp. " + hargaResepSatuan);

        //Sum all hargaResepSatuan (Dynamic Array)
        double[] hargaResep = {10, 50, 30, 20};

        double hargaBarang = DoubleStream.of(hargaResep).sum();
        System.out.println("\nHarga per Barang = Rp. " + hargaBarang);
    }
}

public class kalkulasi{
    public void konversiSatuan{
        //Ambil Jumlah
        double konversi = jumlahBeliSatuan;

        //Ambil Satuan
        String satuan = satuanBarang;

        if (satuan == "ton"){
            konversi = konversi * 1000000000; //Ton -> mg
        } if (satuan == "kg"){
            konversi = konversi * 1000000; //Kilogram -> mg
        } if (satuan == "gram"){
            konversi = konversi * 1000; //Gram -> mg
        } if (satuan == "lusin"){
            konversi = konversi * 12; //Lusin -> piece
        } if (satuan == "rim"){
            konversi = konversi * 500; //Rim -> piece
        } if (satuan == "litre"){
            konversi = konversi * 1000; //Liter -> ml
        } if (satuan == "spoon"){
            konversi = konversi * 15; //Sendok makan -> ml
        } if (satuan == "teaspoon"){
            konversi = konversi * 45; //Sendok teh -> ml
        }

        System.out.println("\nKonversi = " + konversi + " dari satuan " + satuan);
    }

}
