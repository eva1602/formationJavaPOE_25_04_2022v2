package fr.dawan.object_;

public class CompteBancaire {
	
	private String nomProprietaire;
	private String numeroCompte;
	private double solde;
	
	public CompteBancaire() {
		
	}
	
	public CompteBancaire(String nomProprietaire, String numeroCompte, double solde) {
		this.nomProprietaire = nomProprietaire;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	public String getNomProprietaire() {
		return this.nomProprietaire;
	}
	
	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}
	
	public String getNumeroCompte() {
		return this.numeroCompte;
	}
	
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	
	public double getSolde() {
		return this.solde;
	}
	
	public void setSolde(double newSolde) {
		solde = newSolde;
	}
	
	@Override
	public String toString() {
		return "Compte bancaire de " + this.nomProprietaire + "." +
				"\nSolde actuel : " + this.solde + "�" + 
				"\n" + super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomProprietaire == null) ? 0 : nomProprietaire.hashCode());
		result = prime * result + ((numeroCompte == null) ? 0 : numeroCompte.hashCode());
		long temp;
		temp = Double.doubleToLongBits(solde);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		if (nomProprietaire == null) {
			if (other.nomProprietaire != null)
				return false;
		} else if (!nomProprietaire.equals(other.nomProprietaire))
			return false;
		if (numeroCompte == null) {
			if (other.numeroCompte != null)
				return false;
		} else if (!numeroCompte.equals(other.numeroCompte))
			return false;
		if (Double.doubleToLongBits(solde) != Double.doubleToLongBits(other.solde))
			return false;
		return true;
		
		
		
	}
	
	
	
}
