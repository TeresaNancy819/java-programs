package Day10.maven;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
 @Autowired
 Address add;

public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}
 void displaymsg2() {
	 add.displayAddress();
 }
 
}
