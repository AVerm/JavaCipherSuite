class Vigenere
{
	static String encrypt(String plaintext, String key)
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		plaintext = plaintext.toUpperCase();
		key = key.toUpperCase();
		String ciphertext = "";
		for (int index = 0; index < plaintext.length(); index++)
		{
			ciphertext += Character.toString(alphabet.charAt(((alphabet.indexOf(plaintext.charAt(index)) + alphabet.indexOf(key.charAt(index%key.length()))) + alphabet.length()) % alphabet.length()));
		}
		return ciphertext;
	}
	static String decrypt(String ciphertext, String key)
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		ciphertext = ciphertext.toUpperCase();
		key = key.toUpperCase();
		String plaintext = "";
		for (int index = 0; index < ciphertext.length(); index++)
		{
			plaintext += Character.toString(alphabet.charAt(((alphabet.indexOf(ciphertext.charAt(index)) - alphabet.indexOf(key.charAt(index%key.length()))) + alphabet.length()) % alphabet.length()));
		}
		return plaintext;
	}
}
