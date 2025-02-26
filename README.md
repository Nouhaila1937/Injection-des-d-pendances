# Injection des Dépendances en Java

Ce projet illustre différentes techniques d'injection des dépendances en Java, y compris l'instanciation statique, dynamique et l'utilisation du framework Spring.

## Structure du Projet

- `src/main/java/dao/` : Interface et implémentation de la couche DAO.
- `src/main/java/ext/` : Implémentation spécifique de DAO.
- `src/main/java/metier/` : Interface et implémentation de la couche métier.
- `src/main/java/pres/` : Classes de présentation et exécution.
- `src/main/resources/` : Fichiers de configuration Spring (XML).
- `src/test/java/` : Tests unitaires.
- `pom.xml` : Fichier de configuration Maven.
- `README.md` : Documentation du projet.

## Réponses aux Questions

### 1. Pourquoi utiliser l'injection des dépendances ?

**Réponse :**  
L'injection des dépendances permet de réduire le couplage entre les classes, d'améliorer la testabilité du code et de favoriser la maintenabilité. Cela suit les principes SOLID, notamment l’inversion des dépendances.

### 2. Quelles sont les méthodes d’injection utilisées dans ce projet ?

**Réponse :**  
Ce projet utilise trois principales méthodes :  
- **Instanciation Statique** : Les objets sont créés manuellement dans le code.  
- **Instanciation Dynamique** : Utilisation de `Class.forName()` pour instancier des classes dynamiquement.  
- **Injection avec Spring** : Utilisation de fichiers XML (`beans.xml`) et d'annotations (`@Component`, `@Autowired`).

### 3. Comment exécuter chaque méthode d’injection ?

**Réponse :**  
- **Instanciation Statique** : Exécuter `Main.java`.  
- **Instanciation Dynamique** : Exécuter `MainDynamic.java`.  
- **Spring avec XML** : Exécuter `MainXml.java`.  
- **Spring avec Annotations** : Exécuter `MainAnno.java`.

## Commandes Git Utiles

```sh
git add .
git commit -m "Ajout d'une nouvelle fonctionnalité"
git push origin main
git pull origin main
git status
git log --oneline
