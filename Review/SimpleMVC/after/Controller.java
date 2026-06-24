package after;

public class Controller {
	
	private Model model;

	public Controller() {
		
	}
	
	public Controller(Model model) {
		this.model = model;
	}
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	public String getInfo() {
		if (model != null) {
			return "이름 : " + model.getName();
		} else {
			return "정보가 없습니다.";
		}
	}
	
}
