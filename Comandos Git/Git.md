### -Comandos basicos de Git-
1. Para inicializar un repositorio en forma local.
```plaintext
git init
```
2. Inicializar el alias local agregando la direccion remota de GitHub.
```plaintext
git remote add origin (Url de tu repositorio remoto)
```
3. Preparar (agregar) todos los archivos de tu repositorio local a remotear a (subir a GitHub), solo prepara los archivos aún no los sube.
```plaintext
git add .
```
4.Estamos a punto de subir nuestro repositorio(archivos , proyecto) a GitHub pero vamos a marcarlos (commitear) para luego saber de que version de los archivos se trata, para ello usamos el siguiente comando.

```plaintext
git commit -m "Version 01"
```
4. finalmente vamos a subir (pushs) , nuestro repositorio a GitHub con el siguiente comando.

```plaintext
git push origin master
```

