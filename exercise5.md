# Exercise 5: Logging

## Warum werden Logging Bibliotheken verwendet?

Logging-Bibliotheken ermöglichen eine strukturierte und zentrale Protokollierung von Informationen über den Zustand und das Verhalten einer Anwendung. Sie helfen bei:

- der Fehlersuche (Debugging)
- der Überwachung (Monitoring)
- der Analyse von Benutzerverhalten
- der Rückverfolgbarkeit von Abläufen (Audit Trail)

Ohne Logging würde man nur schwer erkennen, was innerhalb einer Software schiefläuft.

---

## Welche Loglevel gibt es in Log4j und was hat es damit auf sich?

Log4j bietet folgende Loglevels (von schwerwiegend zu weniger schwerwiegend):

- **FATAL** – Kritischer Fehler, Anwendung wird beendet
- **ERROR** – Laufzeitfehler, die behandelt werden sollten
- **WARN** – Warnungen, die nicht unbedingt kritisch sind
- **INFO** – Allgemeine Informationen über den Ablauf
- **DEBUG** – Detaillierte Debug-Informationen (z. B. Methodenaufrufe)
- **TRACE** – Noch detailliertere Traces (meist für tiefste Analyse)

Man kann den gewünschten Loglevel im Konfigurationsfile festlegen (z. B. `level="debug"`).

---

## Was für Konfigurationsmöglichkeiten bietet log4j?

Log4j bietet flexible Konfigurationen:

- Konfiguration über **XML**, **JSON**, **YAML** oder **Properties-Dateien**
- Mehrere **Appender** gleichzeitig (z. B. Konsole & Datei)
- Verschiedene **Layout-Formate** (Pattern, JSON, HTML, etc.)
- Filter für Loglevels, Klassen, Marker uvm.
- Rolling File Logs (z. B. täglicher Wechsel)

---

## Verlinkung in README.md

