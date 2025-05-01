
# 🛠️ Preparando tu entorno para correr las pruebas Todoist 🧪

## ✅ ¿Qué necesitas tener en tu laptop?

### 1. 📥 Instala Git  
👉 [https://git-scm.com/downloads/win](https://git-scm.com/downloads/win)

### 2. 💻 Instala Eclipse IDE  
👉 [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/)  
Selecciona **Eclipse IDE for Java Developers - versión 2025-03**

### 3. ☕ Instala JDK 21  
👉 [https://www.oracle.com/mx/java/technologies/downloads/#java21](https://www.oracle.com/mx/java/technologies/downloads/#java21)

#### 🔧 Configura JAVA_HOME:

1. En Windows, busca: **"Variables de entorno"**
2. Abre: **Editar variables de entorno del sistema**
3. Haz clic en: **Variables de entorno...**
4. En "Variables del sistema" > clic en **Nueva...**
   - **Nombre:** `JAVA_HOME`  
   - **Valor:** `C:\Program Files\Java\jdk-21` (ajusta si lo instalaste en otro lugar)
5. Edita la variable `Path` y agrega:  
   - `%JAVA_HOME%\bin`
6. Acepta todo y **reinicia tu computadora**

### 4. ✅ Verifica instalación de Java

Abre **CMD** y escribe:

```bash
java -version
```

Si ves `java version "21"`, ¡vas por buen camino! 💪

---

## 📦 Clona y abre el proyecto en Eclipse

1. Clona el repositorio:

```bash
git clone https://github.com/BaronMasiosare/todoisttest.git
```

2. En Eclipse:  
   `File > Open Projects from File System`  
   → Selecciona la carpeta del proyecto clonado.

3. Haz clic derecho en el proyecto `todoist-automation`  
   → `Maven > Update Project...`  
   → Marca el proyecto y presiona **OK**

---

## 🧪 Instala TestNG en Eclipse

### 🔸 Opción A: Desde Eclipse Marketplace

1. Ve a: `Help > Eclipse Marketplace`
2. Busca: **TestNG**
3. Haz clic en **Install**

### 🔸 Opción B: Manualmente (si falla Marketplace)

1. `Help > Install New Software...`
2. En **Work with:** pega:  
   👉 `https://testng.org/testng-eclipse-update-site`
3. Espera que cargue, marca ✅ **TestNG**
4. Luego:  
   `Next > Next > Accept License > Finish`
5. Reinicia Eclipse cuando se te indique

---

## 🧪 ¿Para qué sirve TestNG?

- 📌 Organizar y correr pruebas fácilmente
- 🧪 Ejecutar pruebas con prioridades y dependencias
- 🧼 Limpiar/Preparar datos con `@Before` y `@After`
- 📝 Generar reportes HTML/XML
- 🔁 Ejecutar en paralelo
- 🧩 Integración con Maven, Jenkins, Selenium...

---

## ▶️ Cómo ejecutar un caso de prueba con TestNG

1. Asegúrate de que el proyecto ya esté abierto en Eclipse
2. Abre la carpeta del proyecto en el panel izquierdo
3. Navega a:  
   `src > test > java > <paquete_del_test>`
4. Da doble clic sobre el archivo del test que quieres ejecutar (por ejemplo: `LoginTest.java`)
5. Haz clic derecho en el archivo abierto o directamente desde el explorador del proyecto
6. Selecciona:  
   👉 `Run As > TestNG Test`
7. Observa los resultados en la pestaña **Console** y en **Results of running suite**

---

¿Listo para probar Todoist como un pro? 😎  
Si algo no funciona, respira, vuelve a leer con calma y ¡dale otra oportunidad!
