class Caesar
{
	static String encrypt(String plaintext, int offset)
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		plaintext = plaintext.toUpperCase();
		String ciphertext = "";
		for (int index = 0; index < plaintext.length(); index++)
		{
			ciphertext += alphabet.charAt((alphabet.indexOf(plaintext.charAt(index)) + offset) % alphabet.length());
		}
		return ciphertext;
	}
	static String decrypt(String ciphertext, int offset)
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return encrypt(ciphertext, alphabet.length() - offset);
	}
	static String attack(String ciphertext)
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] possibilities;
		String output = "";
		for (int offset = 1; offset < alphabet.length(); offset++)
		{
			if (offset != 1)
			{
				output += "\n";
			}
			output += offset + ":\t" + decrypt(ciphertext, offset);
		}
		return output;
	}
}
