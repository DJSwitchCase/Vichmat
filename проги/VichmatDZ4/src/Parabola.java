public class Parabola extends Gauss {
    public static void ParabolaIntegral(double f0, double f1, double f2, double f3, double f4, double h)
    {
        double I = (h/3*(f0+f4+2*f2+4*(f1+f3)));
        System.out.println("I = "+I);
    }
    public static void ParabolaIntegral(double f0, double f1, double f2, double f3, double f4, double f5, double f6, double h)
    {
        double I = (h/3*(f0+f6+2*(f2+f4)+4*(f1+f3+f5)));
        System.out.println("I = "+I);
    }

    public static void ParabolaIntegral(double f0, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8, double h)
    {
        double I = (h/3*(f0+f8+2*(f2+f4+f6)+4*(f1+f3+f5+f7)));
        System.out.println("I = "+I);
    }
}
