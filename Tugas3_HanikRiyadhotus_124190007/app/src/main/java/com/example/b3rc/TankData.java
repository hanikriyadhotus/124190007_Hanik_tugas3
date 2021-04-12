package com.example.b3rc;

import java.util.ArrayList;

public class TankData {
    private static  String[] nama = new String[]{"Panzer IV Ausf S", "Tiger I", "M4 Sherman", "Churchill Mk VII", "IS-2", "Pershing", "KV-2"};

    private static int[] gambar = new int[]{R.drawable.ausfd, R.drawable.tiger, R.drawable.m4sherman, R.drawable.churchillmkvii, R.drawable.is2, R.drawable.pershing, R.drawable.kv2};

    public static ArrayList<TankModel> getListData(){
        TankModel tankModel = null;
        ArrayList<TankModel> list = new ArrayList<TankModel>();
        for ( int i = 0; i < nama.length; i++){
            tankModel = new TankModel();
            tankModel.setGambarTank(gambar[i]);
            tankModel.setNamaTank(nama[i]);
            list.add(tankModel);
        }
        return list;
    }
}
