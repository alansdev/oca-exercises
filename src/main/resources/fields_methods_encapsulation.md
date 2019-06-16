# Fields, methods and encapsulation

#### Zasięg - scope
- Trzeba pamiętać, że zasięg zmiennej kończy się na nawiasie curly
- Trzeba rozróżniać zmienne lokalne, zmienne obiektu oraz zmienne klasowe (static)
- Trzeba bardzo mocno zwracać uwagę na scope - szczególnie w pytaniach, które tego nie dotyczą - zawsze upewnijmy się, że zmienna jest dostępna
- Trzeba umieć uszeregować scope rosnąco/ malejąco - np. rosnąco: zmienne klasy (statyczne), pola obiektu, parametry do metody, zmienne w metodzie, zmienne w bloku np. if

#### Metody
- nie ma ograniczenia co do ilości parametrów
- nie można zdefiniować zmiennej o tej samej nazwie w metodzie i w parametrze
- zwrócić uwagę na przeciążenie metod - typ zwracany nie musi być ten sam, a parametry muszę być różne
- obiekty są przekazywane przez referencje, a metody poprzez wartość - trzeba umieć to odróżnić

#### Konstruktory
- specjalny typ metody, która tworzy obiket klasy, gdzie jest zdefiniowana
- nie deklarują co zwracają (jest to domyślnie obiket klasy)
- mogą mieć różne modyfikatory dostępu - tak jak dla klasy
- tzeba umieć określić kiedy są wykonywane bloki inicjalizacyjne
- konstruktor może odwoływać się do innych konstruktoró poprzez this, ale to wywołanie musi być pierwszym w ciele kontruktora'

#### Enkaplulacja
- trzeba umieć zidentyfikować, czy w danej klasie pola zostały poprawnie enkaplulowane

#### Cykl życia obiketu
- Trzeba wiedzieć kiedy obiket jest tworzony i kiedy zostanie potencjalnie wskazany do usunięcia przez GC
- Trzeba uważać na pytania związane z pewnością usunięcia obiketu przez GC - co do tego nigdy nie mamy pewności
- Również wywołanie bezpośrednie System.gc() nie gwarantuje jego wykonania