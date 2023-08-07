class Box{
	
	double volume(double width,double height,double depth){
	return width*height*depth;
	}
}

class Demo2{
	public static void main(String[] args){
		Box mybox1= new Box();
		Box mybox2= new Box();
		System.out.println("The Volume is " +mybox1.volume(10,15,20));
		System.out.println("The Volume is " +mybox2.volume(3,6,9));
	}
}