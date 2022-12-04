package abstructClasses;

//Abstract classlar asla newlenemez.
public abstract class GameCalculator {
	public abstract void hesapla();
	
	//final olan metod alat sınıflarda değiştirilemez.
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}