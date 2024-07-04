public class F_BinomialCoefficient {
    public static void main(String[] args) {
        System.out.println("Binomial Coefficient = " + calculateBinomialCoefficient(5, 2));
    }

    public static int calculateBinomialCoefficient(int n, int r){
        //formula-> fact of n / (fact of r * (fact of n-r))
        //bincoeff=fact_n/(fact_r*(fact_nmr))

        int fact_n=calculateFactorial(n);
        int fact_r=calculateFactorial(r);
        int fact_nmr=calculateFactorial(n-r);

        int binCoeff=fact_n/(fact_r*(fact_nmr));

        return binCoeff;
    }
    public static int calculateFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
