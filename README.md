🛠️ Preparando tu entorno para correr las pruebas Todoist 🧪
✅ ¿Qué necesitas tener en tu laptop?
1. 📥 Instala Git
Descárgalo desde:
👉 https://git-scm.com/downloads/win
2. 💻 Instala Eclipse IDE
Ve a:
👉 https://www.eclipse.org/downloads/
Selecciona Eclipse IDE for Java Developers - versión 2025-03
3. ☕ Instala JDK 21
Descárgalo desde:
👉 https://www.oracle.com/mx/java/technologies/downloads/#java21
Este JDK es ideal para evitar dolores de cabeza 😅
🧭 Configura la variable de entorno JAVA_HOME:

    En Windows, busca "Variables de entorno"
    Abre el panel de control llamado Editar variables de entorno del sistema
    Haz clic en Variables de entorno...
    En Variables del sistema, haz clic en Nueva...
        Nombre: JAVA_HOME
        Valor: C:\Program Files\Java\jdk-21 (ajusta si lo instalaste en otro lado)
    Busca la variable llamada Path, edítala y agrega una nueva entrada:
        %JAVA_HOME%\bin
    Acepta todo y reinicia tu computadora

4. 🚀 Verifica que todo esté bien

Abre el CMD y escribe:

java -version

Si ves algo como java version "21", ¡vamos al 60% completado! 🎉
📦 Clona y abre el proyecto en Eclipse
    Si no lo tienes aún, abre Git Bash y clona el proyecto:
      git clone https://github.com/BaronMasiosare/todoisttest.git

  En Eclipse, ve a:
    File > Open Projects from File System
    y abre la carpeta del proyecto que acabas de clonar.

  Haz clic derecho en el proyecto (todoist-automation) > Maven > Update Project...
    Selecciona el proyecto y haz clic en OK

🧪 Instala TestNG en Eclipse
Opción A: Desde el Eclipse Marketplace (fácil)

  Ve a Help > Eclipse Marketplace
    Busca TestNG
    Haz clic en Install

Opción B: Manualmente (si la opción anterior falla)

  Ve a Help > Install New Software...
  En el campo Work with: pega esta URL:
    👉 https://testng.org/testng-eclipse-update-site
  Espera que cargue y marca la casilla ✅ TestNG
    Haz clic en:
    Next > Next > Accept License > Finish
    Reinicia Eclipse cuando se te indique.

🎯 ¿Para qué sirve TestNG?

    📌 Organizar pruebas de forma modular

    🧪 Ejecutar casos con grupos, prioridades y dependencias

    🧼 Preparar y limpiar datos con anotaciones (@BeforeClass, @AfterMethod, etc.)

    📝 Generar reportes en HTML/XML automáticamente

    🔁 Ejecutar pruebas en paralelo

    🧩 Integrarse con Maven, Jenkins, Selenium y más

¿Listo para probar Todoist como un pro? 😎
▶️ Cómo ejecutar un caso de prueba con TestNG

  Asegúrate de que el proyecto ya esté abierto en Eclipse
  Abre la carpeta del proyecto en el panel izquierdo
    Navega a:
    src > test > java > <paquete_del_test>
    Da doble clic sobre el archivo del test que quieres ejecutar (por ejemplo: LoginTest.java)
    Haz clic derecho en el archivo abierto o directamente desde el explorador del proyecto
    Selecciona:
    👉 Run As > TestNG Test

¡Y listo! 🎉
Verás los resultados en la pestaña de Console y también en el panel de Results of running suite de TestNG.
Si algo no funciona, respira, vuelve a leer con calma y ¡dale otra oportunidad!


