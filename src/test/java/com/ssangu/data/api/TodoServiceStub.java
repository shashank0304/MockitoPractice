package com.ssangu.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	@Override
	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring","Learn to eat","Learn Spring MVC");
	}

}
