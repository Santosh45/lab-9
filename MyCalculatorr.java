class MyCalculatorr{
	static long power(int n, int p){
		if(n==0 && p==0){
			throw new ArithmeticException("n and p can't be zero");
		}
		if(n<0 || p<0){
			throw new ArithmeticException("n and p can't be nagtive");
		}
		int m=n;
		for(int i=1; i<p; i++){
          p= m*m*n;			
		}
	return p;	
	}
	public static void main(String[] args){
		MyCalculatorr ob=new MyCalculatorr();
		System.out.println("The power of p is:"+ob.power(4,2));
	}
}