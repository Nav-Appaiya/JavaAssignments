Als programmeur wil je dat een wijziging in de requirements (bijv. de manier van het sorteren van studenten)
zo min mogelijk impact heeft op bestaande classen. Je wilt dus niet zomaar bestaande classen moeten wijzigen
omdat iemand een nieuwe requirement heeft. In deze opdracht ga je de mogelijk nieuwe requirements (lees: de
manier van sorteren) loskoppelen van andere klassen (de Student en School class) d.m.v. een interface i.c.m.
implementaties van die interface (elke implementatie kan studenten op een andere manier laten sorteren).

Student class
Elke student heeft een studentNummer (String), naam (String) en leeftijd (int). Schrijf een constructor die
deze field/instance variables initialiseert, en schrijf getter methods en de toString() method.

School class
De School class bevat een verzameling (lijst) van studenten. Schrijf een void add(Student student) method
waarmee je studenten kan toevoegen aan de lijst van studenten van de school. Noem deze lijst/variable “studenten”.

StudentenVergelijker interface
Schrijf een StudentenVergelijker interface. Dit interface heeft een method die als return type een boolean heeft.
Deze boolean geeft aan of de ene student *groter* is dan de andere student, wat vervolgens door de printenStudenten
method wordt gebruikt om de studenten in de gevraagde volgorde te zetten. Probeer zelf a.d.h.v. de printStudenten()
method te achterhalen welke parameters deze method moet hebben en hoe deze method heet.

App class
De App class gebruik je om de applicatie te starten en te testen. Schrijf er dus een main method in.
Zorg ervoor dat de main method een school maakt, er wat studenten in plaatst. Schrijf vervolgens in de main method
twee implementaties van StudentenVergelijker: één implementatie die sorteert op basis van leeftijd, en een ander
die sorteert op basis van naam.

[ TODO ]
(Strings kan standaard al in Java vergeleken worden of de één groter is dan de ander. Gebruik daarvoor de
compareTo method die is ingebouwd in de String class:
http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo%28java.lang.String%29 )



