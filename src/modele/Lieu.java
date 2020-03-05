package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Lieu {
@Id
@GeneratedValue
private int idLieu;
private String adresse,ville;
public Lieu() {
	super();
	// TODO Auto-generated constructor stub
}
public Lieu(int idLieu, String adresse, String ville) {
	super();
	this.idLieu = idLieu;
	this.adresse = adresse;
	this.ville = ville;
}
public int getidLieu() {
	return idLieu;
}
public void setidLieu(int idLieu) {
	this.idLieu = idLieu;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
@Override
public String toString() {
	return "Lieu n° " + idLieu + " situé " + adresse + ", " + ville;
}

}
