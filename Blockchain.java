package shehacks_blockchain;

import java.util.Date;
import javax.crypto.*;
import java.security.*;

public class Blockchain {
	private String data;
	private String prevResult;
	private String curResult;
	private long time;
	
	public Blockchain(String info, String prevResult){
		this.prevResult = prevResult;
		this.data = info;
		time = new Date().getTime();
		curResult = " ";
		
	}

	public String cryptoApp(String input){		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");	        
			
			byte[] hash = digest.digest(input.getBytes("UTF-8"));	        
			StringBuffer hexString = new StringBuffer(); 
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public String hash(){
		String hashed = cryptoApp(prevResult + Long.toString(time) + data );
		return hashed;
		
	}
	
	//verifying blockchain works
	public verify(Blockchain [] block){
		
		return True;
	}

	
}
