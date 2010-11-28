package naskar.ui;

import naskar.application.AbrirContaUC;
import naskar.infrastructure.Controller;
import naskar.infrastructure.ViewManager;

public class AbrirContaController extends Controller {
	
	// use case
	private AbrirContaUC uc;
	
	public AbrirContaController(AbrirContaUC uc) {
		this.uc = uc;
	}
	
	// init 
	public AbrirContaView init(ViewManager viewManager) {
		setViewManager(viewManager);
		return new AbrirContaView(this);
	}
 
	// uma acao do usuario
	public void abraConta(AbrirContaView view) {
		//TODO: regras de telas
		uc.abraConta(new Long(view.getIdAgencia()), view.getNomeCliente(), view.getRG());
	}

}
