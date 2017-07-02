package exe3;

public class ProfessorController extends Controller{
	private Student model;
	private StudentView view;

	public ProfessorController(){
		model = null;
		view = null;
	}
	
	public ProfessorController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
}
