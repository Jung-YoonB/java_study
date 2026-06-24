package after;

public class Controller {
	
	private Model model;

	public Controller() {
	
	}
		
	public void setModel(String name) {
		this.model = new Model(name);
	}
	
	public String getInfo() {
		if (model != null) {
			return "이름 : " + model.getName();
		} else {
			return "정보가 없습니다.";
		}
	}
	
}
