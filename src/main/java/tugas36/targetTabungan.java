/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas36;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author dropsuite
 */
public class targetTabungan {
    double saldoAwal;
    double saldoTarget;
    double bunga;
    
    public double hitungBungaBulanan(double saldoAhkir){
        double toPercentaseBunga = bunga/100;
        return Math.floor(toPercentaseBunga*saldoAhkir);
    }
    
    public void hitungTabunganBulanan(double parSaldoTarget){
        Locale localeID = new Locale("in", "ID");
        NumberFormat Rupiah = NumberFormat.getCurrencyInstance(localeID);
        Rupiah.setMaximumFractionDigits(0);
        Rupiah.setMinimumFractionDigits(0);
        
        double saldoAkhir = saldoAwal;
        var i=1;
        
        while(saldoAkhir<parSaldoTarget){
            double bungaBulanan = hitungBungaBulanan(saldoAkhir);
            saldoAkhir = bungaBulanan+saldoAkhir;
            String saldoAkhirRupiah = Rupiah.format(saldoAkhir);
            System.out.println("Saldo di bulan ke-"+i+" "+saldoAkhirRupiah);
            i++;

        }
    }
}
