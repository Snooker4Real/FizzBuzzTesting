    fun main(){
        // traitement
        /*
        * Ceci est un commentaire sur pls lignes
        *
        *
        *

        println("Hello world !!!")
        print("Hello world !!!")




        // Déclaration de variable
        // Syntaxe générale
        // var nomVariable: TypeVariable = valeur

        var nom: String = "Jonathan"
        var age: Int = 22
        var moyenne: Double = 10.0
        var isAdmis: Boolean = true
        var uneLettre: Char = 'A'

        //constante : final in java
        val taille: Double = 180.0

        // Byte, Sgort, Int, Long, Float, Double

        println("Je m'appelle " + nom)
        println("J'ai " + age)
        println("Et " + moyenne)
        println(isAdmis)
        println(uneLettre)
        println(taille)


        val numero1 = 12
        val numero2 = 10


        //addition
        var resultat = numero1 + numero2
        println("$numero1 + $numero2 = $resultat")

        // Soustraction
        resultat = numero1 - numero2
        println("$numero1 - $numero2 = $resultat")

        // Multiplication
        resultat = numero1 * numero2
        println("$numero1 * $numero2 = $resultat")

        // Division
        var resultatDivision: Double = 12.0/10.00
        println("$numero1 / $numero2 = $resultatDivision")

        // Modulo
        val resulatModulo = numero1 % numero2
        println("Le reste de la div euclidienne de $numero1 par $numero2 est $resulatModulo")

        //for incrementing : resultat++ or resultat+=1
        //for decrementing : resultat-- or resultat-=1
        //for : resultat*=1
        //for  : resultat-/1
        //for : resultat-%1


        val a = 9
        if (a > 10){
            println("Bravo vous êtes admis")
        }
        else if (a == 9){
            println("Vous devez repasser l'exam")
        }
        else {
            println("A la prochaine")
        }

        *


        val a = 20
        val b = 10
        val max: Int

        max = if (a >b) a else b
        println("max : $max")



        // -----------  Lire les entrées console  ----------------
        // Lire des strings, des entiers
        print("Entrez votre nom:")

        val nom =  readLine()
            print("Entrez votre age:")
        val age =  readLine()!!.toInt()
        var age2 = age + 2
        println("Ton âge dans 2ans : $age2")



        println("entrez le numero 1")
        val numero1 = readLine()!!.toInt()
        println("entrez  le numero 2 :")
        val numero2 = readLine()!!.toInt()

        println("$numero1 + $numero2 = ${numero1+numero2}")
         */
        // switch == when
        println("Entrez le numero d'un jour")
        val jour = readLine()!!.toInt()
        var nomDuJour = when (jour){
            1 -> "lundi"
            2 -> "mardi"
            3 -> "mercredi"
            4 -> "jeudi"
            5 -> "vendredi"
            6 -> "samedi"
            7 -> "dimanche"
            else -> ("Vous devez rentre un numero de jour valide ")
        }

        print("On est le $nomDuJour")
    }
