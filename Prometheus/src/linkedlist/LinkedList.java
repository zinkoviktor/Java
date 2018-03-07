package linkedlist;

class Node{
	private Node next;
	private Integer data;
	
	public Node() {
	}

	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
}


public class LinkedList {
	Node first = null;
	public LinkedList() {		
		
	}

	public void add(Integer data) {
		
        if(first==null) {
        	first = new Node();
        	first.setData(data);
        	first.setNext(null);
        	return;
        } else {
        	Node newLink = first;
        	if(newLink.getNext()==null) {
        	   	Node newNode = new Node();
        		newNode.setData(data);
        		newNode.setNext(null);
        		newLink.setNext(newNode);        		
        		return;
        	}else {
        		while(newLink.getNext()!=null) {
        			newLink=newLink.getNext();
        			if(newLink.getNext()==null) {
        				Node newNode = new Node();
                		newNode.setData(data);
                		newNode.setNext(null);
                		newLink.setNext(newNode);                		
                		return;	
        			}
        		};
        		
        	}
        		
        	
        }
        	
        
	}

	public Integer get(int index) {
		Node current = first;
		int b = 0;
		while(current!=null) {
			if(b==index) {			
			return current.getData();
			}
			current = current.getNext();
			b++;
		}		
		return null;
	}

	public boolean delete(int index) {
		Node current = first;
		Node previous = first;
		int b = 1;
		if(index==0) {
					current=first.getNext();
					first=current;	
					return true;
		}
		while(current.getNext()!=null) {
			previous = current;
			current = current.getNext();
			if(b==index) {			
			previous.setNext(current.getNext());
			return true;
			}
			b++;
		}		
		return false;
	}

	public int size() {
		Node current = first;
		int b = 0;
		while(current!=null) {
			b++;
			current = current.getNext();
		}		
		return b;
	}
	
	public static void main(String[] args) {
		LinkedList hello = new LinkedList();
		hello.add(2);
		hello.add(3);
		System.out.println("size - " + hello.size());
	}
}
