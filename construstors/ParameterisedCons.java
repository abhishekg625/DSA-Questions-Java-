package construstors;
class Boxx{
	double height;
	double length;
	double bredth;
	Boxx(double h, double b, double l)
	{
		height =h;
		bredth =b;
		length=l;
		}
	double volume(){
		return height*length*bredth;
	}
}
public class ParameterisedCons {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Boxx b1 = new Boxx(10,10,10);
	Boxx b2 = new Boxx(20,20,20);
	double vol;
	vol=b1.volume();
	System.out.println(vol);
	vol=b2.volume();
	System.out.println(vol);
	

	}

}
