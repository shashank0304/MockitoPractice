package com.ssangu.business;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ListTest {

	@Test
	public void letsMockListSizeMethod() {
		List<?> listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		
		assertEquals(2,listMock.size());
		assertEquals(2,listMock.size());
		assertEquals(2,listMock.size());
		
	}
	
	@Test
	public void letsMockListSizeWithMultipleReturnValues() {
		List<?> listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(10);
		
		assertEquals(2,listMock.size());
		assertEquals(10,listMock.size());
		
	}
	
	@Test
	public void letMockListGetMethod() {
		
		@SuppressWarnings("unchecked")
		List<String> listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Shashank");
		
		assertEquals("Shashank",listMock.get(0));
		assertNull(listMock.get(1));
	}
	
	@Test
	public void letsMockListGetMethod_AnyInt() {
		
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("Shashank");
		
		assertEquals("Shashank", listMock.get(1));;
	}
	
	@Test
	public void letsMockList_throwAnException() {
		
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
		
		Assertions.assertThrows(RuntimeException.class,()->listMock.get(0));
	}
	
	@Test
	public void letsMockList_MatchersWithHardCodedValue() {
		
		List listMock = mock(List.class);
		//when(listMock.subList(anyInt(), 5)).thenThrow(new RuntimeException("Testing Mockito with matchers with hardcoded value"));
		//Assertions.assertThrows(RuntimeException.class, ()->listMock.subList(0, 5));
	}
	
	@Test
	public void letMockListGetMethod_usingBDD() {
		
		@SuppressWarnings("unchecked")
		//Given
		List<String> listMock = mock(List.class);
		given(listMock.get(0)).willReturn("Shashank");
		
		//When
		String firstElement = listMock.get(0);
		
		//Then
		assertThat(firstElement, is("Shashank"));
	}
}
