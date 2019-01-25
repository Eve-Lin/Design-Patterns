package builder;

public class LunchOrderDemo {
	
	public static void main(String [] args) {
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder.bread("wheat").condiments("lettuce").dressing("mustard").meat("ham");
		
		LunchOrder lunchorder = builder.build();
		
		System.out.println(lunchorder.getBread());
		System.out.println(lunchorder.getCondiments());
		System.out.println(lunchorder.getDressing());
		System.out.println(lunchorder.getMeat());
		
	
	}

}
