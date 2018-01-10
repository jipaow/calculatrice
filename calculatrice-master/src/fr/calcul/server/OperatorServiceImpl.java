package fr.calcul.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import fr.calcul.client.OperatorService;

@SuppressWarnings("serial")
public class OperatorServiceImpl extends RemoteServiceServlet implements OperatorService {

	@Override
	public String additionner(String input1, String input2) {
		float val1 = Float.valueOf(input1).floatValue();
		float val2 = Float.valueOf(input2).floatValue();
		float res = val1+ val2;
	
		return String.valueOf(res);
	}

	@Override
	public String multiplier(String input1, String input2) {
		float val1 = Float.valueOf(input1).floatValue();
		float val2 = Float.valueOf(input2).floatValue();
		float res = val1*val2;
		
		return String.valueOf(res);
	}

}
