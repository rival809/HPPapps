package com.example.hppapps

public class konversiSatuan{
    //Ambil Jumlah
    double konversi = 3;
    System.out.println("Jumlah = " + konversi);

    //Ambil Satuan
    String satuan = "miligram";
    System.out.println("Satuan = " + satuan);

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
}

//RUMUS UTAMA Harga Resep
//Harga Barang / Jumlah Barang * Jumlah Resep
class CalculateResep(){
    double jumlahResep = arrJumlahResep[];
    double jumlahBarang = arrJumlahBarang[];
    double hargaBarang = arrHargaBarang[];

    double hargaResep = hargaBarang / jumlahBarang * jumlahResep;
    public static int findSumWithoutUsingStream(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
    sigmaHargaResep =
}

//Sum Harga Produk
fun hitungHargaProduk(array: IntArray): Int {
    var hargaProduk = 0
    for (value in array) {
        hargaProduk += value
    }
    return hargaProduk
}