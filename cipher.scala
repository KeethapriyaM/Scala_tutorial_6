object cipher extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    //get shift value 
	val key = scala.io.StdIn.readLine("Shift By: ").toInt

    //get message for encrypt/Decrypte
	val msg = scala.io.StdIn.readLine("Message to encrypt: ")

    //map and store 
	val encryptedText = msg.map( (c: Char) => alphabet((alphabet.indexOf(c.toUpper) + key) % alphabet.size))
    val decryptedText = encryptedText.map( (c: Char) => alphabet((alphabet.indexOf(c.toUpper) - key + alphabet.size) % alphabet.size))

    printf("Encrypted message: %s\n",encryptedText)
    printf("Decrypted message: %s\n",decryptedText)
}