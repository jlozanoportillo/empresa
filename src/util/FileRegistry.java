package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import controller.model.loggin.EventLogging;

public class FileRegistry {

	public static void saveLog(String source, boolean append, EventLogging event) throws IOException {
		FileOutputStream file = null;
		try {
			file = new FileOutputStream(source, append);
			ObjectOutputStream pipeline = new ObjectOutputStream(file);
			pipeline.writeObject(event);// objeto
		} catch (IOException e) {
			System.out.println("Ocurrio un error al guardar el log de eventos");
			throw e;
		} finally {
			file.close();
		}
	}

	public static Object readFile(String source) {
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(source);
			ObjectInputStream pipelineIn = new ObjectInputStream(fileInput);
			return pipelineIn.readObject();

		} catch (Exception e) {
			System.out.println("Ocurrio un error al leer el archivo");

		}
		return null;
	}

	public static String getNowDateString() {
		LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}
}
