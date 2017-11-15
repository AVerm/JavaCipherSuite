class Atbash
{
	static String encrypt(String plaintext)
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		plaintext = plaintext.toUpperCase();
		String ciphertext = "";
		for (int index = 0; index < plaintext.length(); index++)
		{
			ciphertext += alphabet.charAt((alphabet.length() - 1) - alphabet.indexOf(plaintext.charAt(index)));
		}
		return ciphertext;
	}
	static String decrypt(String ciphertext)
	{
		return encrypt(ciphertext);
	}
	static String attack(String ciphertext)
	{
		return decrypt(ciphertext);
	}
}
