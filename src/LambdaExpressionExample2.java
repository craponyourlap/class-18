interface Sayable{
	public String say(String name);
}
public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lambda expression with single parameter
		Sayable s1 = name -> "Hello, "+name;
		//return  is actually implied so u dont have to type return;
		//you can remove the parenthesises if you only have one parameter
		System.out.println(s1.say("Sonoo"));
		Sayable s2 = (name) -> {//equivalent to s1
			return "Hello, "+name;
		};
		System.out.println(s2.say("Sonoo"));
	}

}
