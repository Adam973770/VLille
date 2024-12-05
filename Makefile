SRC_DIR = src
CLASS_DIR = class

# Trouver tous les fichiers source .java
SOURCES = $(shell find $(SRC_DIR) -name "*.java")

# Commande pour le compilateur Java
JAVAC = javac

# Options pour le compilateur
JAVAC_FLAGS = -d $(CLASS_DIR)

# Nom du package principal et classe principale
MAIN_CLASS = VLille.Main

# Cible par défaut : compiler le projet si nécessaire
all: $(CLASS_DIR)
	$(JAVAC) $(JAVAC_FLAGS) $(SOURCES)

# Créer le répertoire class s'il n'existe pas
$(CLASS_DIR):
	mkdir -p $(CLASS_DIR)

# Nettoyer les fichiers compilés
clean:
	rm -rf $(CLASS_DIR)

# Exécuter le programme (sans recompiler systématiquement)
run:
	java -cp $(CLASS_DIR) $(MAIN_CLASS)
