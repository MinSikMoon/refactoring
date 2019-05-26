package test;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.module.Parser;

public class ParserTest {

	Parser ps;
	
	@Before
	public void before() {
		ps = new Parser();
	}
	
	public void test1_시작과끝잘라주기() throws Exception {
		//1. 읽을거리
		try {
			List<String> result = ps.getCommitList("param.txt","->");
			String rf = ps.getReadedFileAsString("param.txt");
			System.out.println(result.size());
			
			int cnt = 1;
			
			for (String string : result) {
				System.out.println("============= commit " + cnt + ", strin size : " + string.length());
				
				System.out.println(string);
				cnt++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//@Test
	public void test3_getCommitMessage() throws Exception {
		List<String> result = ps.getCommitList("param.txt","->");
		for (String oneCommitLog : result) {
			System.out.println(ps.getCommitMessage(oneCommitLog, "|", ";"));
		}
	}
	
	//@Test
	public void test2_getCommitFileList() throws Exception {
		List<String> result = ps.getCommitList("param.txt","->");
		for (String oneCommitLog : result) {
			System.out.println("============start");
			System.out.println(ps.getCommitFileListAsString(oneCommitLog, ";", ""));
		}
	}
	
	@Test
	public void test4_getTotal() throws Exception {
		List<String> result = ps.getCommitList("param.txt","->");
		int cnt = 1;
		for (String oneCommitLog : result) {
			System.out.println("============commit " + cnt + " start");
			System.out.println("message : " + ps.getCommitMessage(oneCommitLog, "|", ";"));
			System.out.println(ps.getCommitFileListAsString(oneCommitLog, ";", ""));
			cnt++;
		}
	}

}
