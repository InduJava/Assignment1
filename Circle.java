package Assignment1;
public class Circle {
	int radius;
	float diameter;
 public Circle(int radius,float diameter)
 {
    this.radius=radius;
    this.diameter=diameter;
 }

 public void calculateArea(int radius)
 {
	 double area =Math.PI*radius*radius;
	 System.out.println("Area of circle is:"+area);
 }
 public void calculateArea(float diameter)
 {
	 double area=Math.PI*diameter;
	 System.out.println("Area of circle is:"+area);
 }
public void calculatePerimeter(int radius)
{
	double perimeter=2*Math.PI*radius;
	System.out.println("Perimeter of circle is:"+perimeter);

}
public void calculatePerimeter(float diameter)
{
	double perimeter=Math.PI*diameter;
	System.out.println("Perimeter of circle is:"+perimeter);

	
}
}
