# Exceptions

- Trzeba znać różnicę pomiędzy wyjątkami Checked, Unchecked i Error
- Znać różnicę pomiędzy throw i throws
- Pamiętać o zasadzie handle-or-declare w przypadku wyjątków Checked
- Pamiętać, że w przypadku wyjątków Checked blok try musi rzucić wyjątek obsługiwany w bloku catch (lub bardziej ogólny)
- Block catch nie jest wymagany, może być try i finally. Samo lub samo finally nie może być
- Trzeba pamiętać o kolejności - od szczegółu do ogółu - wprzeciwnym wypadku będzie błąd kompilacji
- Można przerzucać wyjątki, ale trzeba pamiętać o ich deklarowaniu
- Wyjątki obowiązujące na OCA - ArrayIndexOutOfBoundException, IndexOutOfBoundsException, ClassCastException, IllegalArgumentException, ArithmeticException, NullPointerException, NumberFormatException, 
- Errory obowiązujące na OCA: ExceptionInInitilizerError, StackOverflowError, NoClassDefFoundError, OutOfMemoryError