package com.example.hppapps

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.stream.*;
import java.util.Arrays;

object Calculate {
    @RequiresApi(Build.VERSION_CODES.N)
    @JvmStatic
    fun main(args: Array<String>) {
        val convert = Kalkulasi
        var i: Int
        //Change maximum array size:
        val arraySize = 15
        var x: Double

        //Koversi satuan------------------------------

        //----------------
        //Konversi Resep
        println("\n//Resep//")
        //----------------

        //--Input Resep
        val arrayJumlahResepSatuan = DoubleArray(arraySize)
        //arrayJumlahResepSatuan[0] = 20.0
        //arrayJumlahResepSatuan[1] = 20.0
        //arrayJumlahResepSatuan[2] = 20.0

        //--Input Satuan Resep
        val arraySatuanResep = arrayOfNulls<String>(arraySize)
        arraySatuanResep[0] = "gram"
        arraySatuanResep[1] = "gram"
        arraySatuanResep[2] = "gram"

        //Loop Array Class Konversi
        val arrayKonversiResep = DoubleArray(arraySize)
        i = 0
        while (i < arrayJumlahResepSatuan.size) {

            //Akses setiap anggota array
            arrayKonversiResep[i] = convert.KonversiSatuan(arrayJumlahResepSatuan[i], arraySatuanResep[i])
            x = arrayKonversiResep[i]
            print("$x ")
            i++
        }

        //----------------
        //Konversi Barang
        println("\n\n/Barang//")
        //----------------

        //--Input Harga Barang
        val arrayHargaBeliSatuan = DoubleArray(arraySize)
        //arrayHargaBeliSatuan[0] = 5000
        //arrayHargaBeliSatuan[1] = 5000
        //arrayHargaBeliSatuan[2] = 5000

        //--Input Jumlah Barang
        val arrayJumlahBeliSatuan = DoubleArray(arraySize)
        //arrayJumlahBeliSatuan[0] = 350
        //arrayJumlahBeliSatuan[1] = 350
        //arrayJumlahBeliSatuan[2] = 350

        //--Input Satuan Barang
        val arraySatuanBarang = arrayOfNulls<String>(arraySize)
        //arraySatuanBarang[0] = "gram"
        //arraySatuanBarang[1] = "gram"
        //arraySatuanBarang[2] = "gram"

        //-----Memanggil Class Konversi
        val arrayKonversiSatuanBarang = DoubleArray(arraySize)
        i = 0
        while (i < arrayJumlahResepSatuan.size) {

            //Akses setiap anggota array
            arrayKonversiSatuanBarang[i] = arraySatuanBarang[i]?.let { convert.KonversiSatuan(arrayJumlahBeliSatuan[i], it) }!!
            x = arrayKonversiSatuanBarang[i]
            print("$x ")
            i++
        }
        println("\n\n//Harga Resep Satuan//")
        val arrayResepSatuan = DoubleArray(arraySize)
        i = 0
        while (i < arrayResepSatuan.size) {

            //Akses setiap anggota array
            arrayResepSatuan[i] = convert.KalkulasiResep(arrayHargaBeliSatuan[i], arrayKonversiSatuanBarang[i], arrayKonversiResep[i])
            x = arrayResepSatuan[i]
            print("$x ")
            i++
        }

        //Masukkan hasil kalkulasi resep
        println("\n\n//Final (Harga Produk)//")
        val hargaProduk: Double = DoubleStream.of(arrayResepSatuan).sum()
        println("Harga akhir: Rp. $hargaProduk")
    }
}

internal object Kalkulasi {
    fun KonversiSatuan(konversi: Double, satuan: String): Double {
        if (satuan === "ton") {
            konversi *= 1000000000 //Ton -> mg
        }
        if (satuan === "kg") {
            konversi *= 1000000 //Kilogram -> mg
        }
        if (satuan === "gram") {
            konversi *= 1000 //Gram -> mg
        }
        if (satuan === "lusin") {
            konversi *= 12 //Lusin -> piece
        }
        if (satuan === "rim") {
            konversi *= 500 //Rim -> piece
        }
        if (satuan === "litre") {
            konversi *= 1000 //Liter -> ml
        }
        if (satuan === "spoon") {
            konversi *= 15 //Sendok makan -> ml
        }
        if (satuan === "teaspoon") {
            konversi *= 45 //Sendok teh -> ml
        }
        return konversi
    }

    fun KalkulasiResep(hargaBeliSatuan: Double, jumlahBeliSatuan: Double, jumlahResepSatuan: Double): Double {
        var jumlahBeliSatuan = jumlahBeliSatuan
        if (jumlahBeliSatuan == 0.0) {
            jumlahBeliSatuan = 1.0
        }
        return hargaBeliSatuan / jumlahBeliSatuan * jumlahResepSatuan
    }
}