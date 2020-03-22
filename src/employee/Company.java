package employee;

public class Company {
	private void compdata(int compid,String compemail) {
		// TODO Auto-generated method stub
		System.out.println(""+compid+compemail);
		

	}
	private void compdata( String compemail,int compid) {
		// TODO Auto-generated method stub
		System.out.println(""+compemail+compid);
		

	}
	private void compdata(int compid,String compdata,String compemail,float sal) {
		// TODO Auto-generated method stub
		System.out.println(""+compid+compdata+compemail+sal);

	}
public static void main(String[] args) {
	Company i= new Company();
	i.compdata(123, "suri@gmail");
	i.compdata(123, "345", "suri@gmail", 12.2345f);
	
}
}
