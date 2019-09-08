
 	import static java.lang.System.*;
public class PrimeCount{

	public static void main(String[] args) {
	    int step=0;
		for (int n=10000;n<=100000;n=n+10000){
			int prime=0;
			
			for(int i=2;i<=n;i++){
				
              boolean isPrime=true;
				for(int j=2;j<i/2;j++){
					if(i%j==0){
						isPrime=false;
					}
					 else continue;
				}
				if( isPrime==true){ prime=prime+1;
				continue;
			}else continue;
			}
			
				step=step+1;
				System.out.println("We are on Step:"+step);
				System.out.println("Number of Primes upto"+n+":"+prime);
				
				System.out.println("nanoseconds"+System.nanoTime());
		}
	}
}

