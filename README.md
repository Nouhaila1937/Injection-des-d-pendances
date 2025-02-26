Injection des Dépendances en Java

Ce projet illustre les différentes techniques d'injection des dépendances en Java, incluant l'instanciation statique, dynamique et l'utilisation du framework Spring.

Installation et Lancement du Projet

Prérequis :

Java JDK 8 ou supérieur

Maven installé

Un IDE comme IntelliJ IDEA ou Eclipse

Étapes d'Installation :

Cloner le dépôt :

git clone <URL_DU_REPO>

Accéder au dossier du projet :

cd injection_de_dependance

Compiler le projet avec Maven :

mvn clean install

Exécuter le projet via l'IDE ou en ligne de commande.

📂 Structure du Projet

Injection-Dependances-Java
├── .idea                     # Fichiers de configuration IntelliJ
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── dao           # Interface et implémentation de la couche DAO
│   │   │   ├── ext           # Implémentation spécifique de DAO
│   │   │   ├── metier        # Interface et implémentation de la couche métier
│   │   │   ├── pres          # Classes de présentation et exécution
│   │   └── resources         # Fichiers de configuration Spring (XML)
│   └── test
│       ├── java              # Tests unitaires
├── target                    # Dossier de compilation
├── pom.xml                   # Fichier de configuration Maven
├── README.md                 # Documentation du projet

Approches d'Injection des Dépendances

1️⃣ Instanciation Statique

L'instanciation des objets est directement gérée dans le code source, ce qui crée un couplage fort.

2️⃣ Instanciation Dynamique

Utilisation de Class.forName() pour créer les objets dynamiquement, rendant le code plus flexible.

3️⃣ Utilisation de Spring

Spring permet une gestion optimisée des dépendances via :

Configuration XML : Définition des beans dans un fichier de configuration beans.xml

Annotations : Utilisation de @Component, @Autowired, etc.

🚀 Commandes Git Utiles
``` bash
git add .
git commit -m "Ajout d'une nouvelle fonctionnalité"
git push origin main
git pull origin main
git status
git log --oneline
```
🔧 Exécution du Projet

Instanciation Statique : presentationv1.java

Instanciation Dynamique : presentationv2.java 

Spring (Configuration XML) : presentation_spring_xml.java

Spring (Annotations) : presentationAnnotation

📌 Liens Utiles

```bash installer les dépendances dans le fichier pom.xml
https://mvnrepository.com/artifact/org.springframework/spring-core
```


