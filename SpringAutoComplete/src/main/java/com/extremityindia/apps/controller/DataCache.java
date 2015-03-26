package com.extremityindia.apps.controller;

import java.util.ArrayList;
import java.util.List;

public class DataCache {
    
    static StringBuilder dataCache;
    static String [] data;
    static{
	
	dataCache = new StringBuilder();
	dataCache.append("Aaron Hank,Abagnale Frank,Abbey Edward,Abel Reuben,Abelson Hal,"
		+ "Abourezk James,Abrams Creighton,Ace Jane,Ba Jin,Baba Meher,Baba Tupeni,"
		+ "Babbage Charles,Babbitt Milton,Bacevich Andrew,Bach Richard,Bachelard Gaston,"
		+ "Bachelot Roselyne,Bacon Francis,Baddiel David,Baden-Powell Sir Robert (B-P),"
		+ "Badiou, Alain,Badnarik, Michael,Cabell James Branch,Caesar Irving,Caesar Julius,"
		+ "Cage John,Cain Peter,Callaghan James,Calvin John,Cameron Julia,Cameron Kirk,"
		+ "Java Honk,Java Honk Test,Java Honk Test Successful,Java Honk Spring MVC,"
		+ "Java Honk autocomplete,Java Honk Spring MVC autocomplete List");
	
	data =dataCache.toString().split(",");
    }
    
    public static List<String> getName(String name) {

	List<String> returnMatchName = new ArrayList<String>();
	String [] data =dataCache.toString().split(",");	
	for (String string : data) {
	    if (string.toUpperCase().indexOf(name.toUpperCase())!= -1) {
		returnMatchName.add(string);
	    }
	}
	
	return returnMatchName;
    }

}
