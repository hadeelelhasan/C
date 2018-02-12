package calcu;
//import controller;
//import modol;
import javax.swing.*;
public class MVC {

	public static void main(String[] args) {
		
		View v=new View();
		modol m=new modol();
		controller cont =new controller(v,m);
        v.setVisible(true);
	}

}
