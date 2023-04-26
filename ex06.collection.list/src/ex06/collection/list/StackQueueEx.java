package ex06.collection.list;
import java.util.*;

class StackQueueEx
{
	public static void main(String[] args) 
	{
		Stack st = new Stack();
		// LinkedList�� Queue�������̽��� �����Ͽ���.
		Queue q = new LinkedList();	//
		
		st.push("0");  //������ �Է� 
		st.push("1");
		st.push("2");

		q.offer("0");   //������ �Է�
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) {  // 
			System.out.println(st.pop());  // ������ ��� - LIFO
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());  // FIFO
		}
	}
}