package unknown;

public class demo
{
	public static void main(String[] args) {
		int no=545;
	    int ld=0;
	    int temp=no;
	    int rev=0;
	    while(no>0)
	    {
	    	ld=no%10;
	    	rev=rev*10+ld;
	    	no/=10;
	    }
	    if(temp==rev)
	    {
	    	System.out.println("palindrome");
	    }
	    else
	    {
	    	System.out.println("its not");
	    }
	    	
		
	}

}
