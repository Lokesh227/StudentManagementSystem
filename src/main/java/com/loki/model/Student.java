package com.loki.model;

public class Student {
	    private  String rollNo;
		private  String name;
		private  String email;
		private  String phone;
		private  String department;
		public String getRollNo() {
			return rollNo;
		}
		public void setRollNo(String rollNo) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", phone=" + phone
					+ ", department=" + department + "]";
		}
		
		
		
}
