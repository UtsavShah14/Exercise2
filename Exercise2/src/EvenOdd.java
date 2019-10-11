//Program to find the  number of evens in an array
public class EvenOdd {

	public static void main(String[] args) {
		
		int n=100;
		int array[] = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*100);
		}

//		for (int i = 0; i < array.length; i++) {  //To Check the running of initialized loop
//			System.out.println(array[i]);
//		}
		
//		Creating instances
		EvenOddSearch instance1 = new EvenOddSearch(array, 0, n/2);
		EvenOddSearch instance2 = new EvenOddSearch(array, n/2, n);
		
//		Start instances
		instance1.start();
		instance2.start();
		
//		Sync threads
		try{
			instance1.join();
			instance2.join();
		}
//		Search for an error
		catch(InterruptedException e) {
		}
		
		System.out.println("The Number of even numbers here are: "+ (instance1.getEvenCount() + instance2.getEvenCount()) );  //Check output
		
	}

}
