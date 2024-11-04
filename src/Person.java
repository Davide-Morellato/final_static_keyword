public class Person {
    String name;
    String surname;
    //
    //dichiaro una variabile in forma STATIC come fosse un counter
    static int numberPerson;


    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        //
        //richiamo la variabile STATIC
        numberPerson++; //incremento il valore per ogni istanza creata
        System.out.println(numberPerson); //otterrò: 1 e 2 -> corrispondono al numero delle istanze create: personOne entra nel costruttore ed incrementa il valore da 0 a 1, successivamente personTwo entra nel costruttore ed incrementa il valore da 1 a 2
    }


    public String toString(){
        String objElmentsPerson = this.name + "\n" + this.surname;
        return objElmentsPerson;
    }

    //
    //dichiaro un metodo STATIC
    //non ritorna nulla, quindi 'void'
    static void showNumberPerson(){
        System.out.println("Il numero di istanze è: " + numberPerson);
    }

}
