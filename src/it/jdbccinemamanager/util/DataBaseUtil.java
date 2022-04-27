package it.jdbccinemamanager.util;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseUtil {
	
	public static void deleteAllProiezioni() {
		PreparedStatement psDeleteProiezioni = null;
		int row_affected = 0;
		boolean row_deleted = true;

		try {
			String deleteProiezione = "DELETE FROM proiezioni";
			psDeleteProiezioni = ConnectionFactory.getConnection().prepareStatement(deleteProiezione);
			row_affected = psDeleteProiezioni.executeUpdate();
		} catch (SQLException e1) {
			System.out.println("Eccezione durante cancellazione proiezione");
			e1.printStackTrace();
			row_deleted = false;
		} finally {
			ConnectionFactory.closeConnection();
		}
	}
	
	public static void deleteAllFilm() {
		PreparedStatement psDeleteProiezioni = null;
		int row_affected = 0;
		boolean row_deleted = true;

		try {
			String deleteProiezione = "DELETE FROM film";
			psDeleteProiezioni = ConnectionFactory.getConnection().prepareStatement(deleteProiezione);
			row_affected = psDeleteProiezioni.executeUpdate();
		} catch (SQLException e1) {
			System.out.println("Eccezione durante cancellazione proiezione");
			e1.printStackTrace();
			row_deleted = false;
		} finally {
			ConnectionFactory.closeConnection();
		}

	}
	
	public static void deleteAllRooms() {
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
	}

}
