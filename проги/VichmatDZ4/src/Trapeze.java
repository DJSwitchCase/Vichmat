public class Trapeze extends Parabola
{
    Trapeze()
    {

    }
    public static double TrapezeIntegral4(double f0, double f1, double f2, double f3, double f4, double h)
    {
        return ((h/2)*(f0+f4+2*(f1+f2+f3)));
    }

    public static double TrapezeIntegral6(double f0, double f1, double f2, double f3, double f4, double f5, double f6, double h)
    {
        return ((h/2)*(f0+f6+2*(f1+f2+f3+f4+f5)));
    }

    public static double TrapezeIntegral8(double f0, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8,double h)
    {
        return ((h/2)*(f0+f8+2*(f1+f2+f3+f4+f5+f6+f7)));
    }
}
