object caesarCipher{
    def encryption(encString:String):String = {
        var encryptedString = ""
        for(i <- 0 until encString.length){
            val char = encString(i)
            if(char != ' '){
               val position = encString(i).toInt + 1
               encryptedString += position.toChar
            }
            else{
                encryptedString += char
            } 
        }
        encryptedString
    }

    def decryption(decString:String):String = {
        var decryptedString = ""
        for(i <- 0 until decString.length){
            var char = decString(i)
            if(char != ' '){
               val position = decString(i).toInt - 1
               decryptedString += position.toChar
            }
            else{
               decryptedString += char 
            }  
        }
        decryptedString
    }

}

object q1 extends App{
    print("Enter the option 1 to Encrypt and 0 to Decrypt : ")
    var option = scala.io.StdIn.readInt()
    if(option == 1){
       print("Enter the word you want to encrypt : ")
       val word = scala.io.StdIn.readLine().toLowerCase
       val enc = caesarCipher.encryption(word)
       println(enc)
    }
    else{
       print("Enter the word you want to decrypt : ")
       val word = scala.io.StdIn.readLine().toLowerCase
       val decr = caesarCipher.decryption(word)
       println(decr)
    }
    
    
}