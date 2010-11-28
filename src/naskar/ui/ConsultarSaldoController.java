package naskar.ui;

import naskar.application.ConsultarSaldoUC;
import naskar.infrastructure.Controller;
import naskar.infrastructure.ViewManager;

public class ConsultarSaldoController extends Controller {
	
	private ConsultarSaldoUC uc;
	
	public ConsultarSaldoController(ConsultarSaldoUC uc) {
		this.uc = uc;
	}
	
	public ConsultarSaldoView init(ViewManager viewManager) {
		this.setViewManager(viewManager);
		return new ConsultarSaldoView(this);
	}

	public void consulteSaldo(ConsultarSaldoView view) {
		float saldo = uc.consulteSaldo(new Long(view.getNumeroConta()));
		view.setSaldo(String.valueOf(saldo));
		
	}

}
