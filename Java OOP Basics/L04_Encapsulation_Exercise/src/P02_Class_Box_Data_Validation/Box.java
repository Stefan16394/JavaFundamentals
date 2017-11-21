package P02_Class_Box_Data_Validation;

public class Box {
   private double length;
   private double width;
   private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public void setLength(double length) {
        if (length>0)
        {
            this.length = length;
        }
        else
            throw new IllegalArgumentException("Length cannot be zero or negative.");

    }

    public void setWidth(double width) {
        if (width>0)
        {
            this.width = width;
        }
        else
            throw new IllegalArgumentException("Width cannot be zero or negative.");
    }

    public void setHeight(double height) {
        if (height>0)
        {
            this.height = height;
        }
        else
            throw new IllegalArgumentException("Height cannot be zero or negative.");
    }

    public double volume()
    {
        return this.length* this.height* this.width;
    }

    public double lateralSurfaceArea()
    {
        return 2*this.length*this.height+2*this.width*this.height;
    }

    public double surfaceArea()
    {
        return 2*this.length*this.width+2*this.length*this.height+2*this.width*this.height;

    }
}
