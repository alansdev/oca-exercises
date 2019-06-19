# Selected classes from Java API

# Strings
- Trzeba znać różnicę pomiędzy Stringiem utworzonym poprzez konstruktor i poprzez ""
- Umieć porównywać stringi - różnica pomiędzy equals i ==
- Znać pojęcie puli Stringów - jak obikety trafiają do puli
- Umieć policzyć ile obiketów zostało utworzonych w ramach podanego bloku kodu
- Trzeba wiedzieć, że String jest immutable i każda metoda w ramach tej klasy operująca na obiekcie zwraca nowy obiekt
- Trzeba znać metody: charAt(), indexOf(), substring(), trim(), replace(), startsWith(), endsWith(), length()

# StringBuilder
- Trzeba znać różnicę pomiędzy Stringiem oraz StringBuilder i StringBuffer (ta ostatnia nie obowiązuje na egzaminie)
- Trzeba umieć używać metody: append(), insert(), delete(), deleteCharAt(), trimToSize(), replace(), subSequence()

# ArrayList
- Jedyna kolekcja obowiązująca na egzaminie OCA
- Domyślne capacity to 10


# Dates
- Trzeba umieć utworzyć obirkty LocalDate, LocalDateTime - nie ma konstruktora, tylko statyczne metody
- Trzeba wiedzieć, że klasy są immutable - ich manipulacja powoduje utworzenie nowego obiektu - częsty temat na egzaminie
- Trzeba uważać na będnie nazwane metody - np. na obikecie LocalTime nie można wywołać getHours(), tylko getHour() i analogicznie w przypadku kolejnych składników
- Odwrotnie w przypadku dodawania lub odejmowania czasów używa się liczby mnogiej - np. minusHours(), a nie munisHour()
- Można tworzyć ujemne wartości Period
- Trzeba pamiętać, że period nie "przelicza" jednych jednostek na inne - tzn. np. dni na miesiące itp.
- Trzeba znać na pamięć formattery BASIC_ISO_DATE, ISO_DATE/ ISO_LOCAL_DATE, ISO_TIME/ ISO_LOCAL_TIME, ISO_DATE_TIME/ ISO_LOCAL_DATE_TIME
- Można formatować poprzez metodę na klasaie LocalDate, LocalTime, LocalDateTime - wtedy przekazujemy DateTimeFormatter, ale również można na DateTimeFormatter wywołać format i przekazać LD, LT i LDT