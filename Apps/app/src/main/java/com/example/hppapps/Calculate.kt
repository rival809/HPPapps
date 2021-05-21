package com.example.hppapps

import java.util.stream.*;
import java.util.Arrays;

public class HelloWorld{
    public static void main(String []args){

        kalkulasi convert = new kalkulasi();
        int i;
        int arraySize = 15;
        double x;

        //Array Test
        double[] doubleArray = new double[arraySize];
        doubleArray[1] = 30;
        doubleArray[5] = 50;
        System.out.println(Arrays.toString(doubleArray));
        double arrayTest = DoubleStream.of(doubleArray).sum();
        System.out.println("Test Array: " + arrayTest);


        //theArray da = new theArray();
        //Koversi satuan------------------------------

        //----------------
        //Konversi Resep
        System.out.println("\nINPUT");
        //----------------

        //--Input Resep
        double jumlahResepSatuan = 20;
        double[] arrayJumlahResepSatuan = new double[arraySize];
        arrayJumlahResepSatuan [0] = 20;
        arrayJumlahResepSatuan [1] = 20;
        arrayJumlahResepSatuan [2] = 20;



        //--Input Satuan Resep
        String satuanResep = "gram";
        String[] arraySatuanResep = new String[arraySize];
        arraySatuanResep [0] = "gram";
        arraySatuanResep [1] = "gram";
        arraySatuanResep [2] = "gram";
        System.out.println("Resep: " + jumlahResepSatuan + " " + satuanResep);

        /*
        for (double i : arrayJumlahResepSatuan) {
          System.out.println(i + " + ");
        }
        */

        //-----Memanggil Class Konversi
        jumlahResepSatuan = convert.konversiSatuan(jumlahResepSatuan, satuanResep);

        //Loop Array Class Konversi
        double[] arrayKonversiResep = new double[arraySize];
        for (i = 0; i < arrayJumlahResepSatuan.length; i++) {
            //Akses setiap anggota array
            arrayKonversiResep[i] = convert.konversiSatuan(arrayJumlahResepSatuan[i], arraySatuanResep[i]);

            x = arrayKonversiResep[i];
            System.out.print(x + " ");
        }


        System.out.println("\n//Konversi Resep//");
        System.out.println("Konversi Resep: " + jumlahResepSatuan);

        //masukkan ke dalam array arrayResepSatuan



        //----------------
        //Konversi Barang
        System.out.println("\nINPUT");
        //----------------

        //--Input Harga Barang
        double hargaBeliSatuan = 5000;
        double[] arrayHargaBeliSatuan = new double[arraySize];
        arrayHargaBeliSatuan [0] = 5000;
        arrayHargaBeliSatuan [1] = 5000;
        arrayHargaBeliSatuan [2] = 5000;
        System.out.println("Harga Beli Barang: Rp. " + hargaBeliSatuan);

        //--Input Jumlah Barang
        double jumlahBeliSatuan = 350;
        double[] arrayJumlahBeliSatuan = new double[arraySize];
        arrayJumlahBeliSatuan [0] = 350;
        arrayJumlahBeliSatuan [1] = 350;
        arrayJumlahBeliSatuan [2] = 350;

        //--Input Satuan Barang
        String satuanBarang = "gram";
        String[] arraySatuanBarang = new String[arraySize];
        arraySatuanBarang[0] = "gram";
        arraySatuanBarang[1] = "gram";
        arraySatuanBarang[2] = "gram";
        System.out.println("Jumlah Beli Barang: " + jumlahBeliSatuan + " " + satuanBarang);

        //-----Memanggil Class Konversi
        jumlahBeliSatuan = convert.konversiSatuan(jumlahBeliSatuan, satuanBarang);
        System.out.println("\n//Konversi Beli Bahan//");
        System.out.println("Konversi Beli Bahan: " + jumlahBeliSatuan);

        double[] arrayKonversiSatuanBarang = new double[arraySize];
        for (i = 0; i < arrayJumlahResepSatuan.length; i++) {
            //Akses setiap anggota array
            arrayKonversiSatuanBarang[i] = convert.konversiSatuan(arrayJumlahBeliSatuan[i], arraySatuanBarang[i]);

            x = arrayKonversiSatuanBarang[i];
            System.out.print(x + " ");
        }

        //Masukkan ke dalam array arrayResepSatuan
        double hargaResepSatuan = convert.kalkulasiResep(hargaBeliSatuan, jumlahBeliSatuan, jumlahResepSatuan);
        System.out.println("\n//Harga Resep Satuan//");
        System.out.println("Harga Resep Satuan: Rp. " + hargaResepSatuan);

        System.out.println("\n//Array Harga Resep Satuan//");
        double[] arrayResepSatuan = new double[arraySize];
        for (i = 0; i < arrayResepSatuan.length; i++) {
            //Akses setiap anggota array
            arrayResepSatuan[i] = convert.kalkulasiResep(arrayHargaBeliSatuan[i], arrayKonversiSatuanBarang[i], arrayKonversiResep[i]);

            x = arrayResepSatuan[i];
            System.out.print(x + " ");
        }

        //Masukkan hasil kalkulasi resep
        double hargaBarang = convert.sumHargaBarang();
        System.out.println("\n//Final//");
        System.out.println("Harga barang: Rp. " + hargaBarang);

        System.out.println("\n\n//Final Final//");
        double hargaProduk = DoubleStream.of(arrayResepSatuan).sum();
        System.out.println("Harga akhir: " + hargaProduk);

    }
}

/*
class theArray{
    static double ta(){
        private double array[];
        private int count;
        private int arraysize;


    }

}
*/

class kalkulasi{
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
        } if (satuan == "spoon"){
            konversi = konversi * 15; //Sendok makan -> ml
        } if (satuan == "teaspoon"){
            konversi = konversi * 45; //Sendok teh -> ml
        }

        return konversi;
    }

    static double kalkulasiResep(double hargaBeliSatuan, double jumlahBeliSatuan, double jumlahResepSatuan){
        double hargaResepSatuan = hargaBeliSatuan / jumlahBeliSatuan * jumlahResepSatuan;

        return hargaResepSatuan;
    }

    static double sumHargaBarang(){
        //Sum all hargaResepSatuan (Dynamic Array)
        double[] hargaResep = {10, 50, 30, 20};

        double hargaBarang = DoubleStream.of(hargaResep).sum();

        return hargaBarang;
    }

}
