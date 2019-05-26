package main.module;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
	
	public List<String> getCommitList(String fileToRead, String token) throws Exception {
		List<String> result = new ArrayList<String>();
		result.addAll(Arrays.asList(getReadedFileAsString(fileToRead).split("\\"+token)));
		for(int i=0; i<result.size(); i++) {
			if(result.get(i).trim().length() == 0)
				result.remove(i);
		}
		return result;
	}
	
	public String getReadedFileAsString(String fileToRead) throws Exception {
		String result = "";
		Reader reader = new FileReader(fileToRead);
		try {
			char[] buffer = new char[1000];
			while(reader.read(buffer) != -1) {
				result += new String(buffer);
			}
		} finally {
			reader.close();
		}
		return result;
	}
	
	public String getCommitMessage(String commitLog, String tokenStart, String tokenEnd) {
		return (commitLog.split("\\"+tokenStart)[1].split("\\"+tokenEnd)[0] == null)? "" : commitLog.split("\\"+tokenStart)[1].split("\\"+tokenEnd)[0].trim();
	}
	
	public String getCommitFileListAsString(String oneCommitLog, String tokenStart, String tokenEnd) {
		return oneCommitLog.split("\\"+tokenStart)[1].trim();
	}
	
	
	
}
