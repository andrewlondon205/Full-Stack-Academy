package it.jdbccinemamanager.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.jdbccinemamanager.util.ConnectionFactory;

public class SalaDAO {

	public boolean insertSala(Sala new_sala) {
		PreparedStatement psInsertSala = null;
		int row_affected = 0;
		boolean row_inserted = true;

		try {
			String insertSala = "INSERT INTO public.sale(posti, nome, citta) VALUES (?, ?, ?)";
			psInsertSala = ConnectionFactory.getConnection().prepareStatement(insertSala);
			psInsertSala.setInt(1, new_sala.getNumero_posti());
			psInsertSala.setString(2, new_sala.getNome());
			psInsertSala.setString(3, new_sala.getCitta());

			row_affected = psInsertSala.executeUpdate();

			if (row_affected > 0)
				System.out.println("Inserimento avvenuto con successo");
			else {
				System.out.println("ERROR: nessuna sala inserita");
				row_inserted = false;
			}

		} catch (SQLException e1) {
			System.out.println("Eccezione durante inserimento sala");
			e1.printStackTrace();
			row_inserted = false;
		} finally {
			ConnectionFactory.closeConnection();
		}
		return row_inserted;

	}

	public boolean insertSalaAll(List<Sala> sale) {
		boolean rows_inserted = true;
		deleteAllRooms(); 
		for (Sala s : sale) {
			rows_inserted = insertSala(s);

			if (rows_inserted == false)
				return false;
		}

		return rows_inserted;
	}

	public List<Sala> getAllSala() {
		Statement st = null;
		ResultSet rs = null;
		Sala sala;
		List<Sala> sale = new ArrayList<>();

		try {
			st = ConnectionFactory.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM sale");

			while (rs.next()) {
				sala = new Sala();
				sala.setCitta(rs.getString("citta"));
				sala.setNome(rs.getString("nome"));
				sala.setNumero_posti(rs.getInt("posti"));
				sala.setCodsala(rs.getInt("codsala"));

				sale.add(sala);
			}
		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection();
		}

		return sale;

	}

	public Sala getSalaByID(int codSala) {
		PreparedStatement psSalaByID = null;
		ResultSet rs = null;
		Sala sala = null;

		try {
			String getSalaByID = "select * from sale where codsala = ?";
			psSalaByID = ConnectionFactory.getConnection().prepareStatement(getSalaByID);
			psSalaByID.setInt(1, codSala);
			rs = psSalaByID.executeQuery();

			if (rs.next()) {
				sala = new Sala();
				sala.setCitta(rs.getString("citta"));
				sala.setNome(rs.getString("nome"));
				sala.setNumero_posti(rs.getInt("posti"));
				sala.setCodsala(rs.getInt("codsala"));

			}

		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection();
		}

		return sala;
	}

	public List<Sala> getSalaByNomeCitta(String citta) {
		PreparedStatement psSalaByNomeCitta = null;
		ResultSet rs = null;

		Sala sala;
		List<Sala> saleByCitta = new ArrayList<>();

		try {
			String getSalaByNomeCitta = "select * from sale where citta = ?";
			psSalaByNomeCitta = ConnectionFactory.getConnection().prepareStatement(getSalaByNomeCitta);
			psSalaByNomeCitta.setString(1, citta);
			rs = psSalaByNomeCitta.executeQuery();

			while (rs.next()) {
				sala = new Sala();
				sala.setCitta(rs.getString("citta"));
				sala.setNome(rs.getString("nome"));
				sala.setNumero_posti(rs.getInt("posti"));
				sala.setCodsala(rs.getInt("codsala"));

				saleByCitta.add(sala);
			}

		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection();
		}

		return saleByCitta;
	}

	public boolean updateSala(Sala sala, int old_codSala) {
		PreparedStatement psUpdateSala = null;
		int row_affected = 0;
		boolean row_updated = true;

		try {
			String updateSale = "UPDATE public.sale SET codsala=?, posti=?, nome=?, citta=? WHERE codsala = ?";
			psUpdateSala = ConnectionFactory.getConnection().prepareStatement(updateSale);
			psUpdateSala.setInt(1, sala.getCodsala());
			psUpdateSala.setInt(2, sala.getNumero_posti());
			psUpdateSala.setString(3, sala.getNome());
			psUpdateSala.setString(4, sala.getCitta());
			psUpdateSala.setInt(5, old_codSala);
			row_affected = psUpdateSala.executeUpdate();

			if (row_affected > 0)
				System.out.println("Aggiornamento avvenuto con successo");
			else {
				System.out.println("ERROR: nessuna riga aggiornata");
				row_updated = false;
			}

		} catch (SQLException e1) {
			System.out.println("Eccezione durante aggiornamento sala");
			e1.printStackTrace();
			row_updated = false;
		} finally {
			ConnectionFactory.closeConnection();
		}

		return row_updated;

	}

	public boolean deleteSala(int codSala) {
		PreparedStatement psDeleteSala = null;
		int row_affected = 0;
		boolean row_deleted = true;

		try {
			String deleteSala = "DELETE FROM sale WHERE codsala = ?";
			psDeleteSala = ConnectionFactory.getConnection().prepareStatement(deleteSala);
			psDeleteSala.setInt(1, codSala);
			row_affected = psDeleteSala.executeUpdate();

			if (row_affected > 0)
				System.out.println("Cancellazione avvenuto con successo");
			else {
				System.out.println("ERROR: nessuna riga cancellata");
				row_deleted = false;
			}

		} catch (SQLException e1) {
			System.out.println("Eccezione durante cancellazione sala");
			e1.printStackTrace();
			row_deleted = false;
		} finally {
			ConnectionFactory.closeConnection();
		}

		return row_deleted;
	}
	
	public boolean deleteAllRooms() {
		PreparedStatement psDeleteProiezioni = null;
		int row_affected = 0;
		boolean row_deleted = true;

		try {
			String deleteProiezione = "DELETE FROM sale";
			psDeleteProiezioni = ConnectionFactory.getConnection().prepareStatement(deleteProiezione);
			row_affected = psDeleteProiezioni.executeUpdate();
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
