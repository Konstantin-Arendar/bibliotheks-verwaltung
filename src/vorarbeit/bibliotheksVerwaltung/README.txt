In dieser Übung modellierst du eine kleine Bibliotheksverwaltung. 
Die Design-Entscheidungen (welche Klasse was macht, was abstrakt ist, 
was private sein sollte) triffst du selbst.

Aufgabe 1: Das Grundkonzept

Eine Bibliothek verwaltet verschiedene Arten von Medien. Jedes Medium hat eine eindeutige Kennung,
die sich nach dem Anlegen nie mehr ändern darf, außerdem einen Titel und einen Ausleihstatus.
Neue Medien sind zunächst nicht ausgeliehen.
Modelliere die gemeinsame Basis aller Medien. Ein Medium soll ausgeliehen und zurückgegeben werden
können. Wird versucht, ein bereits ausgeliehenes Medium noch einmal auszuleihen (oder ein nicht
ausgeliehenes zurückzugeben), soll das Programm mit einer passenden Exception darauf reagieren.
Jedes Medium muss seine Leihgebühr für eine übergebene Anzahl Tage berechnen können. Wie die Gebühr 
berechnet wird, ist aber von der Medienart abhängig und kann an dieser Stelle noch nicht festgelegt 
werden. Außerdem soll jedes Medium eine sinnvolle textuelle Darstellung liefern, die mindestens Kennung,
Titel und Status enthält.
Von der Basisklasse allein soll man keine Objekte erzeugen können.

Aufgabe 2: Konkrete Medienarten

Erweitere dein Modell um zwei konkrete Medienarten.
Buch: Zusätzlich zu den allgemeinen Eigenschaften hat ein Buch einen Autor und eine Seitenzahl. 
Die Leihgebühr beträgt 0,50 € pro Tag.
DVD: Zusätzlich hat eine DVD eine Laufzeit in Minuten und eine Altersfreigabe. 
Die Leihgebühr beträgt 1,00 € pro Tag, mindestens aber 2,00 €.
Die textuelle Darstellung beider Klassen soll alle Informationen enthalten, 
also auch die der Basisklasse. Vermeide dabei doppelten Code.


Aufgabe 3: Verlängerbare Medien

Manche Medien lassen sich verlängern, andere nicht. In dieser Bibliothek können nur Bücher verlängert 
werden, DVDs nicht.
Finde eine Möglichkeit, diese Eigenschaft so zu modellieren, dass sie unabhängig von der 
Vererbungshierarchie der Medien ist. Beim Verlängern wird die Leihdauer um eine übergebene Anzahl 
Tage erhöht. Überlege dir, welche zusätzlichen Informationen ein Buch dafür speichern muss und wie 
sich das auf die Gebührenberechnung auswirkt.


Aufgabe 4: Die Bibliothek
Implementiere eine Klasse, die eine beliebige Anzahl von Medien verwaltet. Sie soll folgende 
Funktionen bieten:

Ein Medium hinzufügen.
Ein Medium anhand seiner Kennung suchen. Überlege dir, wie mit dem Fall umgegangen wird, 
dass es kein passendes Medium gibt.
Ein Medium anhand seiner Kennung ausleihen.
Alle aktuell verfügbaren (nicht ausgeliehenen) Medien als Liste zurückgeben.
Alle Medien mit ihrer textuellen Darstellung auf der Konsole ausgeben.

Randbedingung: Diese Klasse soll mit jeder Medienart funktionieren, auch mit solchen, die es heute 
noch gar nicht gibt. Sie darf deshalb nicht prüfen, welche konkrete Art von Medium sie gerade vor 
sich hat.

Aufgabe 5: Testprogramm

Schreibe ein Programm mit main-Methode, das dein Modell ausprobiert und dabei folgende Schritte 
durchführt:

Lege eine Bibliothek an und befülle sie mit mindestens zwei Büchern und zwei DVDs.
Leihe ein Buch und eine DVD aus und gib anschließend alle verfügbaren Medien aus.
Versuche, das bereits ausgeliehene Buch erneut auszuleihen. Das Programm darf dabei nicht abstürzen, 
sondern soll eine verständliche Meldung ausgeben.
Berechne für alle Medien der Bibliothek die Leihgebühr für 5 Tage und gib sie aus. Dafür soll ein 
einziger Code-Abschnitt genügen, der für alle Medienarten gilt.
Verlängere alle Medien, die sich verlängern lassen, um 3 Tage. Bei den anderen soll nichts passieren.


Fragen zur Reflexion:

Beantworte diese Fragen schriftlich in ein paar Sätzen (z. B. als Kommentar oder in einer Textdatei):

Was passiert, wenn man versucht, ein Objekt der Basisklasse direkt zu erzeugen, und warum?
Warum sollte der Ausleihstatus nicht von außen direkt veränderbar sein?
Welchen Vorteil hat es, alle Medien in einer gemeinsamen Liste zu speichern statt getrennt nach Art?
Warum wurde die Verlängerbarkeit nicht als weitere Basisklasse modelliert?
Zusatzaufgaben (optional)
A: Zwei Medien mit gleicher Kennung sollen als gleich gelten. Sorge dafür, dass das auch in Collections
 wie HashSet korrekt funktioniert.
B: Sortiere die Medien der Bibliothek alphabetisch nach Titel, ohne dafür eine eigene Sortierschleife
 zu schreiben.
C: Statt einen Sonderwert zurückzugeben, wenn ein Medium nicht gefunden wird, soll eine selbst 
definierte Exception geworfen werden.
D: Füge eine neue Medienart (z. B. Zeitschrift) hinzu. Überprüfe, ob du dafür Code in der 
Bibliotheksklasse ändern musstest.



Ideen:
Persistenz einbauen (Java-Serialisierung).
JavaFX für GUI
Mehrere Stadien auf Git hochladen



