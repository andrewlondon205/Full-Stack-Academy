package it.jdbccinemamanager.util;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path; 
import java.sql.Timestamp;


public class BackupWriter {
	
	public static void backupFilm(String fname) {
		
		Long datetime = System.currentTimeMillis();
		String timestamp = new Timestamp(datetime).toString();
		Path filename = Path.of(timestamp + "_film.txt");
		String content = "Ultimo Backup: " + timestamp + "\n\n" + fname; 
		try { 
			Files.writeString(filename, content);
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
	}
	
	public static void backupSale(String fname) { 
		
		Long datetime = System.currentTimeMillis();
		String timestamp = new Timestamp(datetime).toString();
		Path filename = Path.of(timestamp + "_sale.txt");
		String content = "Ultimo Backup: " + timestamp + "\n\n" + fname; 
	
		try { 
			Files.writeString(filename, content);
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
	}
	
	public static void backupProiezioni (String fname) { 
		
		Long datetime = System.currentTimeMillis();
		String timestamp = new Timestamp(datetime).toString();
		Path filename = Path.of(timestamp + "_proiezioni.txt");
		String content = "Ultimo Backup: " + timestamp + "\n\n" + fname; 
		try { 
			Files.writeString(filename, content);
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
}
