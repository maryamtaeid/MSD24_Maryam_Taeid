# Übung 6 – Maven Site Dokumentation

## ✅ Was ist notwendig, um Maven Site Dokumentation zu generieren?

Um eine Maven Site zu erstellen, benötigt man:

- Eine gültige `pom.xml` mit Projektinformationen wie `groupId`, `artifactId`, `version` und `name`.
- Das Plugin `maven-site-plugin` im `<build>`-Abschnitt.
- Optional: `maven-surefire-report-plugin` im `<reporting>`-Abschnitt für JUnit-Testergebnisse.
- Optional: `jacoco-maven-plugin` zur Anzeige der Testabdeckung (Code Coverage).
- Eigene Markdown-Dateien im Verzeichnis `src/site/markdown/` für benutzerdefinierte Seiten.
- Den Befehl:

  ```bash
  mvn site
  ```

## ✅ Welche Aspekte, Konfigurationen, Informationen usw. werden in `site.xml` bzw. `pom.xml` konfiguriert?

| Datei        | Inhalt / Konfigurationen |
|--------------|---------------------------|
| `pom.xml`    | - Projektinformationen (Name, Version, Beschreibung)  
               - Abhängigkeiten (`dependencies`)  
               - Plugins wie `maven-site-plugin`, `jacoco`, `surefire`  
               - Reporting-Plugins für Testberichte und Coverage |
| `site.xml`   | - (Optional) Menüstruktur der Webseite  
               - Navigation  
               - Links zu eigenen Seiten oder Berichten |

**Hinweis:** In vielen Fällen reicht die Konfiguration über `pom.xml` aus, `site.xml` ist optional.

## ✅ Beispielhafte Plugin-Konfigurationen in `pom.xml`

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-site-plugin</artifactId>
      <version>4.0.0-M9</version>
    </plugin>
    <plugin>
      <groupId>org.jacoco</groupId>
      <artifactId>jacoco-maven-plugin</artifactId>
      <version>0.8.10</version>
    </plugin>
  </plugins>
</build>

<reporting>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-surefire-report-plugin</artifactId>
      <version>3.0.0-M5</version>
    </plugin>
  </plugins>
</reporting>
```

## ✅ Verlinkung in der `README.md`

In der Datei `README.md` sollte ein Link zur Markdown-Datei ergänzt werden:

```markdown
➡️ [Übung 6: Maven Site Dokumentation](src/site/markdown/exercise6.md)
```

## ✅ Fazit

Die Maven Site bietet eine strukturierte Möglichkeit, Projektdokumentation automatisch zu generieren. Sie kann Informationen aus `pom.xml`, Javadoc, Testberichten und Markdown-Seiten zusammenführen.
