package recation;

public class q1_9 {
static int f (int n ) {
		if (n==1)
			return 1;
		return n+f(n-1);
	}

static int f2 (int n ) {
		if (n==1)
			return 1;
		return n*f2(n-1);
	}

static int f3 (int n ) {
	if (n%2==1) {
		if (n<=1)
			return 1;
		return n*f3(n-2);
	}
	n=n-1;
	if (n<=1)
		return 1;
	return n*f3(n-2);

}

public static int f4(int n) {
	if (n<10) 
		return 1;
	else 
		return 1+f4(n/10);
}

public static int f5(int a, int b) {
	if (a<b)
		return 1;
	else 
		return f5(a-b,b)+1;
}

public static int f6 (int a,int b ) {
	if (a<b)
		return a;
	else 
		return f6(a-b,b);
}

public static boolean f7(int a,int b) {
	if (a<b)
		return false;
	if (a==0)
		return true;
	return f7(a-b,b);
}

public static boolean f8(int a,int b) {
	if (b==1)
		return true;
	if (a%b==0)
		return false;
	return f8(a,b-1);
}

public static boolean f9(int n) {
	if (n%2==0) {
		return f9double(n);
	}
	else 
		return f9odd(n);
}
public static boolean f9double(int n) {
	if (n%2==1)
		return false;
	if (n==0||n==2 ||n==4 ||n==6 ||n==8)
		return true;
	return f9double(n/10);
}
public static boolean f9odd(int n) {
	if (n%2==0)
		return false;
	if (n==1 ||n==3 ||n==5 ||n==7)
		return true;
	return f9odd(n/10);
}

}
