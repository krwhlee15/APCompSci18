public class Colored2d extends Cart2d //child class
{
    private String color = "red";
    public Colored2d ()
    {
        super(); // Can be omitted, but there must be No-argument constructor in super
        color = "green";
    }
    public Colored2d (double xx, double yy, String cc)
    {
        super(xx,yy);
        color = cc; 
    }
    public void setColor (String SomeColor)
    {
        color = SomeColor;
    }
    public String getColor()
    {
        return(color);
    }
}   
