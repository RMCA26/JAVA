
public class Main implements FiguraGeometrica{

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bermudas",20,10,15);
		Triangulo t = new Triangulo ("TriánguloTE",250,175,145);
		Cuadrado cuadroMondrian = new Cuadrado ("CuadradoMondrian",7);
		Rectangulo rectangulo = new Rectangulo ("RectanguloLalo",40,10);
		Trapecio trapecio = new Trapecio ("TrapecioToño",80,55,44,50);
		Rombo rombo = new Rombo ("RomboSOl",8,15,5);
		Romboide romboide = new Romboide ("RomboideHerón",500,300);
		
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(cuadroMondrian);
		imprimirCalculo(rectangulo);
		imprimirCalculo(trapecio);
		imprimirCalculo(rombo);
		imprimirCalculo(romboide);
		
	}//main
	
	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("| El área de ["+ f.getNombre()
				+ "] es :"+ f.calcularArea()+"|");
		System.out.println("| El perímetro de ["+ f.getNombre()
		+ "] es :"+ f.calcularPerimetro()+"|");
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

}//class
