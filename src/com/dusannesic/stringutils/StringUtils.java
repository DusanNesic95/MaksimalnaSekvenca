package com.dusannesic.stringutils;

public class StringUtils {
	
	public static String najduzaSekvenca(String prvi, String drugi) {
	    int duzinaPrvog = prvi.length();
	    int duzinaDrugog = drugi.length();
	    
	    if (duzinaPrvog == 0 || duzinaDrugog == 0) {
	        return "";
	    } else if (prvi.charAt(duzinaPrvog-1) == drugi.charAt(duzinaDrugog-1)) {
	        return najduzaSekvenca(prvi.substring(0,duzinaPrvog-1),drugi.substring(0,duzinaDrugog-1))
	            + prvi.charAt(duzinaPrvog-1);
	    } else {
	        String x = najduzaSekvenca(prvi, drugi.substring(0,duzinaDrugog-1));
	        String y = najduzaSekvenca(prvi.substring(0,duzinaPrvog-1), drugi);
	        return (x.length() > y.length()) ? x : y;
	    }
	}
}
