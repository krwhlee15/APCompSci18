public class Cart2d
{
    double x;
    double y;

    public Cart2d (double xx, double yy)
    {
        x = xx;
        y = yy;
    }
    static double epsilon = 1.0e-3;
    public double getX ()
    {
        return (x);
    }
    public static double getX (Cart3d W)
    {
        return (W.x);
    }
    public double getY ()
    {
        return (y);
    }
    public static double getY (Cart3d W)
    {
        return (W.y);
    }
    public void setX (double xx)
    {
        x = xx;
    }
    public void setY (double yy)
    {
        y = yy;
    }
    public double distance (Cart2d W)   //distance
    {
        return (Math.sqrt ((x - W.x) * (x - W.x) + (y - W.y) * (y - W.y)));
    }
    public static double distance (Cart2d W1, Cart2d W2)        //distance
    {
        return (Math.sqrt ((W1.x - W2.x) * (W1.x - W2.x) +
                           (W1.y - W2.y) * (W1.y + W2.y)));
    }
    public Cart2d midpoint (Cart2d W)   //midpoint
    {
        double xm = (x + W.x) / 2.0;
        double ym = (y + W.x) / 2.0;
        Cart2d midpoint = new Cart2d (xm, ym);
        return (midpoint);
    }
    public static Cart2d midpoint (Cart2d W1, Cart2d W2)        //midpoint
    {
        return (new Cart2d ((W1.x + W2.x) / 2, (W1.y + W2.y) / 2));
    }
    public String toString ()   //toString method
    {
        String retStr = "";
        retStr +=
            "(" + String.format ("%.3f", x) + "," + String.format ("%.3f",
                                                                   y) + ")";
        return (retStr);
    }
    public Cart2d ()            //"no-argument" Constructor
    {
        x = 0.0;
        y = 0.0;
    }
    public Cart2d (Cart2d W)    //"Copy" Constructor
    {
        x = W.x;
        y = W.y;
    }
    public Cart2d (double val)  //one-argument Constructor
    {
        x = val;
        y = 0;
    }

    public static double triangle (Cart2d[]x)   //triangle area
    {
        double a = x[0].distance (x[1]);
        double b = x[1].distance (x[2]);
        double c = x[2].distance (x[0]);
        double s = (a + b + c) / 2;
        return (Math.sqrt (s * (s - a) * (s - b) * (s - c)));
    }
    public static Cart2d ratio (Cart2d P, Cart2d Q, double m, double n) //internal division
    {
        return (new
                Cart2d ((m * Q.x + n * P.x) / (m + n),
                        (m * Q.y + n * P.y) / (m + n)));
    }
    public Cart2d ratio (Cart2d W, double m, double n)  //internal division
    {
        return (new
                Cart2d ((m * W.x + m * x) / (m + n),
                        (m * W.y + n * y) / (m + n)));
    }
    public static void setepsilon (double val)  //set-epsilon
    {
        epsilon = val;
    }
    public boolean equals (Cart2d W)    //equals method
    {
        //return ((x == W.x) && (y == W.y));
        return ((Math.abs ((x - W.x) / x) < epsilon)
                && (Math.abs ((y - W.y) / y) < epsilon));
    }
    public static boolean equals (Cart2d P, Cart2d Q)   //equals method
    {
        return ((Math.abs ((P.x - Q.x) / P.x) < epsilon)
                && (Math.abs ((P.y - Q.y) / P.y) < epsilon));
    }
    public static Cart2d perpendicular (Cart2d K, Cart2d P, Cart2d Q)   //perpendicular (used my own class called 'vector')
    {
        vector a = new vector (Q.x - K.x, Q.y - K.y, 0);
        vector b = new vector (P.x - K.x, P.y - K.y, 0);
        Cart2d o = new Cart2d ();
        Cart2d n = new Cart2d (P.x - K.x, P.y - K.y);
        double l = (a.dot (b)) / (o.distance (n));
        Cart2d m = Cart2d.ratio (K, P, l, (K.distance (P) - l));
        return (m);
    }
}
