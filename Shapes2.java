class TwoDShape
{
	private double width;
	private double height;
	
	double getWidth() { return width;}
	double getHeight() { return height;}
	void getWidth(double w) { width = w; }
	void getHeight(double h) { height = h; }
	
	void showDim()
	{
		System.out.println("Width and hight are " +
							width + " and " + height);
	}
}

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape
{
	private String style;
	
	// Constructor
	Triangle(String s, double w, double h)
	{
		setWidth(w);
		setHeight(h);
		
		style = s;
	}
	double area()
	{
		return getWidth() * getHeight()/2;
	}
	
	void showStyle()
	{
		System.out.println("Triangle is " + style);
	}
}

class Shapes2
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle("filled", 4.0, 4.0);
		Triangle t2 = new Triangle("outlined", 8.0, 12.0);
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
	}
}