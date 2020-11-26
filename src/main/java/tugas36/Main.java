/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas36;

/**
 *
 * @author
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class Main {
    public static void main(String[] args) {
        targetTabungan targetTabungan = new targetTabungan();
        targetTabungan.saldoAwal = 3500000;
        targetTabungan.saldoTarget = 6000000;
        targetTabungan.bunga = 8;
        targetTabungan.hitungTabunganBulanan(targetTabungan.saldoTarget);
    }  
}
