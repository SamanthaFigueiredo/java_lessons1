
import java.util.function.*;

@FunctionalInterface
public interface MyInterface{

	public String MyMethod();


public static void main(String[]args){
	Supplier<String> stringSupplier=()->{
		return "I am a supplier";
	};

	Supplier<Integer> IntegerSupplier=()->{
		return 100;
	};

	System.out.println(stringSupplier.get());
	System.out.println(IntegerSupplier.get());


	IntSupplier inPrimitiveSupplier=()->47;
		
	System.out.println(inPrimitiveSupplier.getAsInt());


	Consumer<String> stringConsumer =x->System.out.println(x);
	stringConsumer.accept("I am a consumer");

	Consumer<Integer> integerConsumer =x->System.out.println(x);
	integerConsumer.accept(35);

	IntConsumer intPrimitiveConsumer  = x -> System.out.println(x);
	intPrimitiveConsumer.accept(94);

	Predicate<String> stringColorTester =(x)->x.equals("Blue");
		
	System.out.println(stringColorTester.test("Brown"));


	Function<String,Integer> lengthFinderFunction = (x)->x.length();
	System.out.println(lengthFinderFunction.apply("FunctionLength"));
}


}



