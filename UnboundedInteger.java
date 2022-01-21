//==================================================INSTRUCTIONS=============================================================================
    //allows an unbounded ineteger to be represented by a linked list
    //design an algorithm to perform a recursive add (called add)
    //add(int unboudedInt1, int unboundedInt2) <----Returns a reference to their sum
    //^must work on positives and negatives
//==================================================NODE=====================================================================================
/*
Maxime Sotsky 0270251
Data structures I
Assignment 1 pt 2
*/
import java.util.*;
import java.lang.*;
import java.lang.Character.UnicodeBlock;
public class UnboundedInteger<T extends Number> {
	private int length;
    private Node<T> head;

    private static class Node<T> 
    {
		private T data;
		private Node<T> next;
        

		public Node(T info){
			this.data = info;
			this.next = null;
		}
		
		public Node (T info, Node<T> next){
			this.data = info;
			this.next = next;
		}
		
		public T getData(){
			return this.data;
		}
		
		public void setData(T info){
			this.data = info;
		}
		
		public Node<T> getNext(){
			return this.next;
		}
		
		public void setNext(Node<T> node){
			this.next = node; 
		}

	}

	public UnboundedInteger(){
		length = 0;
		head = null;
	}
	
	public int getLength(){
		return length;
	}
	public void add(T data){
		
		if (head == null){
			head = new Node<T>(data);
			length++;
			return;
		}
		Node<T> temp = new Node<T>(data);
		Node<T> current =  head;
		
		while (current.getNext() != null){
			Node<T> next = current.getNext();
			current = next;
		}

		current.setNext(temp);
		length++;
	}
	public boolean isEmpty(){
		return head ==null;
	}

	public T remove(){
		if (isEmpty()) {
			return null;
		}
		else{
			T element = head.getData();
			head = head.getNext();
			return element;
		}
	}
	
	public T getNext(){
		if (isEmpty()) {
			return null;
		}
		else{
			T element = head.getData();
		return element;
		}

	}
	
	public void insert(T data){

		insertNth(length, data);
    }
    

	public void insertNth(int index, T data){
		Node<T> newNode = new Node<T>(data);
		Node<T> current = head;

		if (isEmpty()){
			head = newNode;
			return;
		}
		if ((index<=0) || (index >length)){
			System.out.println("Should throw an exception here: trying to insert beyond end of list; instead just add to end of list");
			return;
		}
		for (int i=1; i<index-1; i++){
			current = (Node<T>) current.getNext();
		}
		newNode.setNext(current.getNext());
		current.setNext(newNode);
		

	}
	
	public String toString() {
		String output = "";
 
		if (head != null) {
			Node<T> current = head;
			while (current != null) {
				output += "[" + current.getData().toString() + "]";
				current = current.getNext();
			}
 
		}
		return output;
	}

	public static UnboundedInteger rep(String num)
	{
		int i = 0;
		UnboundedInteger<Integer> myList = new UnboundedInteger<>();
		if (num.charAt(0) == '-')
		{
			i = 1;
		}
		for(; i != num.length(); i++)
		{
			myList.insertFront(Character.getNumericValue(num.charAt(i)));
			//System.out.println(myList);
		}
		if (num.charAt(0) == '-'){
			myList.insertFront(-1);
		}
		else{
			myList.insertFront(1);
		}
		return myList;
	}
	//old 
    public static UnboundedInteger represent (int num)
    {
        UnboundedInteger<Integer> myList = new UnboundedInteger<>();
        String strNum = Integer.toString(num);
        char[] charElements = strNum.toCharArray();
        int numDigits = charElements.length;
        Integer[] intElements = new Integer[numDigits];
        for(int i = 0; i <= numDigits -1; i++)
        {
            intElements[i] = new Integer(Character.getNumericValue(charElements[i]));
        }
        int j = numDigits-1;
        if (num < 0)
        {
            numDigits -= 1;
        }
        for(int i = 1; i <= numDigits; i++)
        {
            if (num == 0)
            {
                myList.insertNth(1,1);
                return myList;
            }
            if ((j == numDigits-1) && (num >=0)){
                myList.insertNth(1,1);
            }
            if((j == numDigits) && (num < 0)){
                myList.insertNth(1,-1);
            }
            myList.add(intElements[j]);
            j--;
            
        }
        return myList;
    
    }

    public T getDataAtIndex(int index)//taken from: textBook
    {
        if(index < 0 || index >= length){
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<T> node = getNode(index);
        return node.data;
    }

    public Node<T> getNode(int index){//taken from: textbook
        Node<T> node = head;
        for(int i = 0; i < index && node != null; i++)
        {
            node = node.next;
        }
        return node;
    }
    public void insertFront(T obj) { //taken from: Slist in class activity
        head = new Node(obj, head);
        length++;
      }

}