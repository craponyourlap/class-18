interface Drawable{
	public void draw();
}
public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		//without lambda
		Drawable d = new Drawable() {
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("Drawing "+width);
			}
		};
		//with lambda
		Drawable d2 = () -> System.out.println("Drawing (with lambda) "+width);
		d.draw();
		d2.draw();
	}

}
