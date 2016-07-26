package test;

import org.apache.log4j.Logger;

public class Book {
	
	private String title;
	static Logger logger;
	
	public String getTitle(){
		
		
		return title;
	}

	public static void main(String[] args) {
		Book b= new Book();
		logger=Logger.getLogger("deblopp");
		logger.info("Start of logger");
		System.out.println(b.getTitle());
		
		String sg=b.getTitle();
		
		if(sg!=null)
		sg.toUpperCase();
		
	}

}
