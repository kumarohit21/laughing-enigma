package typeerasures;

public class NewBox<T> {

	private T t;
	
	public void setData(T t) {
		
		this.t = t;
		
		System.out.println(t instanceof Integer);
	}
}


class MyBox extends NewBox<Integer>{
	
	public void setData( Integer t) {
		super.setData(t);
		
		
	}
	
	public static void main(String[] args) {
		MyBox mb = new MyBox();
		NewBox nb = mb;
		//nb.setData(34);
		
		NewBox<Integer>[] newboxintarrt;
		
	}
}