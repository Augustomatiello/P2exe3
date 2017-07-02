package exe3;


public class MVCPatternDemo {
	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();

		// Create a view : to write student details on console
		StudentView view = new StudentView();

		Controller controller = ControllerFactoryReflection.criaControle(ControllerType.Student, model, view);
		//StudentController controller = new StudentController(model, view);

		
		controller.updateView();

		// update model data
		controller.setName("John");

		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

}
