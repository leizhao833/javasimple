package javasimple;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {

		File path = new File(System.getProperty("user.home"), "javasimple");
		if (!path.exists()) {
			path.mkdirs();
		}
		File note = new File(path, "note");

		while (true) {
			try (BufferedWriter out = new BufferedWriter(new FileWriter(note))) {
				out.write(LocalDateTime.now().toString());
				out.flush();
				Thread.sleep(60 * 1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
