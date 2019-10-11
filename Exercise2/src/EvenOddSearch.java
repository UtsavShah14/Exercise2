
public class EvenOddSearch extends Thread{

	int f[],lb,ub;
	int count=0;
	
	EvenOddSearch(int f1[], int a, int b){
		f=f1;
		lb=a;
		ub=b;
	}
	
	public void run() {
		for (int i = lb; i < ub; i++) {
			if(f[i]%2==0){
				count++;
				System.out.println("<--- Even--" + i);
			}
		}
	}
	
//	Create a return function as you cannot return w/o it.
	int getEvenCount() {
		return count;
	}
}
