package monotache.noncorrige;

import monotache.corrige.DateUtils;

public class AppFacturation {

	public static void main(String[] args) {
		Facturation facturation = new Facturation();
		Facture facture = facturation.creerFacture(18.5, DateUtils.parse("18/11/2017"));

	}

}
