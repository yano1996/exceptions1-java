package model.exceptions;
//Exception e precisa tratar o erro
//RuntimeException o compilador nao obriga a tratar o erro
public class DomainException extends Exception{

	private static final long serialVersionUID = 1L;
	public DomainException(String msg) {
		super(msg);
	}

}
