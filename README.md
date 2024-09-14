# Exam1Back

## Requisitos Previos

- XAMPP instalado en tu sistema
- JDK 15 instalado
- NetBeans 19 instalado

## Pasos

1. **Instalar XAMPP**

   - Descarga XAMPP desde el sitio web oficial: https://www.apachefriends.org/
   - Instala XAMPP siguiendo el asistente de instalación

2. **Configurar NetBeans 19 con JDK 15**

   - Abre NetBeans 19
   - Ve a Tools > Java Platforms
   - Asegúrate de que JDK 15 esté configurado correctamente

3. **Configurar Tomcat en XAMPP**

   - Abre el Panel de Control de XAMPP
   - Haz clic en el botón "Config" junto a Apache
   - Selecciona "user.xml" y añade la siguiente línea al final:
     `    <role rolename="maneger-gui"/>
   <user password="password" roles="maneger-gui, manager-script,admin" username="User"/>
   <user password="password" roles="manager-script,admin" username="User"/>`
   - Guarda y cierra el archivo

4. **Preparar tu Proyecto Java Web**

   - Configura el servidor de apache Tomcat en neatbeans
   - Introduce tu contraseña y usuario

5. **Iniciar Tomcat**

   - En el Panel de Control de XAMPP, inicia los servicios de Apache y Tomcat

6. **Acceder a tu Aplicación**
   - Abre un navegador web
   - Navega a `http://localhost:8080/`

## Solución de Problemas

- Si Tomcat no arranca, revisa los logs de XAMPP para ver mensajes de error
- Asegúrate de que los puertos utilizados por Tomcat (normalmente 8080) no estén siendo usados por otras aplicaciones
- Verifica que tu aplicación Java Web sea compatible con la versión de Tomcat incluida en XAMPP
