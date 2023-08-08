class Box{
	double width;
	double height;
	double depth;

	double volume(){
	return width*height*depth;
	}
}
class Demo1{
	public static void main(String[] args){
		Box mybox1= new Box();
		Box mybox2= new Box();
		mybox1.width=10;
		mybox1.height=15;
		mybox1.depth=20;
		System.out.println("The volume is " +mybox1.volume());
		mybox2.width=3;
		mybox2.height=6;
		mybox2.depth=9;
		System.out.println("The volume is " +mybox2.volume());
	}
}