package com.cj.coln;

public class Students implements Comparable {
		private int id;
		private String name;
		private String dept;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
		
		public String toString() {
			return "Student["+this.id+","+this.name+","+this.dept+"]";
		}
		
		public int hashCode() {
		
		return this.id;
		}
		
		
		public boolean equals(Object obj) {
		Students st = (Students) obj;
		return this.id == st.id; 
		}
		
		public int compareTo(Object o) {
		Students st = (Students) o;
		return this.id - st.id;
		}
}
