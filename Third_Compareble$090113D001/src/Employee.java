
class Employee {

	private  int id;
	private String fname;
	private String lname;
	
	public Employee(int id){
		
		this(id,"","");
	}
	
	
	public Employee(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return  String.format("%d-->(%6s,%6s)\n",
				getId(),getLname(),getFname());
				
	}
	
	
}
