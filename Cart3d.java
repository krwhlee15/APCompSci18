public class Cart3d extends Cart2d
{
    double z;

    public Cart3d (double xx, double yy, double zz)
    {
        super (xx, yy);
        z = zz;
    }
    public Cart3d ()
    {
        super ();
        z = 0.0;
    }
    public Cart3d (Cart3d W)
    {
        x = W.x;
        y = W.y;
        z = W.z;
    }
    public void setZ (double zz)
    {
        z = zz;
    }
    public double getZ ()
    {
        return (z);
    }
    public static double getZ (Cart3d W)
    {
        return (W.z);
    }
    public Cart3d (double val)
    {
        x = val;
        y = 0;
        z = 0;
    }
    public Cart3d (double val1, double val2)
    {
        x = val1;
        y = val2;
        z = 0;
    }
    public String toString ()
    {
        return ("(" + String.format ("%.3f", x) + "," +
                String.format ("%.3f", y) + "," + String.format ("%.3f",
                                                                 z) + ")");
    }
    public static Cart3d midpoint (Cart3d W1, Cart3d W2)
    {
        return (new
                Cart3d ((W1.x + W2.x) / 2, (W1.y + W2.y) / 2,
                        (W1.z + W2.z) / 2));
    }
    public Cart3d midpoint (Cart3d W)
    {
        double xm = (x + W.x) / 2.0;
        double ym = (y + W.y) / 2.0;
        double zm = (z + W.z) / 2.0;
        Cart3d midpoint = new Cart3d (xm, ym, zm);
        return (midpoint);
    }
    public static double distance (Cart3d P, Cart3d Q)
    {
        return (Math.sqrt
                ((P.x - Q.x) * (P.x - Q.x) + (P.y - Q.y) * (P.y - Q.y) +
                 (P.z - Q.z) * (P.z - Q.z)));
    }
    public double distance (Cart3d W)
    {
        return (Math.sqrt ((x - W.x) * (x - W.x) + (y - W.y) * (y - W.y) +
                           (z - W.z) * (z - W.z)));
    }
    public static double triangle (Cart3d[]x)
    {
        double a = x[0].distance (x[1]);
        double b = x[1].distance (x[2]);
        double c = x[2].distance (x[0]);
        double s = (a + b + c) / 2;
        return (Math.sqrt (s * (s - a) * (s - b) * (s - c)));
    }
    public boolean equals (Cart3d W)
    {
        return ((Math.abs ((x - W.x) / x) < epsilon)
                && (Math.abs ((y - W.y) / y) < epsilon)
                && (Math.abs ((z - W.z) / z) < epsilon));
    }
    public static boolean equals (Cart3d P, Cart3d Q)
    {
        return ((Math.abs ((P.x - Q.x) / P.x) < epsilon)
                && (Math.abs ((P.y - Q.y) / P.y) < epsilon)
                && (Math.abs ((P.z - Q.z) / P.z)) < epsilon);
    }
    public static Cart3d ratio (Cart3d P, Cart3d Q, double m, double n)
    {
        return (new
                Cart3d ((m * Q.x + n * P.x) / (m + n),
                        (m * Q.y + n * P.y) / (m + n),
                        (m * Q.z + n * P.z) / (m + n)));
    }
    public Cart3d ratio (Cart3d W, double m, double n)
    {
        return (new
                Cart3d ((m * W.x + n * x) / (m + n),
                        (m * W.y + n * y) / (m + n),
                        (m * W.z + n * z) / (m + n)));
    }
    public static Cart3d perpendicular (Cart3d K, Cart3d P, Cart3d Q)
    {
        vector a = new vector (Q.x - K.x, Q.y - K.y, Q.z - K.z);
        vector b = new vector (P.x - K.x, P.y - K.y, P.z - K.z);
        Cart3d o = new Cart3d ();
        Cart3d n = new Cart3d (P.x - K.x, P.y - K.y, P.z - K.z);
        double l = (a.dot (b)) / (o.distance (n));
        Cart3d m = Cart3d.ratio (K, P, l, (K.distance (P) - l));
        return (m);
    }
}
