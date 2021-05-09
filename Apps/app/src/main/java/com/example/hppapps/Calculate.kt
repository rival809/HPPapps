package com.example.hppapps

class Conversion(){
    //Conversion is for calculation
    int litre, mililitre, ton, kilogram, gram, miligram, lusin, rim, spoon, teaspoon, piece;
    //Conversion Variables
    //Litre, spoon, teaspon => mililitre
    //Ton, kilogram, gram => miligram
    //Lusin, rim => piece

    //if else
    int xlitre, xton, xkilogram, xgram, xlusin, xrim, xspoon, xteaspoon;
    xlitre = litre * 1000;
    xton = ton * 1000000000;
    xkilogram = kilogram * 1000000;
    xgram = gram * 1000;
    xlusin = lusin * 12;
    xrim = rim * 500;
    xspoon = spoon * 15;
    xteaspoon = teaspoon * 45;

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