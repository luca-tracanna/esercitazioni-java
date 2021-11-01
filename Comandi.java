public class Comandi{               //il nome della classe deve essere lo stesso del nome del file
    public static void main(String[] args) {    //String[] argv ==> immissione input in un array 


        // il simbolo // serve per comenare il codice su una sigola riga

        //DICHIARAZIONE DELLE VARIABILI E TIPI 

        byte Intero1;          //variabile che contiene numero intero a 8 bit
        short Intero2;         //variabile che contiene numero intero a 16 bit
        int Intero3=0;         //variabile che contiene numero intero a 32 bit inizializzata con un valore
        long Intero4;         //variabile che contiene numero intero a 64 bit 

        float Decimale1=0;     //variabile che contiene numero decimale a virgola mobile 32 bit
        double Decimale2=0;     //variabile che contiene numero decimale a virgola mobile con maggiore precisione 64 bit

        boolean YesOrNot;      //variabile che può assumero solo 2 valori: true o false


        //_______________________________________________________________________________________________________________________________________________


        //COSTANTI ==> si può fare un solo assegnamento, successivamente non possono essere cambiate
                // ==> il nome di una costante simbolica contiene tutte lettere maiuscole. In caso di più parole nel nome, queste sono separate da un trattino basso _

        final int COSTANTE_INTERA=2;             //costante di tipo intero
        final double COSTANTE_DECIMALE=3.14;     //costante decimale a 64 bit a virgola mobile


        //_______________________________________________________________________________________________________________________________________________

        //OPERATORI ARITMETICI

        Intero3++; // ++ autoincremento  ==> Intero3=Intero3+1
        Intero3--; //-- autodecremento ==>  Intero3=Intero3-1

        /*

         + ==> somma
         - ==> differenza
         * ==> prodotto
         / ==> divisione
         % ==> modulo

         = ==> assegnamento

        */

        //_______________________________________________________________________________________________________________________________________________

        //OPERATORI LOGICI O BOOLEANI

        /*

         ! ==> not (negazione)

         && ==> and 

         || ==> or

        */


        //_______________________________________________________________________________________________________________________________________________



        //CONVERSIONI DI TIPO
        int x = Integer.parseInt(args[0]);  //covertiamo la stringa contenuta nel vettore args in un numero intero, che  andremo a posizionare nella variabile x
        Decimale2 = Double.parseDouble(args[1]);     //covertiamo la stringa contenuta nel vettore args in un numero decimale, che  andremo a posizionare nella variabile b

        Intero1 = (byte)Intero3;    //cast di variabile ==> forzo l'assegnazione ad una variabile di tipo byte una variabile di tipo int (forzare il tipo di una variabile ad un tipo diverso)
        Intero3 = (int)Decimale2;   //cast di variabile da double a int ==> perdita della parte decimale


        //METODI PER STAMPARE A SCHERMO
        System.out.println("ciao");         //stampa una stringa con scritto ==> ciao e va a capo 
        System.out.print("ciao");           //stampa una stringa con scritto ==> ciao 
        System.out.println(a);              //stampa a schermo la variabile a (può essere di qualsiasi tipo int, double ecc..)
        System.out.println("ab"+"cd");      //il + viene usato per concatenare due stringhe
        System.out.println(1+1);            //il + viene usato per fare la somma di due numeri 


        //_______________________________________________________________________________________________________________________________________________


        //COSTRUTTO CONDIZIONALE (if)

        /*if(condizione) {codice da eseguire} 
            else { codice da eseguire}

        se la condizione all'interno dell'if non si avvera viene eseguito il codice all'interno dell'else
        */

        /*
        if(condizione) {codice da eseguire}

        se la condizione è vera viene eseguito il codice, sennò il programma lo ignora e continua l'esecuzione

        */

        if(YesOrNot==true) {            //il controllo si può fare tra due int, bool ed ecc..
            //codice da eseguire
        }
        else {
            //altro codice da eseguire
        }

        //possiamo anche annidare uno dentro l'altro gli if
        if(YesOrNot==true){
            if(x >= Intero3)
            {
                //codice da eseguire
            }
        }


        //_______________________________________________________________________________________________________________________________________________

        
        //CASI PARTICOLARI
        byte b1 = 1, b2 = 2;
        byte b3 = b1+b2;    //<== FORMA ERRATA nella somma b1+b2, in quanto i risultati parziali del calcolo di espressioni vengono memorizzati in variabili implicite di tipo int
        byte b3 = ( byte )( b1+b2 ); //<== forma corretta per fare la somma, usando quidi il cast di variabili 


        
    }
}