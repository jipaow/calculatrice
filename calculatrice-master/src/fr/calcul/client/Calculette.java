package fr.calcul.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Calculette implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Ecran main = new Ecran();
		RootPanel.get().add(main);

	}

}
