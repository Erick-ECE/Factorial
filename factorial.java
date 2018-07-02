class factorial {
	// just for the class example;
	//for a general factorial-metoth use big-integer
	public static int fact(int n){
		int r=	(n == 0) ? 1 : fact(n-1) * n;
		return r;
		}

	public static void main(String[] args) {
		System.out.println(fact(1000000));
	}
}