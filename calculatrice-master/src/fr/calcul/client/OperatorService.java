package fr.calcul.client;

import com.google.gwt.user.client.rpc.*;

@RemoteServiceRelativePath("operator")
public interface OperatorService  extends RemoteService{
	String additionner (String input1, String input2);
	String multiplier (String input1, String input2);
	

}
