package com.example.hppapps;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.stream.*;
import java.util.Arrays;

public class Kalkulate{
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String []args){

        Kalkulasii convert = new Kalkulasii();
        int i;
        //Change maximum array size:
        int arraySize = 15;
        double x;

        //Koversi satuan------------------------------

        //----------------
        //Konversi Resep
        System.out.println("\n//Resep//");
        //----------------

        //--Input Resep
        double[] arrayJumlahResepSatuan = new double[arraySize];
        arrayJumlahResepSatuan [0] = 50; //Cabe keriting
        arrayJumlahResepSatuan [1] = 25; //Cabe rawit
        arrayJumlahResepSatuan [2] = 14; //Bawang putih

        //--Input Satuan Resep
        String[] arraySatuanResep = new String[arraySize];
        arraySatuanResep [0] = "gram";
        arraySatuanResep [1] = "gram";
        arraySatuanResep [2] = "gram";

        //Loop Array Class Konversi
        double[] arrayKonversiResep = new double[arraySize];
        for (i = 0; i < arrayJumlahResepSatuan.length; i++) {
            //Akses setiap anggota array
            arrayKonversiResep[i] = convert.konversiSatuan(arrayJumlahResepSatuan[i], arraySatuanResep[i]);

            x = arrayKonversiResep[i];
            System.out.print(x + " ");
        }
        //----------------
        //Konversi Barang
        System.out.println("\n\n//Barang//");
        //----------------

        //--Input Harga Barang
        double[] arrayHargaBeliSatuan = new double[arraySize];
        arrayHargaBeliSatuan [0] = 35000;
        arrayHargaBeliSatuan [1] = 30000;
        arrayHargaBeliSatuan [2] = 30000;

        //--Input Jumlah Barang
        double[] arrayJumlahBeliSatuan = new double[arraySize];
        arrayJumlahBeliSatuan [0] = 1;
        arrayJumlahBeliSatuan [1] = 1;
        arrayJumlahBeliSatuan [2] = 1;

        //--Input Satuan Barang
        String[] arraySatuanBarang = new String[arraySize];
        arraySatuanBarang[0] = "kg";
        arraySatuanBarang[1] = "kg";
        arraySatuanBarang[2] = "kg";

        //-----Memanggil Class Konversi

        double[] arrayKonversiSatuanBarang = new double[arraySize];
        for (i = 0; i < arrayJumlahResepSatuan.length; i++) {
            //Akses setiap anggota array
            arrayKonversiSatuanBarang[i] = convert.konversiSatuan(arrayJumlahBeliSatuan[i], arraySatuanBarang[i]);

            x = arrayKonversiSatuanBarang[i];
            System.out.print(x + " ");
        }

        System.out.println("\n\n//Harga Resep Satuan//");
        double[] arrayResepSatuan = new double[arraySize];
        for (i = 0; i < arrayResepSatuan.length; i++) {
            //Akses setiap anggota array
            arrayResepSatuan[i] = convert.kalkulasiResep(arrayHargaBeliSatuan[i], arrayKonversiSatuanBarang[i], arrayKonversiResep[i]);

            x = arrayResepSatuan[i];
            System.out.print(x + " ");
        }

        //Masukkan hasil kalkulasi resep
        System.out.println("\n\n//Final (Harga Produk)//");
        double hargaProduk = DoubleStream.of(arrayResepSatuan).sum();
        System.out.println("Harga akhir: Rp. " + hargaProduk);

    }
}

class Kalkulasii{
    static double konversiSatuan(double konversi, String satuan){

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
        } if (satuan == "sdm"){
            konversi = konversi * 15; //Sendok makan -> ml
        } if (satuan == "sdt"){
            konversi = konversi * 45; //Sendok teh -> ml
        }
        return konversi;
    }

    static double kalkulasiResep(double hargaBeliSatuan, double jumlahBeliSatuan, double jumlahResepSatuan){
        if (jumlahBeliSatuan == 0){
            jumlahBeliSatuan = 1;
        }
        double hargaResepSatuan = hargaBeliSatuan / jumlahBeliSatuan * jumlahResepSatuan;

        return hargaResepSatuan;
    }
}