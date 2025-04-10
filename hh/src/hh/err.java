package hh;
import java.util.*;
import java.util.ArrayList;
//class Node{
//	int data; Node next;
//	Node(int x){
//		data = x; next = null;
//	}
//	Node(int x,Node t){
//		data = x; next = t;
//	}
//	public String toString() {
//		return data+"-->";
//	}
//}
//class MyQueue{
//	
//}
public class err {
	void josephus(int n,int k) {
		Queue Q = new LinkedList();
		for(int i = 1; i<=n; i++) Q.add(i);
		int d=0,vt=1;
		while(d<n-1) {
			int x=(int) Q.remove();
			if(vt<k) {
				vt++;Q.add(x);
			}
			else {
				d++;vt=1;
			}
			System.out.println("\nvua la: "+Q.remove());
		}
	}
	void Radix_sort() {
		Queue Q = new LinkedList();
		Queue []QQ;QQ=new LinkedList[10];
		for(int i = 0; i<=9; i++) QQ[i]=new LinkedList();
		int[] a;
		int x,vt,d=1,max=a[0];
		for(int i=0; i<a.le)
	}
	public static void main(String[] args) {
		err m = new err();
		m.josephus(13, 3);
		m.josephus(137, 7);
	}
}
