# Exercice 1

- La taille par défaut d'une clé RSA générée par `openssl` est 2048 bits. 
- Pour gérérer une clé 4096 bits, il suffit de le spécifier à la fin de la commande `openssl genrsa -out server.key <taille de la clé>`
- `openssl rsa -in server.key -pubout > server.pub` nous génère la clé publique `server.pub` à partir de la clé privée `server.key`

# Exercice 2

- `openssl genrsa -des3 -out server_des3.key 4096` \
Cette commande nous demande d'entrer une "PEM key" pour finaliser la création de la clé
- `openssl rsa -in server_des3.key -pubout > server_des3.pub` \
La même "PEM key" est demandée afin de créer la clé publique à partir de la clé privée
- La PEM key utilisée dans cet exemple est "TEST"