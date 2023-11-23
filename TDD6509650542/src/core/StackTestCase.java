package core;

import junit.framework.TestCase;

public class StackTestCase extends TestCase
{
		//TC1
		public void testCreateNewEmptyStack()
		{
			Stack s = new Stack();
			assertTrue(s.isEmpty());
		}
		
		//TC2
		public void testPushElmToTop()
		{
			Stack s = new Stack();
			
			assertFalse(s.isFull());
			
			if (!s.isFull())
			{
				try
				{
					s.push(10);
				} 
				catch (Exception e)
				{
					e.getMessage();
				}
			}
			
			Object topElm = s.top();
			
			assertEquals(10,topElm);
		}
		
		//TC3
		public void testPushSameType()
		{
			Stack s = new Stack();
			try
			{
				s.push(1);
				s.push(2);
			}
			catch (Exception e)
			{
				fail("Did not expected an exception, but it was thrown.");
			}
		}
		
		public void testPushDifferentType()
		{
			Stack s = new Stack();
			try
			{
				s.push(1);
				s.push('c');
				fail("Expected an exception, but none was thrown.");
			}
			catch (Exception e)
			{
				assertEquals("All elements in the stack must be of the same type.",e.getMessage());
			}
		}
		
		//TC4
		public void testPop()
		{
			Stack s = new Stack();
			try
			{
				s.push(1);
				s.push(2);
				Object topElm = s.pop();
				assertEquals(2,topElm);
				assertEquals(1,s.top());
			}
			catch (Exception e)
			{
				fail("Did not expected an exception, but it was thrown.");
			}
		}
		
		//TC5
		public void testLimits()
		{
			Stack s = new Stack(2);
			try
			{
				s.push(1);
				s.push(2);
				s.push(3);
				fail("Expected an exception, but none was thrown.");
			}
			catch (Exception e)
			{
				assertEquals("Stack is full",e.getMessage());
			}
		}
}
