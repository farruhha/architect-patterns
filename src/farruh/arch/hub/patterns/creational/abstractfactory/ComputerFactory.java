package farruh.arch.hub.patterns.creational.abstractfactory;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
	}
}