package features;

public class ClasseMain {

	public static void main(String[] args) {
		Entrada e = new Entrada();
		EntradaNum1 a = new EntradaNum1();
		
		e.setTexto("Escreva algo no terminal");
		System.out.println(e.getTexto());
		a.painel();
		System.out.println(a.getNum());

	}

}
