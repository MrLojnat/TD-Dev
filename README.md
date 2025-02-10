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

# Exercice 3

- `openssl dgst -sha256 Document.java` → `72611bc402339a77c8ebc6401c82351d209be8290de576d7bac252754b09b807`
- `openssl dgst -md5 Document.java` → `a903435a53aa2e2a38e8523b74591583` (32 x 4 = 128 bits)
- `openssl dgst -sha-1 Document.java` → `70a7096214e7f33a0e943b0a8000ffe3b5f9996e` (40 x 4 = 160 bits)