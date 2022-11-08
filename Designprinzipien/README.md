# Designprinzipien

Objektorientierte Designprinzipien sind Prinzipien, die zu gutem objektorientierten Design führen sollen. Viele Techniken, darunter auch Entwurfsmuster, basieren auf diesen Prinzipien des objektorientierten Designs. 

Dieses Dokument geht auf die "SOLID", "DRY", "YAGNI" und "KISS" Prinzipien näher ein und stellt diese vor. 

## SOLID

Der Begriff "SOLID" wurde von Robert C. Martin erfunden und beschreibt fünf Design-Prinzipien. Diese geben vor, wie Funktionen und Datenstrukturen in Klassen angeordnet sind und wie diese Klassen miteinander verbunden sein sollen.

* **S**... Single Responsibility-Prinzip. Dabei handelt es sich nicht nur um Module die nur eine einzige Aufgabe erfüllen sollten. Im Allgemeinen lautet die Beschreibung wie folgt: "Es sollte nie mehr als einen Grund geben, eine Klasse zu modifizieren". Da der Begriff Klassen zu spezifisch ist, wird von Robert C. Martin diese Beschreibung empfohlen: "Ein Modul sollte für einen, und nur einen, Akteur verantwortlich sein". Somit wäre es sinnvoll, Klassen und Methoden so zu gestalten, dass nur ein Akteur die Anforderungen und Anpassungen verantwortet.
* **O**... Open-Closed-Prinzip. Dieses Prinzip wurde von Bertrand Meyer formuliert: "Eine Softwareentität sollte offen für Erweiterung, aber geschlossen gegenüber Modifikation sein". Man sagt damit, dass an einer Änderung der Software keine größeren (massive) Eingriffe benötigt werden, ansonsten hat die Architektur versagt. Eine Lösung der damaligen Zeit (90er) war die Vererbung. Mittlerweile ist die Nutzung von Interfaces zeitgemäßer und angebrachter. Ziel und Sinn sollte es immer sein, Klassen einer höheren Hierarchie vor Modifikationen in Klassen niedrigerer Hierarchie zu schützen.
* **L**... Liskov'sches Substitutionsprinzip. Geprägt von Barbara Liskov, besagt dieses Prinzip, dass bei der Vererbung die Unterklasse jederzeit alle Eigenschaften der Oberklasse enthalten muss, so dass diese von der Oberklasse verwendet werden können. Die Unterklasse darf keine Änderungen der Funktionalitäten der Oberklassen enthalten. Die Oberklasse darf jedoch durch neue  Funktionalitäten erweitert werden. Somit werden Bedingungen bei der Mehrfachvererbung an Unterklassen durch die Oberklassen gestellt.
* **I**... Interface-Segregation-Prinzip. Dieses Prinzip zwingt den User nicht, Teile von Schnittstellen zu implementieren, die nicht benötigt werden. Das Ziel ist es, Schnittstellen nicht zu groß werden zu lassen, gleichzeitig soll die Schnittstelle nicht auf einen speziellen Nutzen schrumpfen. Die Lösung liegt in der Aufspaltung der Operationen in Schnittstellen. Die Schnittstelle befindet sich somit in einer neu erzeugten abstrakten Klasse oder Interfaces. Die dadurch erschaffene Minderung der Abhängigkeit soll dazu führen, dass Änderungen im Code nicht zu komplexen Änderungen oder Problemen im gesamten System führen. Der Mehraufwand durch eine weitere Schicht sorgt dafür, dass die Architektur mit Modifikation besser umgehen kann.
* **D**... Dependency-Inversion-Prinzip. Das DIP soll deutlich machen, dass Systeme am flexibelsten sind, in denen sich Quellcodeabhängigkeiten ausschließlich auf Abstraktionen beziehen, statt auf Konkretionen. In Java bedeutet es, dass Anweisungen bei der Nutzung von use, import und include nur auf Quellmodule bezogen werden sollten – etwa Schnittstellen, abstrakte Klassen oder Module, die jede andere Form der Abstraktion gewährleisten. Damit soll erzwungen werden, dass keine Abhängigkeiten zu konkreten Modulen entstehen.

## DRY

DRY steht für: **Don’t repeat yourself**. Das Prinzip besagt, Redundanz zu vermeiden. Es handelt sich hierbei auch um ein Prinzip von [Clean Code](https://de.wikipedia.org/wiki/Clean_Code). Der Vorteil für Systeme die DRY treu bleiben, brauchen Änderungen nur an einer Stelle vorzunehmen. Quellecode, Datenbank-Beschreibungen, Tests, Skripte und Dokumentationen sollten nach dem DRY Prinzip entwickelt werden.

## KISS

KISS steht für: **Keep it simple, stupid!**. Ähnlich wie beim DRY Prinzip, handelt es sich hierbei auch um ein Prinzip von [Clean Code](https://de.wikipedia.org/wiki/Clean_Code). KISS fordert, zu einem Problem eine möglichst einfache Lösung anzustreben. Spezifischer ausgedrückt, wenn es mehrere Erklärungen für einen bestimmten Sachverhalt gibt, dann ist diejenige Erklärung zu bevorzugen, die am einfachsten ist, also mit den wenigsten Annahmen und Variablen auskommt.

## YAGNI

YAGNI ist ein Akronym und steht für: **You Aren’t Gonna Need It**. Es besagt, dass in einem Programm dann Funktionalität implementiert werden sollte, wenn klar ist, dass diese Funktionalität tatsächlich gebraucht wird. In der Praxis ergeben sich häufig Anforderungen, die bei der ursprünglichen Entwicklung nicht vorhergesehen wurden und deren Umsetzung durch den Code, der eigentlich Änderungen erleichtern sollte, nicht unterstützt und oft sogar behindert wird.