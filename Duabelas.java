/**
 * Created by user on 3/24/2015.
 */
public class Duabelas {
    public static void main(String[] args) {

        int panjang=4;
        int lebar=7;

        for (int i=1;i<=lebar;i++){
            if (i%2==0){
                System.out.print(" ");
            }
            for (int j=1;j<=panjang;j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}

