package Comparator;

public class Student {
private int studid;
private String studName;
private double studMark; 


public Student(int studid, String studName, double studMark ) {
	super();
	this.studid=studid;
	this.studName=studName;
	this.studMark=studMark;
}


public int getStudid() {
	return studid;
}


public void setStudid(int studid) {
	this.studid = studid;
}


public String getStudName() {
	return studName;
}


public void setStudName(String studName) {
	this.studName = studName;
}


public double getStudMark() {
	return studMark;
}


public void setStudMark(double studMark) {
	this.studMark = studMark;
}


@Override
public String toString() {
	return "Student [studid=" + studid + ", studName=" + studName + ", studMark=" + studMark + "]";
}


	
}

