public class Gauss
{
    public static void GaussIt(double a, double b, double ti, int i) //Значение для i=1,2,3...
    {
        double It = ((a+b)/2+(b-a)/2*ti);
        System.out.println("It("+i+") = "+It);
    }

    public static double GetGaussIt(double a, double b, double ti)
    {
        return ((a+b)/2+(b-a)/2*ti);
    }

    public static void GaussIntegral(double A1, double A2, double f1, double f2, double f3, double f4, double a, double b)
    {
        double I = ((b-a)/2)*(A1*f1+A2*f2+A2*f3+A1*f4);
        System.out.println("GaussI = "+I);
    }

    public static void GaussIntegral(double A1, double A2, double A3, double f1, double f2, double f3, double f4, double f5, double f6, double a, double b)
    {
        double I = ((b-a)/2)*(A1*f1+A2*f2+A3*f3+A3*f4+A2*f5+A1*f6);
        System.out.println("GaussI = "+I);
    }
    public static void GaussIntegral(double A1, double A2, double A3, double A4, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8, double a, double b)
    {
        double I = ((b-a)/2)*(A1*f1+A2*f2+A3*f3+A4*f4+A4*f5+A3*f6+A2*f7+A1*f8);
        System.out.println("GaussI = "+I);
    }

}
