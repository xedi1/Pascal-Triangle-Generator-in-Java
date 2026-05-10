
import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;

public class rpaskal {
    private int n;
    private int[][] Array;
    private Scanner Input;

    public rpaskal(){
        Input=new Scanner(System.in);
    }

    public void readN(){
        System.out.println("======= Paskal Creation ==========");
        System.out.println("Enter Number Rows:");
        n = Input.nextInt();
    }

    public void paskal(){
        this.readN();

        Array = new int[n][];

        for (int i=0; i<n; i++){
            Array[i] = new int[i+1];

            Array[i][0]= 1;
            Array[i][i]= 1;

            for (int j=1; j<i; j++){
                Array[i][j] = Array[i-1][j-1] + Array[i-1][j];
            }
        }

        print();
    }

    public void print(){
        System.out.println("Paskal Matrix|");
        for (int i=0; i<n; i++){
            for (int j=0; j<Array[i].length; j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        rpaskal Start = new rpaskal();
        Start.paskal();
    }
}
