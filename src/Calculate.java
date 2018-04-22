public class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculate...");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int summ = first + second;
        int difference = first - second;
        int mltple = first * second;
        int dvsn = first / second;
        System.out.println("Summ = " + summ + " dffrnce = " + difference + " mltple = " + mltple + " dvsn = " + dvsn);

        double firstDble = Double.valueOf(args[2]);
        double secondDble = Double.valueOf(args[3]);
        double summDble = firstDble + secondDble;
        double dffrncDble = firstDble - secondDble;
        System.out.println("SummDble = " + summDble + " dffrncDble = " + dffrncDble);

    }
}
