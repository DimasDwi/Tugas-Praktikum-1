/**
 * Created by user on 3/24/2015.
 */
public class Tujuh {
    public static void main(String[] args) {
        int pertama = 1;
        int akhir = 10;
        double sum = 0;
        double average =0;
        System.out.println("Untuk Menghitung Rata-Rata");
        //Menampilkan nilai yang awalnya
        System.out.println("Nilai Awalnya.... = " +pertama);
        //Menampilkan nilai yang Akhirnya
        System.out.println("Nilai Akhirnya.... = " +akhir);
        while(pertama<=akhir){
            sum=sum+pertama;
            pertama++;
        }
        average=sum/akhir;
        System.out.println("Jumlah yang ada pada deretan diatas= "+sum);
        System.out.println("Rata-Rata "+average);
    }
}
