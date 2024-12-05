package innerclass;

public class MainAcc {
public static void main(String[] arug) {
	bankOuter b= new bankOuter();
	b.print();
	
	bankOuter.LockerInner l =b.new LockerInner();
	l.printinfo();
}
}
