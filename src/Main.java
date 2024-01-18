
public class Main {
    public static void main(String[] args) {
/*
        int [] list = {1,2,3,4,5};
        double sum = 0.0;

        for(int i = 0;i<=list.length; i++){
            sum += i;
        }

        double avarage = sum / list.length;

        System.out.println(avarage);

 */

        int [] list = {1,2,3,4,5};
        int n = list.length;
        double k = 1.0;
        double harmonicSeries = 0.0;

        for (int i = 1; i <= n; i++){
            harmonicSeries += k/i;
        }


        double harmonicAvarage = n /harmonicSeries;
        System.out.println("Harmonik Ortalama : " + harmonicAvarage);
    }
}