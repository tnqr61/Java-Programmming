import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double tutar,kdvFiyat,kdv=0.18;
		Scanner input =new Scanner(System.in);
		System.out.println("Kdv li fiyatını hesaplamak istediğniz ürünün tutarını giriniz");
		tutar = input.nextDouble();
		kdvFiyat=tutar+tutar*kdv;
		System.out.println(kdvFiyat);
		
				
	}

}
