//in this program we can see that the constructor box initializes the objects at once the,
// remaining objects takes their value. 
//This is default Constructor

package construstors;
class Box{
	double height;
	double bredth;
	double length;
	Box()
	{
		height =10;
		 bredth =10;
		length=10;
		
	}
	double volume()
	{
		return height*bredth*length;
	}
}

public class defaultCon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		Box b2= new Box();
		double vol;
		
		vol= b1.volume();
		System.out.println("volume of 1st box =" +vol);
		vol = b2.volume();
		System.out.println("volume of 2ns box =" +vol);

	}

}
