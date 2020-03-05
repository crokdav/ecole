package dao;

import java.util.List;


import modele.Lieu;

public interface ILieuDAO {
	public int creat(Lieu li);
	public List<Lieu> getLieux();
}
