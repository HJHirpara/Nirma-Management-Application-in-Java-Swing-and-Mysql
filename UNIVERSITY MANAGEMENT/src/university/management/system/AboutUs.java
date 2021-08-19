package university.management.system;

import java.io.IOException;


public class AboutUs {
	AboutUs(){
		Runtime rt = Runtime.getRuntime();
		String url = "https://nirmauni.ac.in/";
		try {
			rt.exec("open " + url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
