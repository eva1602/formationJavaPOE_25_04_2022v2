package fr.dawan.methodes;

/*
 * M?thode : Un ensemble d'instruction r?utilisable - eviter de repeter du code
 * 
 * D?clarer une m?thode : 
 * Visibilit?[mot-cl?] type-retour nom-methode(param){instructions}
 * 
 * La Surcharge : 
 * La surcharge d'une m?thode ou d'un constructeur permet de definir 
 * plusieurs fois une methode/constructeur avec des arguments differents 
 * 
 * Quel est avantage ? 
 * Nous n'avons pas besoin de cr?er et memoriser des noms differents 
 * pour des m?thodes faisant la m?me chose 
 * Par exemple, dans notre code, si la surcharge n'etait pas prise en 
 * charge par Java, somme1, somme2,... ou somme2Int, ..etc
 */
public class Methodes {

	public static void main(String[] args) {
		int[] tab = {4, 12, 8, 18};
		afficher();
		afficher(tab);
		
		int res = somme(2, 50);
		System.out.println(res);
		
		int resTab = somme(tab);
		System.out.println(resTab);
		
	}
	
	/**
	 * Methode afficher
	 * void  ==> Si aucune valeur n'est retourn?e, renvoy?e
	 * on utilise le pseudo-type void
	 */
	public static void afficher() {
		System.out.println("Methode afficher");
	}
	
	/**
	 * Affiche les ?l?ments d'un tableau
	 * @param tab
	 */
	public static void afficher(int[] tab) {
		for (int item : tab) {
			System.out.println(item);
		}
	}
	
	/**
	 * Methode prend deux param?tres int et retourne un entier
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static int somme(int val1, int val2) {
		int result = 0;
		result = val1 + val2;
		return result;
	}
	

	public static int somme(int[] tab1) {
		int somme = 0;
		for (int item : tab1) {
			somme += item;
		}
		return somme;
	}
	
	

}
