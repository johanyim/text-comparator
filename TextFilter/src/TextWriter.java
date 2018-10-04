import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
	
	String fileName;
	
	public TextWriter(String fileName) {
		this.fileName = fileName;
	}
	
	public void append(String word) {
		BufferedWriter buffuw = null;
	    try {
	    	buffuw = new BufferedWriter(new FileWriter(fileName, true));
	    } catch(IOException e) {
	    	
	    }finally {
	    	
	    }
	    		
	    try {
			buffuw.write(word);
			buffuw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clearAll() {
		BufferedWriter buffuw = null;
		try {
			buffuw = new BufferedWriter(new FileWriter(fileName));
		} catch(IOException e) {
			
		}finally {
			try {
				buffuw.write("");
				buffuw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
