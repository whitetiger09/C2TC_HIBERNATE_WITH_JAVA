package com.tns.si;



import javax.persistence.*;

@Entity
@Table(name="mgr_store")
public class Manager extends Employe {

 private static final long serialVersionUID = 1L;
	
 private String departmentName;

 //getter and setter
 public String getDepartmentName() {
  return departmentName;
 }

 public void setDepartmentName(String departmentName) {
  this.departmentName = departmentName;
 }
}
