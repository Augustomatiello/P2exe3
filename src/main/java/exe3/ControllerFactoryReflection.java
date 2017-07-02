package exe3;

public class ControllerFactoryReflection {
	public static Controller criaControle(ControllerType tipo, Student model, StudentView view){
		Controller controle = null;
		try {
			
			String firstLetter = tipo.toString().substring(0, 1);
			String rest = tipo.toString().substring(1).toLowerCase();
			Class<?> realFact = Class.forName("exe3."+firstLetter+rest+"Controller");
			controle = (Controller) realFact.newInstance();
			controle.model = model;
			controle.view = view;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return controle;
	}
}
