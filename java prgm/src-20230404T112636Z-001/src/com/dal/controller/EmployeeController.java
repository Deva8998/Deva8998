package com.dal.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dal.model.Employee;

public class EmployeeController implements EmployeeInterface {
	Employee emp;
	List emplist = new ArrayList();
	
	public void addEmployee()
	{		
		emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid");
		int eid= sc.nextInt();
		emp.setEid(eid);
		
		System.out.println("Enter Ename");
		String ename= sc.next();
		emp.setEname(ename);
		emplist.add(emp);
		System.out.println("Employee Added Succesfully");
	}
	
	public void viewEmployee() {
		//System.out.println(emp);
		Iterator i = emplist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
