
# Spring Security Demo Application

Cette application est un exemple d'API web développée en Java avec Spring Boot et Spring Security. L'application gère des clients et applique une sécurité basée sur l'authentification en mémoire. Il y a trois routes principales : pour récupérer, ajouter et supprimer des clients. 

## Fonctionnalités

- **Route GET** `/client` : Accessible publiquement, permet d'obtenir la liste des clients.
- **Route POST** `/client** : Protégée, nécessite un rôle `ADMIN` ou `USER` pour ajouter un nouveau client.
- **Route DELETE** `/client` : Protégée, nécessite un rôle `ADMIN` pour supprimer un client.

## Structure du projet

- **ClientController.java** : Gère les routes pour manipuler les clients.
- **Client.java** : Modèle de client avec un nom, un prénom et un identifiant.
- **SecurityConfig.java** : Configuration de la sécurité Spring pour gérer l'authentification et l'autorisation.
- **DemoSecurityApplication.java** : Classe principale pour lancer l'application.
- **ServletInitializer.java** : Configure l'application pour un déploiement dans un conteneur de servlets.

## Prérequis

- **Java 17+**
- **Maven**
- **Spring Boot 3.0+**

## Installation

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/dupy007/spring-security-demo.git
   ```

2. Accédez au répertoire du projet :
   ```bash
   cd spring-security-demo
   ```

3. Installez les dépendances et compilez le projet :
   ```bash
   mvn clean install
   ```

## Exécution

Pour exécuter l'application localement :

```bash
mvn spring-boot:run
```

L'application sera accessible à l'adresse `http://localhost:8080`.

## Utilisateurs par défaut

- **Admin** : 
  - Username : `admin`
  - Password : `admin123`
  - Rôle : `ADMIN`
  
- **User** : 
  - Username : `user`
  - Password : `user123`
  - Rôle : `USER`

## Utilisation des API

### Récupérer la liste des clients (GET)

- **URL** : `/client`
- **Méthode** : GET
- **Accès** : Public

Exemple de réponse :

```json
[
  {
    "nom": "Doe",
    "prenom": "John",
    "id": 12345
  }
]
```

### Ajouter un client (POST)

- **URL** : `/client`
- **Méthode** : POST
- **Accès** : Protégé, nécessite un rôle `ADMIN` ou `USER`
- **Corps de la requête** :

```json
{
  "nom": "Doe",
  "prenom": "Jane"
}
```

### Supprimer un client (DELETE)

- **URL** : `/client`
- **Méthode** : DELETE
- **Accès** : Protégé, nécessite un rôle `ADMIN`
- **Corps de la requête** :

```json
{
  "id": 12345
}
```

## Tests

Vous pouvez utiliser un outil comme **Postman** pour tester les différentes routes et vérifier les autorisations.

## Licence

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus de détails.
