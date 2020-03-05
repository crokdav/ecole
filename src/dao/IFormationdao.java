package dao;

import java.util.List;

import modele.Formation;
import modele.Lieu;

public interface IFormationdao {
public int creat(Formation fr);
public List<Formation> getFormations();
public List<Formation> showFormations(Lieu lieu);
}
