package after;

public class View {
	
	private Controller controller;
	
	public View() {
		this.controller = new Controller();
	}
	
	public void display() {
		controller.setModel(new Model("홍길동"));
		String result = controller.getInfo();
		
		System.out.println(result);		
	}
	
}
