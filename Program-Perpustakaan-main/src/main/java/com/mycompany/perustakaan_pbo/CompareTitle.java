package com.mycompany.perustakaan_pbo;
import com.mycompany.perustakaan_pbo.models.Koleksi;

import java.util.Comparator;

public class CompareTitle implements Comparator<Koleksi> {
    @Override
    public int compare(Koleksi o1, Koleksi o2) {
        return o1.getNama().compareTo(o2.getNama());
    }
}
