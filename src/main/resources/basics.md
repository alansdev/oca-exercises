# Java basics

#### Main method

-	Od JAVY 7 wykonywana klasa musi miec metode main - jest to wychwycone przez jvm na etapie ladowania klas - jesli nie ma klasy z metoda main
	jest zglaszany ERROR - nie wyjatek, nie bedzie tez bledu kompilacji
-   Trzeba zwracać uwagę na nazwy przekazywanych parametrów
-   Trzeba uważać na deklarację tablicy. Wszystko co poniżej jest błędne:
        
        ' public static void main(String args []) {
            System.out.println("Valid signature: public static void main(String[] nameIsNotImportant)");
        } '
        
        ' public static void main(String args) {
            System.out.println("Valid signature: public static void main(String[] nameIsNotImportant)");
        } '
        
        ' public static void main(String [] args []) {
            System.out.println("Valid signature: public static void main(String[] nameIsNotImportant)");
        } '

#### Struktura klas

-   Trzeba zwrócić uwagę na klasy z zamienioną kolejnością słów kluczowych (np. static import)
-   Zwracamy uwagę na komentarze // vs /* */  vs javadoc /** */
-   Zwracamy uwagę na komentarze w środku wyrażenia - trzeba pamiętać, że // działa do końca linii
-   Należy zwrócić uwagę co jest wymagane, a co opcjonalne
-   Należy pamiętać, że nazwa klasy publicznej musi być zgodna z nawą pliku i że w jednym pliku może być tylko jedna klasa publiczna
-   W pliku może być więcej klas, ale z dostępem pakietowym lub klas prywatnych

#### Metody i pola

-   Pola mogą być inicjalizowane bądź nie, posiadają modyfikator dostępu i deklaracja kończy się nawiasem curly
-   Ciało metody jest zamknięte w nawiasach curly
-   Należy umieć zdefiniować obowiązkowe elementy w ramach deklaracji metody i przygotować się na przeróżne dziwne formatowanie na egazminie


#### Modyfikatory dostępu

-   Trzeba umieć zdefiniować ich wymagalność (nie są wymagane jawnie)
-   Trzeba potrafić zidentyfikować problemy z dostępeem do klasy/ pola/ metody
-   Zwrócić uwagę na modyfikator protected i jego działanie - jak się dostać do danej metody/ pola
-   Umieć określić różnice pomiędzy zakresem modyfikatorów

#### Klasy abstrakcyjne i interfejsy

-   Tutaj podstawowe informacje
-   Klasa abstrakcyjna nie może być prywatna, podobnie jak interfejs

#### Modyfikator static

-   Nie może być w klasie najwyższego poziomu
-   Może być w ramach pola lub metody
-   Trzeba zwrócić uwagę na użycie zmiennych statycznych przez metody obiektu - częsta praktyka na egzaminie




