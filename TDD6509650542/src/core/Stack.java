package core;

import java.util.ArrayList;
import java.util.List;

public class Stack implements Istack
{
	
	private static final int DEFAULT_MAX_SIZE = 5;
	private List<Object> elements;
	private int maxSize;
	
	public Stack() 
	{
		this(DEFAULT_MAX_SIZE);
	}
	public Stack(int maxSize) 
	{
		this.maxSize = maxSize;
		this.elements = new ArrayList<>();
	}
	@Override
	public int getSize()
	{
		return elements.size();
	}

	@Override
	public boolean isEmpty()
	{
		return 0 == elements.size();
	}

	@Override
	public boolean isFull()
	{
		return elements.size() == maxSize;
	}

	@Override
	public void push(Object elm) throws Exception
	{
		if (!isFull())
		{
			if(isEmpty() || elements.get(elements.size()-1).getClass().equals(elm.getClass()))
			{
				elements.add(elm);
			}
			else
			{
				throw new Exception("All elements in the stack must be of the same type.");
			}
		}
		else
		{
			throw new Exception("Stack is full");
		}
	}

	@Override
	public Object top()
	{
		return elements.get(getSize()-1);
	}
	
	@Override
	public Object pop() throws Exception
	{
		if(!isEmpty())
		{
			Object top = elements.get(getSize()-1);
			elements.remove(getSize()-1);
			return top;
		}
		else
		{
			throw new Exception("Stack is empty");
		}	
	}
}
