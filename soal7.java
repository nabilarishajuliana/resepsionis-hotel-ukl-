
package com.mycompany.ukl;

import java.util.Scanner;


public class soal7 {

        static Scanner masukkan= new Scanner (System.in);

    public static void main(String[] args) {
        
        int id,hari;
        String cog,gol,kendaraan;
        
        String ID []={"ali","budi","dani","edi","umar"};
        
        //input
        System.out.println("masukkan ID=");
        id=masukkan.nextInt();
        
        if (id<0 || id>ID.length){
            System.out.println("SALAH INPUTTT!!!!");
            System.exit(0);
        }
        System.out.println("masukkan tipe Cottage=");
        cog=masukkan.next();
        System.out.println("masukkan golongan hari=");
        gol=masukkan.next();
        System.out.println("lama menginap=");
        hari=masukkan.nextInt();
      
        System.out.println("masukkan jenis kendaraan=");
        kendaraan=masukkan.next();
        
        System.out.println("================");
        System.out.println("ID="+id);
        System.out.println("Nama Pelangan="+ID[id-1]);
        System.out.println("jenis kendaraan="+kendaraan);
        cottage(cog,gol,hari);
        
        
        
    }
    
    
    
    public static void satu(String hari,int jumlah) {
        int x;
        if (hari.equalsIgnoreCase("weekday")){
            System.out.println("Golongan hari="+hari);
            x=915000*jumlah;
            System.out.println("Biaya="+x);
        }
        else if (hari.equalsIgnoreCase("weekend")){
            System.out.println("Golongan hari="+hari);
             x=1025000*jumlah;
            System.out.println("Biaya="+x);
        }
        else if (hari.equalsIgnoreCase("Holiday")){
            System.out.println("Golongan hari="+hari);
             x=1225000*jumlah;
            System.out.println("Biaya="+x);
        }

    }
    public static void dua(String hari,int jumlah) {
        int x;
        if (hari.equalsIgnoreCase("weekday")){
            System.out.println("Golongan hari="+hari);
            x=575000*jumlah;
            System.out.println("Biaya="+x);
        }
        else if (hari.equalsIgnoreCase("weekend")){
            System.out.println("Golongan hari="+hari);
             x=695000*jumlah;
            System.out.println("Biaya="+x);
        }
        else if (hari.equalsIgnoreCase("Holiday")){
            System.out.println("Golongan hari="+hari);
             x=895000*jumlah;
            System.out.println("Biaya="+x);
        }

    }
    public static void tiga(String hari,int jumlah) {
        int x;
        if (hari.equalsIgnoreCase("weekday")){
            System.out.println("Golongan hari="+hari);
            x=595000*jumlah;
            System.out.println("Biaya="+x);
        }
        else if (hari.equalsIgnoreCase("weekend")){
            System.out.println("Golongan hari="+hari);
             x=715000*jumlah;
            System.out.println("Biaya="+x);
        }
        else if (hari.equalsIgnoreCase("Holiday")){
            System.out.println("Golongan hari="+hari);
             x=915000*jumlah;
            System.out.println("Biaya="+x);
        }

    }
    public static void empat(String hari,int jumlah) {
        int x;
        if (hari.equalsIgnoreCase("weekday")){
            System.out.println("Golongan hari="+hari);
            x=495000*jumlah;
            System.out.println("Biaya="+x);
        }
        else if (hari.equalsIgnoreCase("weekend")){
            System.out.println("Golongan hari="+hari);
             x=575000*jumlah;
            System.out.println("Biaya="+x);
        }
        else if (hari.equalsIgnoreCase("Holiday")){
            System.out.println("Golongan hari="+hari);
             x=755000*jumlah;
            System.out.println("Biaya="+x);
        }

    }
    public static void lima(String hari,int jumlah) {
        int x,y=25000;
        if (hari.equalsIgnoreCase("weekday")){
            System.out.println("Golongan hari="+hari);
            x=y*jumlah;
            System.out.println("Biaya="+x);
        }
        else if (hari.equalsIgnoreCase("weekend")){
            System.out.println("Golongan hari="+hari);
             x=y*jumlah;
            System.out.println("Biaya="+x);
        }
        else if (hari.equalsIgnoreCase("Holiday")){
            System.out.println("Golongan hari="+hari);
             x=35000*jumlah;
            System.out.println("Biaya="+x);
        }
        
       

    }
    
 
    
    public static void cottage(String cog,String gol,int jumlah) {
        if (cog.equalsIgnoreCase("duku")){
            System.out.println("tipe cottage="+cog);
            satu(gol,jumlah);
            
        }
        else if (cog.equalsIgnoreCase("jeruk")){
            System.out.println("tipe cottage="+cog);
            satu(gol,jumlah);
        }
        else if (cog.equalsIgnoreCase("alpukat")){
            System.out.println("tipe cottage="+cog);
            dua(gol,jumlah);
        }
        else if (cog.equalsIgnoreCase("jambu air")){
            System.out.println("tipe cottage="+cog);
            dua(gol,jumlah);
        }
        else if (cog.equalsIgnoreCase("durian")){
            System.out.println("tipe cottage="+cog);
            tiga(gol,jumlah);
        }
        else if (cog.equalsIgnoreCase("melon")){
            System.out.println("tipe cottage="+cog);
            tiga(gol,jumlah);
        }
        else if (cog.equalsIgnoreCase("belimbing")){
            System.out.println("tipe cottage="+cog);
            empat(gol,jumlah);
        }
        else if (cog.equalsIgnoreCase("mangga")){
            System.out.println("tipe cottage="+cog);
            empat(gol,jumlah);
        }
        else if (cog.equalsIgnoreCase("kendondong")){
            System.out.println("tipe cottage="+cog);
            empat(gol,jumlah);
        }
        else if (cog.equalsIgnoreCase("barrack")){
            System.out.println("tipe cottage="+cog);
            lima(gol,jumlah);
        }
        else {
            System.out.println("SALAH INPUTTT!!!!");
        }
    }
    }
    

