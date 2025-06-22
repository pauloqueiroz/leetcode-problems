package br.com.example.string;

import java.util.ArrayList;
import java.util.List;

public class ValidIpAddress {

	public static void main(String[] args) {
		ValidIpAddress algorithn = new ValidIpAddress();
		String s = "25525511135";
		System.out.println(s.substring(0, 1));
		/*
		 * List<String> restoreIpAddresses = algorithn.restoreIpAddresses(s); for
		 * (String ip : restoreIpAddresses) { System.out.print("|"+ip); }
		 */
	}
	
    public List<String> restoreIpAddresses(String s) {
    	List<String> ipsValidos = new ArrayList<String>();
    	if(s.length() < 4 || s.length() > 12)
    		return ipsValidos;
    	String p1, p2, p3, p4;
    	for(int i = 0; i < s.length(); i++) {
    		int tamanhoP1 = i+1;
			p1 = s.substring(0, tamanhoP1);
			int restanteP1 = s.length() - tamanhoP1;			
    		if(Integer.valueOf(p1) < 255 && restanteP1 < 9) {
    			int tamanhoP2 = tamanhoP1+1;
    			p2 = s.substring(tamanhoP1, tamanhoP2);
    			if(Integer.valueOf(p2) < 255 && restanteP1 < 6) {
    				int tamanhoP3 = tamanhoP2 + 1;
    				p3 = s.substring(tamanhoP2, tamanhoP3);
    				if(Integer.valueOf(p2) < 255 && restanteP1 < 3) {
        				int tamanhoP4 = tamanhoP3 + 1;
        				p4 = s.substring(tamanhoP3, tamanhoP4);
        			}
    			}
    			
    		}
    		
    	}
    	return List.of();
    }
    
}

// 255.255.255.255
// 0.0.0.0