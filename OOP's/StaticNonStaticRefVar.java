class College {
	String collegeName;
	String collegeType;
	College(String collegeName, String collegeType) {
		this.collegeName = collegeName;
		this.collegeType = collegeType;
	}
	void CollegeDetails(){
		System.out.println("College Name: "+this.collegeName);
		System.out.println("College type: "+this.collegeType);
	}
}

class Students {
	String studentName;
	String branch;
	static College col;
	// College col; //None Static refrence var

	Students(String name, String branch) {
		this.studentName = name;
		this.branch = branch;
	}

	void studentDetails() {
		System.out.println("Student Name: "+this.studentName);
		System.out.println("Branch: "+this.branch);
		col.CollegeDetails();
	}
}



class StaticNonStaticRefVar {
    public static void main(String[] args) {
		Students.col = new College("Kitps", "IT");
    	Students st = new Students("faisal","CSE");
    	// st.col = new College("KITPS", "ENGG.");
    	st.studentDetails();
    }
}