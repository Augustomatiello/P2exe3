package exe3;

public class ControllerFactory {

	public static Controller criaControle(ControllerType tipo, Student model, StudentView view){
		Controller controle = null;
		switch (tipo) {
        case Student:
            controle = new StudentController(model, view);
            break;
 
        case Professor:
            controle = new ProfessorController(model, view);
            break;
 
        default:
            // throw some exception
            break;
        }
        
		return controle;
	}
}
