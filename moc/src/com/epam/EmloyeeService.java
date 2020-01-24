package com.epam;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path(value = "/abc")
public class EmloyeeService {
	/*
	 * @GET public String name() { return "hi jersey!";
	 * 
	 * }
	 */
	@GET
	@Produces(value = "application/json")
	public List<Employee> find(){
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"abc",500d));
		list.add(new Employee(10, "abcdef", 555d));
		return list;
		
	}
}
