# Exercice 1

- La taille par défaut d'une clé RSA générée par `openssl` est 2048 bits. 
- Pour gérérer une clé 4096 bits, il suffit de le spécifier à la fin de la commande `openssl genrsa -out server.key <taille de la clé>`
- `openssl rsa -in server.key -pubout > server.pub` nous génère la clé publique `server.pub` à partir de la clé privée `server.key`