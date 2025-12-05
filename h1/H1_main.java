package h1;

public class H1_main {

    public static void main(String[] args) {
        Zahl z;
        z = new Zahl();
        
        z.num = 178;
        z.setEven();
        z.setSmall();
        z.setPositive();

        System.out.println("Zahl: " + z.num);
        System.out.println("gerader Wert?: " + z.even);
        System.out.println("Kleiner als 100?: " + z.small);
        System.out.println("positiver Wert?: " + z.positive);

    }

}




