
public class Test {
	private String name = "nameless cat";
	

	public void setName(String name) {
        //write your code here
        this.name=name;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test cat = new Test();
		cat.setName("Simba");
		System.out.println(cat.name);
	}

}
