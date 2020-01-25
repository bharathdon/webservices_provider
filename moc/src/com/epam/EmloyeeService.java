package com.epam;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path(value = "/abc")
public class EmloyeeService {

	/*
	 * @GET public String name() { return "hi jersey!";
	 * 
	 * }
	 */

	@GET
	@Produces(value = {"application/json","application/xml"})
	public List<Employee> find() {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "abc", 500d));
		list.add(new Employee(10, "abcdef", 555d));
		return list;

	}

	@GET
	@Produces(value = { "application/json", "application/xml" })
	@Path(value = "{eno}/{name}/{salary}")
	public Employee findEmployeeById(@PathParam(value = "eno") int eno, @PathParam(value = "name") String name,
			@PathParam(value = "salary") Double salary) {
		System.out.println("eno is" + eno);
		System.out.println("name is" + name);

		return new Employee(eno, name, salary);

	}
	
	
	@POST
	@Consumes(value = "application/json")
	public int save(Employee employee) {
		System.out.println(employee.getName());
		return 5;
		
	}
	
}
