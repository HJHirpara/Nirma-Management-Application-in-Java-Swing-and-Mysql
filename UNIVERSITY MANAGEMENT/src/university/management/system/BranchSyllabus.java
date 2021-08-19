package university.management.system;

import java.io.IOException;

public class BranchSyllabus {
	BranchSyllabus(){
		Runtime rt = Runtime.getRuntime();
		String url = "https://cse.nirmauni.ac.in/academics/programmes/curriculum/";
		try {
			rt.exec("open " + url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
