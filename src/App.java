public class App {
    public static void main(String[] args){
        /*
         * 
         * FINAL -> indica una variabile che non può essere modificata nel corso del programma
         * 
         */
        //dichiaro una variabile
        int test = 10;
        test = 5; //riassegno il valore
        System.out.println("Variabile riassegnata: " + test); //ottengo il valore riassegnato: 5

        //PER EVITARE DI MODIFICARE LA VARIABILE
        final int proof = 10;
        // proof = 5; <= ERRORE perché final impedisce la riassegnazione della variabile
        System.out.println("Variabile con 'final': " + proof); //ottengo 10


        /*
         * 
         * STATIC -> indica che quell'attributo di un oggetto è unico per tutte le istanze della classe,
         * NON cambia ma resta lo stesso per ogni oggetto, quindi è un attributo/metodo condiviso per tutte le istanze
         *
         */
        Person personOne = new Person("Marco", "Verdi");
        // System.out.println(personOne);
        Person personTwo = new Person("Anna", "Neri");

        //stampo il numero di persone appartenenti alla classe Person
        System.out.println("Numero Istanze della classe person: " + Person.numberPerson);


        //invoco il metodo showNumberPerson() dichiarato in Person.java
        Person.showNumberPerson();
    }
}
