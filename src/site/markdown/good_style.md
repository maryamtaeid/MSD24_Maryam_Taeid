# Gute Praktiken für Source Code Kommentare und Git Commit Messages

## ✅ Gute Source Code Kommentare

Gute Kommentare im Code helfen anderen Entwicklern (oder dem zukünftigen Ich) zu verstehen, **warum** etwas getan wurde – nicht nur **was** passiert.

### 🔹 Tipps für gute Kommentare:

- Beschreiben Sie den **Zweck** und die **Motivation**, nicht offensichtlichen Code.
- Schreiben Sie **vollständige Sätze** – kein Kauderwelsch.
- Kommentieren Sie **komplexe Logik**, nicht triviale Operationen.
- Halten Sie Kommentare **aktuell** – veraltete Kommentare führen zu Missverständnissen.
- Vermeiden Sie redundante Kommentare wie:

  ```java
  // Variable x wird auf 0 gesetzt
  int x = 0; // ❌ unnötig
  ```

### ✅ Beispiel:

```java
// Wenn der Benutzer nicht eingeloggt ist, Weiterleitung zur Login-Seite
if (!user.isLoggedIn()) {
    redirectTo("/login");
}
```

---

## ✅ Gute Git Commit Messages

Gute Commit-Nachrichten sind entscheidend für die **Lesbarkeit der Projekt-Historie** und helfen bei der Zusammenarbeit im Team.

### 🔹 Struktur einer Commit Message:

1. **Erste Zeile:**  
   - Max. 50 Zeichen  
   - **Imperativform**, z. B. „Fix“, „Add“, „Refactor“  
   - Beispiele:  
     - `Add user login validation`
     - `Fix bug in payment logic`

2. **Leerzeile**

3. **Detailbeschreibung (optional):**  
   - Warum wurde dieser Commit gemacht?  
   - Was wurde verändert?

### ✅ Beispiel einer guten Commit-Nachricht:

```
Add validation for empty input fields

Prevents the form from being submitted without
filling all required inputs. Related to issue #42.
```

---

## 🧠 Zusammenfassung

- Kommentieren Sie mit Sinn, nicht automatisch.
- Schreiben Sie sinnvolle Commit Messages – die Historie wird es Ihnen danken!
