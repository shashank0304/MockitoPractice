package com.ssangu.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ssangu.data.api.TodoService;

public class TodoBusinessImplMock {
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(Arrays.asList("Learn Spring","Learn to eat","Learn Spring MVC"));
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_withEmptyList() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(Arrays.asList());
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(0, filteredTodos.size());
	}
}

