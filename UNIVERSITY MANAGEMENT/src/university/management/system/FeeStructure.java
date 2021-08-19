package university.management.system;

import java.io.IOException;

import javax.swing.JFrame;

public class FeeStructure extends JFrame{
	FeeStructure(){
		Runtime rt = Runtime.getRuntime();
		String url = "https://collegedunia.com/university/25503-nirma-university-nu-ahmedabad/courses-fees";
		try {
			rt.exec("open " + url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
