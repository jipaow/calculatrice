package fr.calcul.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface OperatorServiceAsync {
	void additionner(String input1, String input2, AsyncCallback<String> callback)
	throws IllegalArgumentException;
	void multiplier(String input1, String input2, AsyncCallback<String> callback)
	throws IllegalArgumentException;

}
