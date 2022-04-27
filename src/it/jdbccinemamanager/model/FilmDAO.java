package it.jdbccinemamanager.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import it.jdbccinemamanager.util.ConnectionFactory;

public class FilmDAO {

	/*
	 * Ricorda sono operazione CRUD - Creation Read Update Delete
	 */
	public boolean insertFilm(Film new_film) {
		PreparedStatement psInsertFilm = null;
		int row_affected = 0;
		boolean row_inserted = true;

		try {
			String insertFilm = "INSERT INTO public.film(titolo, annoproduzione, nazionalita, regista, attori, genere) VALUES (?, ?, ?, ?, ?, ?)";
			psInsertFilm = ConnectionFactory.getConnection().prepareStatement(insertFilm);
			psInsertFilm.setString(1, new_film.getTitolo());
			psInsertFilm.setInt(2, new_film.getAnnoproduzione());
			psInsertFilm.setString(3, new_film.getNazionalita());
			psInsertFilm.setString(4, new_film.getRegista());
			psInsertFilm.setString(5, new_film.getAttori());
			psInsertFilm.setString(6, new_film.getGenere());

			row_affected = psInsertFilm.executeUpdate();

			if (row_affected > 0)
				System.out.println("Inserimento avvenuto con successo");
			else {
				System.out.println("ERROR: nessun film inserito");
				row_inserted = false;
			}

		} catch (SQLException e1) {
			System.out.println("Eccezione durante inserimento film");
			e1.printStackTrace();
			row_inserted = false;
		} finally {
			ConnectionFactory.closeConnection();
		}
		return row_inserted;
	}

	public boolean insertFilmAll(List<Film> films) {
		boolean rows_inserted = true;
		for (Film f : films) {
			rows_inserted = insertFilm(f);

			if (rows_inserted == false)
				return false;
		}

		return rows_inserted;
	}

	public List<Film> getAllFilm() {
		Statement st = null;
		ResultSet rs = null;
		Film film;
		List<Film> films = new ArrayList<>();

		try {
			st = ConnectionFactory.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM film");

			while (rs.next()) {
				film = new Film();
				film.setAnnoproduzione(rs.getInt("annoproduzione"));
				film.setAttori(rs.getString("attori"));
				film.setCodfilm(rs.getInt("codfilm"));
				film.setGenere(rs.getString("genere"));
				film.setNazionalita(rs.getString("nazionalita"));
				film.setTitolo(rs.getString("titolo"));
				film.setRegista(rs.getString("regista"));

				films.add(film);
			}
		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection();
		}

		return films;

	}

	public Film getFilmByID(int codFilm) {
		PreparedStatement psFilmByID = null;
		ResultSet rs = null;
		Film film = null;

		try {
			String getFilmByID = "select * from film where codFilm = ?";
			psFilmByID = ConnectionFactory.getConnection().prepareStatement(getFilmByID);
			psFilmByID.setInt(1, codFilm);
			rs = psFilmByID.executeQuery();

			if (rs.next()) {
				film = new Film();
				film.setAnnoproduzione(rs.getInt("annoproduzione"));
				film.setAttori(rs.getString("attori"));
				film.setCodfilm(rs.getInt("codfilm"));
				film.setGenere(rs.getString("genere"));
				film.setNazionalita(rs.getString("nazionalita"));
				film.setTitolo(rs.getString("titolo"));
			}

		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection();
		}

		return film;
	}

	public boolean updateFilm(Film film, int old_codfilm) {
		PreparedStatement psUpdateFilm = null;
		int row_affected = 0;
		boolean row_updated = true;

		try {
			String updateFilm = "UPDATE public.film "
					+ "SET codfilm=?, titolo=?, annoproduzione=?, nazionalita=?, regista=?, attori=?, genere=? "
					+ "WHERE codfilm = ?";
			psUpdateFilm = ConnectionFactory.getConnection().prepareStatement(updateFilm);
			psUpdateFilm.setInt(1, film.getCodfilm());
			psUpdateFilm.setString(2, film.getTitolo());
			psUpdateFilm.setInt(3, film.getAnnoproduzione());
			psUpdateFilm.setString(4, film.getNazionalita());
			psUpdateFilm.setString(5, film.getRegista());
			psUpdateFilm.setString(6, film.getAttori());
			psUpdateFilm.setString(7, film.getGenere());
			psUpdateFilm.setInt(8, old_codfilm);

			row_affected = psUpdateFilm.executeUpdate();

			if (row_affected > 0)
				System.out.println("Aggiornamento avvenuto con successo");
			else {
				System.out.println("ERROR: nessuna riga aggiornata");
				row_updated = false;
			}

		} catch (SQLException e1) {
			System.out.println("Eccezione durante aggiornamento film");
			e1.printStackTrace();
			row_updated = false;
		} finally {
			ConnectionFactory.closeConnection();
		}

		return row_updated;

	}

	public boolean deleteFilm(int id) {
		PreparedStatement psDeleteFilm = null;
		int row_affected = 0;
		boolean row_deleted = true;

		try {
			String deleteFilm = "DELETE FROM film WHERE codfilm = ?";
			psDeleteFilm = ConnectionFactory.getConnection().prepareStatement(deleteFilm);
			psDeleteFilm.setInt(1, id);
			row_affected = psDeleteFilm.executeUpdate();

			if (row_affected > 0)
				System.out.println("Cancellazione avvenuto con successo");
			else {
				System.out.println("ERROR: nessuna riga cancellata");
				row_deleted = false;
			}

		} catch (SQLException e1) {
			System.out.println("Eccezione durante cancellazione film");
			e1.printStackTrace();
			row_deleted = false;
		} finally {
			ConnectionFactory.closeConnection();
		}

		return row_deleted;
	}
	
}
