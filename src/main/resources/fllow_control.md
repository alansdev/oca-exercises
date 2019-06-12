# Flow control

#### if-else
- autorzy egazminu lubują się w dziwnie sformatowanych konstrukcjach
- trzeba zwrócić szczególną uwagę czy zmienna jest w scope
- else i if może być tylko jedno, a else if może być wiele
- wyrażenie w if-else musi w wyniku dawać true lub false

#### ternary
- wszystkie wymagane składowe wyrażenia ternary muszą być obecne
- nawiasy mogą być, ale nie są konieczne
- wyrażenie nie może występować samoistnie - musi być do czegoś przypisane
- trzeba być przygotowanym na różne wyrażenia wewnątrz - np inkrementacje zmiennych

#### switch
- trzeba zwrócić uwagę na nieosiągalny kod
- nie może być dwóch takich samych przypadków
- default nie jest wymagane
- trzeba zwrócić uwagę na break - jeśli nie ma go w przypadku, który został znaleziony sterowanie przejdzie przez wszystki poniższe przypadki, aż do napotkania break
- w switch mogą być tylko: char, byte, short, int oraz odpowiadające im wrappery + String i enum

#### for loop
- trzeba zwrócić uwagę na pętle, gdyż na egzaminie występują bardzo często
- pętla foreach nie pozwala na modyfikację zawartości tablicy
- w pętli foreach nie można usuwać elementów z kolecji po której się iteruje
- w pętli foreach nie można iterować po więcej niż jednej zmiennej 

#### while and do-while
- trzeba pamiętać, że while przy nie spełnionym warunku (true) - nie wykona kodu, w przeciwieńskie do do-while

#### break and continue
- działają we wszystkich pętlach
- trzeba się przygotować na dwupoziomowe pętle for z użyciem break i continue
- mogą zdarzyć się również labele