package fr.apriarsa.ws.soap;

public class OperationServiceImpl implements OperationService{

	public int addition(int a, int b) {		
		return a + b;
	}

	@Override
	public int soustraction(int a, int b) {
		return a - b;
	}
	
	

}
