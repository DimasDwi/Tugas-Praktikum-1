/**
 * Created by user on 4/7/2015.
 */
public class TestMethodloading {
    public static int average(int n1, int n2){              // A
        return (n1+n2)/2;
    }

    public static double average(double n1, double n2){     // B
        return (n1+n2)/2;
    }

    public static int average(int n1, int n2, int n3){       // C
        return (n1+n2+n3)/3;
    }

    public static double average(double n1, double n2, double n3, double n4){
        return (n1+n2+n3+n4)/4;
    }

    public static void main(String[] args) {
        System.out.println(average(1,2));
        System.out.println(average(1.0,2.0));
        System.out.println(average(1,2,3));
        System.out.println(average(1.0,2));
        System.out.println(average(1.0,2.0,3.0,4.0));
    }
}
