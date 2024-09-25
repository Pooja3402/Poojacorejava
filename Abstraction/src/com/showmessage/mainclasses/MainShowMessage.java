package com.showmessage.mainclasses;
import com.showmessge.interfaces.ShowMessage; 
public class MainShowMessage {

	public static void main(String[] args) {
		ShowMessage message = ()->{System.out.println("Hello");
		System.out.println("Hii.");
		};
		message.displayMessage();

	}

}
