package fr.calcul.client;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;



public class Ecran extends Composite {
	private VerticalPanel vPAnel = new VerticalPanel();
	private HorizontalPanel hPanel1, hPanel2, hPanel3, hPanel4;
	private Label op1Lb1, op2Lb1, resultLb1;
	private TextBox op1Txt,op2Txt, resultTxt;
	private Button addBtn, multBtn;
	

	public Ecran() {
		this.initWidget(this.vPAnel);
		
		this.op1Lb1 = new Label ("Operande 1 : ");
		this.op1Txt = new TextBox();
		this.hPanel1 = new HorizontalPanel();
		this.hPanel1.add(op1Lb1);
		this.hPanel1.add(op1Txt);
		this.hPanel1.setSpacing(5);
		this.vPAnel.add(hPanel1);
		
		this.op2Lb1 = new Label ("Operande 2 : ");
		this.op2Txt = new TextBox();
		this.hPanel2 = new HorizontalPanel();
		this.hPanel2.add(op2Lb1);
		this.hPanel2.add(op2Txt);
		this.hPanel2.setSpacing(5);
		this.vPAnel.add(hPanel2);
		
		this.addBtn = new Button("Additionner");
		this.addBtn.setStyleName("btn");
		this.addBtn.addClickHandler(new AddBtnHandler());
		this.multBtn = new Button("Multiplier");
		this.multBtn.setStyleName("btn");
		this.multBtn.addClickHandler(new MultBtnHandler());
		this.hPanel3 = new HorizontalPanel();
		this.hPanel3.add(addBtn);
		this.hPanel3.add(multBtn);
		this.hPanel3.setSpacing(20);
		this.vPAnel.add(hPanel3);
		
		this.resultLb1 = new Label("Résultat : ");
		this.resultTxt = new TextBox();
		this.hPanel4 = new HorizontalPanel();
		this.hPanel4.add(resultLb1);
		this.hPanel4.add(resultTxt);
		this.hPanel4.setSpacing(5);
		this.vPAnel.add(hPanel4);
	}
	
	private class AddBtnHandler implements ClickHandler
	 {
	            
	  @Override
	  public void onClick(final ClickEvent event) 
	  {
	   final OperatorServiceAsync getService = GWT.create(OperatorService.class);
	   getService.additionner(op1Txt.getText(), op2Txt.getText(), new AsyncCallback<String>() 
	   {
	    public void onFailure(Throwable caught) 
	    {
	     System.out.println(event.getSource().toString());
	    }
	            
	    public void onSuccess(String result) 
	    {
	     resultTxt.setText(result);
	    }
	   });
	  }
	 }
	
	 private class MultBtnHandler implements ClickHandler
	 {
	            
	  @Override
	  public void onClick(final ClickEvent event) 
	  {
	   final OperatorServiceAsync getService = GWT.create(OperatorService.class);
	   getService.multiplier(op1Txt.getText(), op2Txt.getText(), new AsyncCallback<String>() 
	   {
	    public void onFailure(Throwable caught) 
	    {
	     System.out.println(event.getSource().toString());
	    }
	            
	    public void onSuccess(String result) 
	    {
	     resultTxt.setText(result);
	    }
	   });
	  }
	 }
	
	
	}
	
	
	
	


