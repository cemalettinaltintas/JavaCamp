package interfaces;

//java da üst class static olmaz ama onun içindeki classlar static olabilir.
public class Utils {
	//Static yapınca yine bellekte bir referans oluşuyor ve
	//program çalıştığı sürece bellekte kalıyor.
	//ancak newlenen classlar kullanılıp atılıyor.
	//static metotlar sürekli kullanılıyor.
	public static void runLoggers(Logger[] loggers,String message) {
		for(Logger logger :loggers) {
			logger.log(message);
		}
	}
}
