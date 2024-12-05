package ToStringMethod;

public class MainMydate {
public static void main(String[] argu) {
	Mydate d1=new Mydate();
	Mydate d2= new Mydate (18,12,2001);
	System.out.println("before swaping");
	System.out.println(d1);
	System.out.println(d2);
	
	System.out.println("==========================");
	MainMydate.swap(d1,d2);

}  


    public static void swap(Mydate dd1,Mydate dd2) {
    	Mydate temp = dd1;
    	dd1 = dd2;
    	dd2 = temp;
    	
    	
    	System.out.println("After swaping");
    	System.out.println(dd1);
    	System.out.println(dd2);
    }

}
