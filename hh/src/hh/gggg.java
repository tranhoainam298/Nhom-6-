package hh;
import java.util.*;
class DNode{
	int data;
	DNode next,prev;
	DNode(int x){
		data = x; next = prev = null;
	}
	DNode(int x,DNode t , DNode s){
		data = x; next = s; prev = t;
		if(t!=null)t.next=this;
		if(s!=null)s.prev=this;
	}
	public String toString() {
		return "<--"+data+"-->";
	}
}
public class gggg {
	DNode head = null,tail=null;
	void nhap() {
		int x;
		Scanner o = new Scanner(System.in);
		head = tail = null;
		while(true) {
			System.out.println("nhap so x: ");
			x = o.nextInt();
			if(x==0) break;
			DNode t = new DNode(x);
			if(head == null) head = tail =t;
			else {
				tail.next=t; t.prev = tail; tail=t;
			}
		}
	}
	void in() {
		System.out.print("\nNoi dungg ds:");
		DNode p = head; while(p!=null) {
			System.out.print(p); p = p.next;
		}
		System.out.print("");
	}
	int tong() {
		int k=0;
		DNode p = tail;
		while(p!=null) {
			k+=p.data;
			p=p.prev;
		}
		return k;
	}
	int demle() {
		int k = 0;
		DNode p =head;
		while(p!=null) {
			if(p.data%2!=0) {
				k++;	
			}p=p.next;
		}
		return k;
	}
	boolean doixung() {
		DNode p = head;
		DNode q = tail;
		while (p!=null) {
			while(q!=null) {
				if(p.data!=q.data)
				return false;
				p=p.next;
				 q=q.prev;
			}
		}
		
		return true;		
	}
	void timdt_X(int x) {
		DNode p = tail;
		while(p!=null&&p.data!=x) p=p.prev;
		if(p==null) System.out.println("Ds ko co gia tri"+x);
		else {
			if(p.prev==null)System.out.println("Ko co not dung truoc "+x);
			else System.out.println("Not dung truoc "+x+" la: "+p.prev.data);
		}
	}
	void xoaD() {
		if(head==null) System.out.println("ko xoa dc");
		else head=head.next;
	}
	void xoaC() {
		if(tail==null) System.out.println("ko xoa dc");
		else tail=tail.prev;
	}
	public static void main(String[] args) {
		gggg LL = new gggg();
		int x;
		LL.nhap();LL.in();LL.tong();LL.demle();
		System.out.println("tong: "+LL.tong());
		System.out.println("dem le: "+LL.demle());
		System.out.println("kiem tra co dx ko: "+LL.doixung());
		Scanner o = new Scanner(System.in);
		System.out.println("nhap x can tim: ");
		x=o.nextInt();
		LL.timdt_X(x);
		LL.xoaD(); LL.in(); LL.xoaC(); LL.in();
		System.out.println("xong");
	}
}