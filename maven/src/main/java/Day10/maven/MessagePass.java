package Day10.maven;

import org.springframework.beans.factory.annotation.Autowired;

public class MessagePass {
	@Autowired
	MyMessage msg;

	public MyMessage getMsg() {
		return msg;
	}

	public void setMsg(MyMessage msg) {
		this.msg = msg;
	}
	void displaymsg()
	{
		msg.display();
	}

}
