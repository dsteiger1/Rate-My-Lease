package shehacks_blockchain;

public class Block {

	public static void main(String[] args) {
		
		//Testing out block chain 
		Blockchain block1 = new Blockchain("Linda", "0");
		System.out.println("Hash : " + block1.hash());
		
		Blockchain block2 = new Blockchain("Danielle",block1.hash());
		System.out.println("Hash : " + block2.hash());
		
		Blockchain block3 = new Blockchain("Desiree", block2.hash());
		System.out.println("Hash : " + block3.hash());

	}

}
