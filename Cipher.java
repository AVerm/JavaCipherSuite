public class Cipher
{
	public static void main(String args[])
	{
		String plain = "ATTACKATDAWN";
		String key = "LEMON";
		Object[] cipers = {new Vigenere(), new Autokey(), new Atbash(), new Caesar()};

		for (Object cipher : ciphers)
		{
			System.out.println(cipher);
			System.out.println(plain.equals(cipher.decrypt(cipher.encrypt(plain,key),key)));
		}

		/*
		System.out.println(plain.equals(Vigenere.decrypt(Vigenere.encrypt(plain,key),key)));
		System.out.println(Vigenere.encrypt("ATTACKATDAWN","LEMON"));
		System.out.println(Vigenere.decrypt("LXFOPVEFRNHR","LEMON"));
		System.out.println(plain.equals(Autokey.decrypt(Autokey.encrypt(plain,key),key)));
		System.out.println(Autokey.encrypt("ATTACKATDAWN","QUEENLY"));
		System.out.println(Autokey.decrypt("QNXEPVYTWTWP","QUEENLY"));
		System.out.println(plain.equals(Atbash.decrypt(Atbash.encrypt(plain))));
		System.out.println(Atbash.encrypt("ATTACKATDAWN"));
		System.out.println(Atbash.decrypt("ZGGZXPZGWZDM"));
		System.out.println(plain.equals(Caesar.decrypt(Caesar.encrypt(plain,18),18)));
		System.out.println(Caesar.encrypt("ATTACKATDAWN",18));
		System.out.println(Caesar.decrypt("SLLSUCSLVSOF",18));
		*/
		//System.out.println(Caesar.attack("SLLSUCSLVSOF"));
	}
}
