package it.jdbccinemamanager.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.jdbccinemamanager.util.ConnectionFactory;

public class ProiezioniDAO {

	public boolean insertProiezioni(Proiezioni new_proiezione) {
		PreparedStatement psInsertProiezioni = null;
		int row_affected = 0;
		boolean row_inserted = true;

		try {
			String insertProiezioni = "INSERT INTO public.proiezioni(cod_film, cod_sale, incasso, dataproiezione) "
					+ "VALUES (?, ?, ?, ?)";
			psInsertProiezioni = ConnectionFactory.getConnection().prepareStatement(insertProiezioni);
			psInsertProiezioni.setInt(1, new_proiezione.getFilm().getCodfilm());
			psInsertProiezioni.setInt(2, new_proiezione.getSala().getCodsala());
			psInsertProiezioni.setDouble(3, new_proiezione.getIncasso());
			psInsertProiezioni.setDate(4, new_proiezione.getDataproiezione());

			row_affected = psInsertProiezioni.executeUpdate();

			if (row_affected > 0)
				System.out.println("Inserimento avvenuto con successo");
			else {
				System.out.println("ERROR: nessuna proiezione inserita");
				row_inserted = false;
			}

		} catch (SQLException e1) {
			System.out.println("Eccezione durante inserimento proiezione");
			e1.printStackTrace();
			row_inserted = false;
		} finally {
			ConnectionFactory.closeConnection();
		}
		return row_inserted;
	}

	public boolean insertProiezioniAll(List<Proiezioni> proiezioni) {
		boolean rows_inserted = true;
		for (Proiezioni p : proiezioni) {
			rows_inserted = insertProiezioni(p);

			if (rows_inserted == false)
				return false;
		}

		return rows_inserted;
	}


	public List<Proiezioni> getAllProiezioni() {
		FilmDAO filmDAO = new FilmDAO();
		SalaDAO salaDAO = new SalaDAO();

		Statement st = null;
		ResultSet rs = null;
		Proiezioni proiezione;
		List<Proiezioni> proiezioni = new ArrayList<>();

		try {
			st = ConnectionFactory.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM proiezioni");

			while (rs.next()) {
				proiezione = new Proiezioni();
				proiezione.setCodproiezione(rs.getInt("codproiezione"));
				proiezione.setDataproiezione(rs.getDate("dataproiezione"));
				proiezione.setIncasso(rs.getDouble("incasso"));

				int codFilm = rs.getInt("cod_film");
				proiezione.setFilm(filmDAO.getFilmByID(codFilm));

				int codSala = rs.getInt("cod_sale");
				proiezione.setSala(salaDAO.getSalaByID(codSala));

				proiezioni.add(proiezione);
			}
		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection();
		}

		return proiezioni;

	}

	public Proiezioni getProiezioniByID(int codProiezione) {
		PreparedStatement psProiezioniByID = null;
		ResultSet rs = null;
		Proiezioni proiezioni = null;
		FilmDAO filmDAO = new FilmDAO();
		SalaDAO salaDAO = new SalaDAO();

		try {
			String getProiezioniByID = "select * from proiezioni where codproiezione = ?";
			psProiezioniByID = ConnectionFactory.getConnection().prepareStatement(getProiezioniByID);
			psProiezioniByID.setInt(1, codProiezione);
			rs = psProiezioniByID.executeQuery();

			if (rs.next()) {
				proiezioni = new Proiezioni();
				proiezioni.setCodproiezione(rs.getInt("codproiezione"));
				proiezioni.setDataproiezione(rs.getDate("dataproiezione"));
				proiezioni.setIncasso(rs.getDouble("incasso"));

				int codFilm = rs.getInt("cod_film");
				proiezioni.setFilm(filmDAO.getFilmByID(codFilm));

				int codSala = rs.getInt("cod_sale");
				proiezioni.setSala(salaDAO.getSalaByID(codSala));
			}

		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection();
		}

		return proiezioni;

	}

	public List<Proiezioni> getProiezioniByCodFilm(int codFilm) {
		PreparedStatement psProiezioniByCodFilm = null;
		ResultSet rs = null;
		Proiezioni proiezione = null;
		List<Proiezioni> proiezioni = new ArrayList<>();
		FilmDAO filmDAO = new FilmDAO();
		SalaDAO salaDAO = new SalaDAO();

		try {
			String getProiezioniByID = "SELECT * FROM proiezioni WHERE codfilm = ?";
			psProiezioniByCodFilm = ConnectionFactory.getConnection().prepareStatement(getProiezioniByID);
			psProiezioniByCodFilm.setInt(1, codFilm);
			rs = psProiezioniByCodFilm.executeQuery();

			if (rs.next()) {
				proiezione = new Proiezioni();
				proiezione.setCodproiezione(rs.getInt("codproiezioni"));
				proiezione.setDataproiezione(rs.getDate("dataproiezione"));
				proiezione.setIncasso(rs.getDouble("incasso"));

				int codFilmRs = rs.getInt("codFilm");
				proiezione.setFilm(filmDAO.getFilmByID(codFilmRs));

				int codSalaRs = rs.getInt("codSala");
				proiezione.setSala(salaDAO.getSalaByID(codSalaRs));
			}

		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection();
		}

		return proiezioni;

	}

	/*
	 * @TODO: implementare update chiavi esterne (sala e film)
	 */
	public boolean updateProiezioni(Proiezioni proiezioni, int old_codProiezioni) {
		PreparedStatement psUpdateProiezioni = null;
		int row_affected = 0;
		boolean row_updated = true;

		try {
			String updateProiezioni = "UPDATE public.proiezioni "
					+ "SET codproiezione=?, incasso=?, dataproiezione=?, cod_film =?, cod_sale=?"
					+ "WHERE codProiezione = ?;";
			psUpdateProiezioni = ConnectionFactory.getConnection().prepareStatement(updateProiezioni);
			psUpdateProiezioni.setInt(1, proiezioni.getCodproiezione());
			psUpdateProiezioni.setDouble(2, proiezioni.getIncasso());
			psUpdateProiezioni.setDate(3, proiezioni.getDataproiezione());
			psUpdateProiezioni.setInt(4, proiezioni.getFilm().getCodfilm());
			psUpdateProiezioni.setInt(5, proiezioni.getSala().getCodsala());
			psUpdateProiezioni.setInt(6, old_codProiezioni);

			row_affected = psUpdateProiezioni.executeUpdate();

			if (row_affected > 0)
				System.out.println("Aggiornamento avvenuto con successo");
			else {
				System.out.println("ERROR: nessuna riga aggiornata");
				row_updated = false;
			}

		} catch (SQLException e1) {
			System.out.println("Eccezione durante aggiornamento proiezione");
			e1.printStackTrace();
			row_updated = false;
		} finally {
			ConnectionFactory.closeConnection();
		}

		return row_updated;

	}

	public boolean deleteProiezioni(int codProiezione) {
		PreparedStatement psDeleteProiezioni = null;
		int row_affected = 0;
		boolean row_deleted = true;

		try {
			String deleteProiezione = "DELETE FROM proiezioni WHERE codproiezioni = ?";
			psDeleteProiezioni = ConnectionFactory.getConnection().prepareStatement(deleteProiezione);
			psDeleteProiezioni.setInt(1, codProiezione);
			row_affected = psDeleteProiezioni.executeUpdate();

			if (row_affected > 0)
				System.out.println("Cancellazione avvenuto con successo");
			else {
				System.out.println("ERROR: nessuna riga cancellata");
				row_deleted = false;
			}

		} catch (SQLException e1) {
			System.out.println("Eccezione durante cancellazione proiezione");
			e1.printStackTrace();
			row_deleted = false;
		} finally {
			ConnectionFactory.closeConnection();
		}

		return row_deleted;
	}
}
