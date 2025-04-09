# Git Commands and Their Functions

Git is a version control system used for tracking changes in source code. Below is a list of essential Git commands along with their functions.

## Table of Common Git Commands

| Command            | Description |
|--------------------|- -----------|
| `git init`        | Initializes a new Git repository. |
| `git clone <repo>`| Clones an existing repository from a remote source. |
| `git status`      | Shows the current status of the working directory. |
| `git add <file>`  | Stages a file to be committed. |
| `git commit -m "message"` | Commits staged changes with a descriptive message. |
| `git push origin <branch>` | Pushes local commits to a remote repository. |
| `git pull origin <branch>` | Fetches and merges changes from a remote repository. |
| `git branch`      | Lists all branches in the repository. |
| `git checkout <branch>` | Switches to another branch. |
| `git merge <branch>` | Merges another branch into the current branch. |
| `git log`        | Displays the commit history. |
| `git revert <commit>` | Reverts a commit without deleting history. |
| `git reset --hard <commit>` | Resets the repository to a previous commit (destructive). |

## Detailed Explanation of Key Commands

- **`git init`**  
  - Used to create a new local Git repository.
  - Example:
    ```bash
    git init
    ```
  - This will initialize an empty repository in the current directory.

- **`git add <file>`**  
  - Adds changes to the staging area.
  - Example:
    ```bash
    git add README.md
    ```
  - To add all files:
    ```bash
    git add .
    ```

- **`git commit -m "message"`**  
  - Saves changes in the repository with a descriptive message.
  - Example:
    ```bash
    git commit -m "Added README file"
    ```

- **`git push origin <branch>`**  
  - Sends committed changes to a remote repository.
  - Example:
    ```bash
    git push origin main
    ```

- **`git pull origin <branch>`**  
  - Fetches the latest changes from the remote repository and merges them into the current branch.
  - Example:
    ```bash
    git pull origin main
    ```

##  Note
- Always use meaningful commit messages.
- Use `git status` frequently to check for changes.
- To discard unstaged changes, use:
  ```bash
  git checkout -- <file>
