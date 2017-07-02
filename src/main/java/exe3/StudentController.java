package exe3;


public class StudentController extends Controller{
	private Student model;
	private StudentView view;

	public StudentController(){
		model = null;
		view = null;
	}
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	

}
