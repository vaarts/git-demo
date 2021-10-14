package com.example.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSteps {
	User user = new User();
//	"([^"]*)" 
	@Given("^that the user \"([^\"]*)\" is given a task to clear Java Certification exam$")
	public void that_the_user_vipul_is_given_a_task_to_clear_java_certification_exam(String name){
		user.setName(name);
		user.setCertification("Java");
	}
	
	@When("\"([^\"]*)\" got {int} marks in exam")
	public void vipul_got_marks_in_exam(String name,Integer marks){
		user.setName(name);
		user.setMarks(marks);
	}
	
	@Then("^Vipul is Java Certified$")
	public void vipul_is_java_certified() {
        assertThat(user.getResult(), is(true));
	}
}
