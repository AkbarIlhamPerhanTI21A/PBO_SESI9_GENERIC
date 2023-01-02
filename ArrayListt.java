/**
 * PBO Session 9
 * Akbar Ilham Perhan
 * 20210040083
 * TI21A
 * Implement ArrayList in Java
 * */

import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
    ArrayList<String> MakananEnak = new ArrayList<>();
    
    MakananEnak.add("Rendang(Indonesia)");
    MakananEnak.add("Balut(Filipina)");
    MakananEnak.add("Kebab (Turki)");
    MakananEnak.add("Babi Guling (Indonesia)");
    MakananEnak.add("Nasi Mandi (Arab Saudi)");
    MakananEnak.add("Terang Bulan (Indonesia)");
 
    
    
    System.out.println("Daftar Makanan Enak di Penjuru Dunia :");
    for (int i = 0; i < MakananEnak.size(); i++) {
      System.out.println((i+1) + ". " + MakananEnak.get(i));
    }
    
    MakananEnak.remove(3); 
    MakananEnak.remove(1); 
    System.out.println("\n Makanan Enak yang Halal:");
    for (int i = 0; i < MakananEnak.size(); i++) {
      System.out.println((i+1) + ". " + MakananEnak.get(i));
    }
  }
}
