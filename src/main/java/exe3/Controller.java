package exe3;

public abstract class Controller {

	protected Student model;
	protected StudentView view;

	public Controller(){
		
	}
	public void setName(String name) {
		model.setName(name);
	}

	public String getName() {
		return model.getName();
	}

	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
	
}
