package ttt;
class TNode{
	int data;
	TNode left,right;
	TNode(int x){
		data =x; left=right=null;
	}
	TNode(int x,TNode ll, TNode rr){
		data=x;left=ll;right=rr;
	}
}
public class âe {
	TNode root;
	void taocayT() {
		TNode A=new TNode(7,new TNode(1),new TNode(6));
		TNode B=new TNode(5,null,new TNode(9));
		root=new TNode(2,A,B);
	}
	void duyetl(TNode T) {
		if(T!=null) {
			System.out.println(" "+T.data);
			duyetl(T.left); duyetl(T.right);
		}
	}
	void duyettientu() {
		System.out.println("\nTien tu: "); duyetl(root);
	}
	void duyet2(TNode T) {
		if(T!=null) {
			duyet2(T.left);
			System.out.println(" "+T.data);
			 duyet2(T.right);
		}
	}
	void duyettrungtu() {
		System.out.println("\nTrung tu: "); duyet2(root);
	}
	void duyet3(TNode T) {
		if(T!=null) {
			duyet3(T.left);
			
			 duyet3(T.right);
			 System.out.println(" "+T.data);
		}
	}
	void duyethautu() {
		System.out.println("\nhau tu: "); duyet3(root);
	}
	int sonot(TNode T) {
		if(T==null) return 0;
		else return 1+sonot(T.left)+sonot(T.right);
	}
	int sn() {
		return sonot(root);
	}
	int tong(TNode t) {
		if(t==null) return 0;
		else return t.data+tong(t.left)+tong(t.right);
	}
	int tongnot() {
		return tong(root);
	}
	public static void main(String[] args) {
		âe t = new âe();
		t.taocayT();
		t.duyettientu(); t.duyettrungtu(); t.duyethautu();  
		System.out.println("So not trong cay: "+ t.sn());
		System.out.println("Tong not: "+t.tongnot());
		System.out.println("XONG");
	}
}