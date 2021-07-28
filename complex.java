public class complex
{
	private double x;
	private double y;
	private static double epsilon = 1.0e-3;

	public complex(double xx, double yy)
	{
		x = xx;
		y = yy;
	}

	public complex () //"no argument" Constructor
	{
		x = 0;
		y = 0;
	}

	public double getR()
	{
		return(x);
	}
	
	public double geti()
	{
		return(y);
	}

	public void setR(double xx)
	{
		x = xx;
	}
	
	public void seti(double yy)
	{
		y = yy;
	}

	public complex(complex W) // copy constructor
	{
		x = W.x;
		y = W.y;
	}

	public static void setepsilon (double val) // epsilon
	{
		epsilon = val;
	}

	public boolean equals (Object W) //equals method
	{
		if(W.getClass() != this.getClass())
		{
			return(false);
		}
		else
		{
			complex Z = (complex)W;

			if(Math.abs((x - Z.x)/x) < epsilon && Math.abs((y - Z.y)/y) < epsilon)
			{
				return(true);
			}
			else
			{
				return(false);
			}
		}
	}

	public String toString() // toString method
	{
		String retStr="";
		retStr += "(" + x + ", " + y + ")";
		return(retStr);
	}
	
	public complex add(complex W) //adder
	{
		double xa = x + W.x;
		double ya = y + W.y;
		complex add = new complex(xa, ya);
		return (add);
	}
	
	public static complex add(complex W1, complex W2) //adder2
	{
		return(new complex ((W1.x + W2.x), (W1.y + W2.y)));
	}

	public complex mult(complex W) //multiplier
	{
		double xm = (x*W.x)-(y*W.y);
		double ym = (x*W.y)+(y*W.x);
		complex mult = new complex(xm, ym);
		return (mult);
	}

	public static complex mult(complex W1, complex W2) //multiplier2
	{
		return(new complex ((W1.x*W2.x)-(W1.y*W2.y), (W1.x*W2.y)+(W1.y*W2.x)));
	}

	public static complex conjugate(complex W)
	{
		return(new complex (W.x, (-1)*W.y));
	}

	public complex conjugate()
	{
		return(new complex (x, (-1)*y));
	}

	public complex divide(complex W)
	{
		double xd = ((x*W.x)+(y*W.y))/((W.x*W.x)+(W.y*W.y));
		double yd = ((y*W.x)-(x*W.y))/((W.x*W.x)+(W.y*W.y));
		complex divide = new complex(xd, yd);
		return (divide);
	}
	
	public static divide(complex P, complex Q)
	{
		double xd = ((P.x*Q.x)+(P.y*Q.y))/((P.x*Q.x)+(P.y*Q.y));
		double yd = ((P.y*Q.x)-(P.x*Q.y))/((P.x*Q.x)+(P.y*Q.y));
		complex divide = new complex(xd, yd);
		return (divide);
	}
 
	public static complex magnitude(complex W)
	{
		return(Math.sqrt((W.x*W.x)+(W.y*W.y)));
	}

	public double magnitude() //magnitude
	{
		return(Math.sqrt((x*x)+(y*y));
	}
}
