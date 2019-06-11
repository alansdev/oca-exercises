# Java data types

#### Primitives
- trzeba zwrócić uwagę na wartość przyjmowaną przez nie zainicjalizowane pola
- istotna jest różnica pomiędzy inicjalizacją pola kalsy i zmiennej w metodzie (w tym drugim przypaku brak inicjalizacji powoduje wyjatek)
- na egazminie nie ma konwersji pomiędzy systemami liczbowymi, ale można się spodziewać pytania jaką literę reprezentuje liczba
- można się też spodziewać sprawdzenia użycia podkreśnika
- trzeba zwracać uwagę na typ zmiennej - czy int vs double - jak są formatowane na wyjściu
- można inicjalizować char poprzez wartość liczbową
- na egzaminie często mogą pojawić się próby podania trochę innej nazwy typu - trzeba zwrócić na to uwagę (np bool zamiast boolean)

#### Object references
- Trzeba znać różnice pomiędzy typami prostymi i referencjami do obiektu
- Trzeba wiedzieć jaką wartość przyjmuje obiket bez inicjalizacji (null)

#### Operators
- Trzeba znać na pamięć wszystkie operatory - przypisania, arytmetyczne, porównania, logiczne
- Na egazminie można się spotkać ze złożonymi wyrażeniami, gdzie trzeba podać jaki będzie wynik, dlatego trzeba znać działanie i kolejność wykoanania operatorów
- Short circuit operators - trzeba umieć ocenić czy wyrażenia będzie wykonane

#### Casting
- Trzeba pamiętać, że jako jedyny prymityw boolean nie jest możliwy do castowania do innych typów

#### Wrapper classes
- Trzeba pamiętać, że są immutable
- Trzeba mieć świadomość procesów takich jak autoboxing i unboxing
- Trzeba umieć porównywać i znać różnicę pomiędzy equals() i ==
- Szczególny przypadek w klasach wrapperów - od -128 do 127 klasy mają cache wartości więc porównywanie referencji da poprawny wynik