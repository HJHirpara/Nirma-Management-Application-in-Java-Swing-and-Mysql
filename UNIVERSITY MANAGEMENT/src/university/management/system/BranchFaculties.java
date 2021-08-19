package university.management.system;

import java.io.IOException;

public class BranchFaculties {
	BranchFaculties(){
		Runtime rt = Runtime.getRuntime();
		String url = "https://cse.nirmauni.ac.in/academics/people/faculty/";
		try {
			rt.exec("open " + url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
