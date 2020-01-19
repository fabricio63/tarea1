
public class Main {
    public static void main(String[] args){
        int fuel = calculateFuel(14);
        System.out.println("Fuel needed" + fuel);
    }
    public static int calculateFuel(int mass){
        return (mass/3)-2;
    }
}
