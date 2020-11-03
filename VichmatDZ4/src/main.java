public class main extends Trapeze {
    public static double f0;
    public static double f1;
    public static double f2;
    public static double f3;
    public static double f4;
    public static double f5;
    public static double f6;
    public static double f7;
    public static double f8;
    public static double K=2.4; //2.4
    public static double L=1.4; //1.4
    public static double a = (K-L)/2; //0,5
    public static double b = K+L;     //3,8
    public static double n = 8;
    public static double h = (b-a)/n;

    public static double fcount(double f)
    {
        return ((f+L)/(f*f+f+K));
    }

    public static void soutsout()
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("h = "+h);
        System.out.println("f0 = " +f0);
        System.out.println("f1 = "+f1);
        System.out.println("f2 = "+f2);
        System.out.println("f3 = "+f3);
        System.out.println("f4 = "+f4);
        System.out.println("f5 = "+f5);
        System.out.println("f6 = "+f6);
        System.out.println("f7 = "+f7);
        System.out.println("f8 = "+f8);
    }


    public static void main(String[] args) {
    //Считаем значение функции
    f0=fcount(a+0*h);
    f1=fcount(a+1*h);
    f2=fcount(a+2*h);
    f3=fcount(a+3*h);
    f4=fcount(a+4*h);
    f5=fcount(a+5*h);
    f6=fcount(a+6*h);
    f7=fcount(a+7*h);
    f8=fcount(a+8*h);
    soutsout();

        GaussIt(a,b,-0.960289,1); //
        GaussIt(a,b,-0.796666,2);
        GaussIt(a,b,-0.525532,3);
        GaussIt(a,b,-0.183434,4);
        GaussIt(a,b,0.183434,5);
        GaussIt(a,b,0.525532,6);
        GaussIt(a,b,0.796666,7);
        GaussIt(a,b,0.960289,8);
        //Это то, на что ты умножаешь Ai
        double f11 = fcount(GetGaussIt(a,b,-0.960289));
        double f22 = fcount(GetGaussIt(a,b,-0.796666));
        double f33 = fcount(GetGaussIt(a,b,-0.525532));
        double f44 = fcount(GetGaussIt(a,b,-0.183434));
        double f55 = fcount(GetGaussIt(a,b,0.183434));
        double f66 = fcount(GetGaussIt(a,b,0.525532));
        double f77 = fcount(GetGaussIt(a,b,0.796666));
        double f88 = fcount(GetGaussIt(a,b,0.960289));

        System.out.println("f11 = "+f11);
        System.out.println("f22 = "+f22);
        System.out.println("f33 = "+f33);
        System.out.println("f44 = "+f44);
        System.out.println("f55 = "+f55);
        System.out.println("f66 = "+f66);
        System.out.println("f77 = "+f77);
        System.out.println("f88 = "+f88);
        GaussIntegral(0.101228,0.222381, 0.313706, 0.362683, f11, f22, f33, f44, f55, f66,f77, f88, a, b);
        //ParabolaIntegral(f0,f1,f2,f3,f4,f5, f6, f7, f8, h);
        //System.out.println("I = "+integral8(f0,f1,f2,f3,f4,f5,f6,f7,f8,h));

    }
}
