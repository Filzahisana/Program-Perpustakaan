package com.mycompany.perustakaan_pbo;
import com.mycompany.perustakaan_pbo.models.Koleksi;

import java.util.Comparator;

public class CompareNoKol implements Comparator<Koleksi> {

    @Override
    public int compare(Koleksi o1, Koleksi o2) {
        return Integer.compare(o1.getNoKoleksi(), o2.getNoKoleksi());
    }
}

