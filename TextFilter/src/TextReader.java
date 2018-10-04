import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
	
	String fileName;
	
	public TextReader(String fileName){
		this.fileName = fileName;
	}
	public void read() {
		BufferedReader buffur = null;
		try {
			
			buffur = new BufferedReader(new FileReader(fileName));
			String line;
			
			while((line = buffur.readLine()) != null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffur.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
