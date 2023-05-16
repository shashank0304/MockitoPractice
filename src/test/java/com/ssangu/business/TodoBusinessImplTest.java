package com.ssangu.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.ssangu.data.api.TodoService;
import com.ssangu.data.api.TodoServiceStub;

public class TodoBusinessImplTest {
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}
}

