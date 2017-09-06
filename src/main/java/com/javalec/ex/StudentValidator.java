package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Student.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors error) {
		// TODO Auto-generated method stub
		Student student = (Student)obj;

		String name = student.getName();
		if(name.trim().isEmpty() || name == null) {
			System.out.println("이름 에러");
			error.rejectValue("name","trouble");
		}

		int id = student.getId();
		if(id == 0) {
			System.out.println("아이디 에러");
			error.rejectValue("id", "trouble");
		}

	}

}
