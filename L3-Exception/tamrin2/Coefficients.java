public class Coefficients extends Exception{
    protected static int a,b,c;
    protected Coefficients(String msg){
        super(msg);
    }
    protected Coefficients(){}
    protected static double delta(double x,double y, double z) throws Coefficients{
        double x1,x2,delta1;
       delta1 = y*y-4*x*z;
       if (x==0 || delta1<0)
           throw new Coefficients("Either delta is negative or the equation isn't a quadratic equation");
       else
           return delta1;
    }
}
