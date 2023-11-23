package core;

public interface Istack
{
	int getSize() ;
	boolean isEmpty();
	boolean isFull();
	void push(Object elm) throws Exception;
	Object top();
	Object pop() throws Exception;
}
