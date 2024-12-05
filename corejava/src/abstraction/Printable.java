package abstraction;

public interface Printable {
int a= 0;
void print();
public static void demo11() {
	System.out.println("static method from the interface");
}
default void demo() {
	System.out.println("default method from the interface");
}

}
