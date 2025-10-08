
# 🛠️ Preparando tu entorno para correr las pruebas Todoist 🧪

A continuacion tendras explicacion de ejecutar pruebas automatizadas usando Eclipse IDE y como hacer pruebas de API de la misma web. 

Tendremos unos documentos con Casos de Prueba, Levantamiento de defectos y un plan de pruebas.

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

 ----------------------------------------------------------

# 🚀 Configuración y uso de tu colección Postman para la API

## 📥 Importa tu colección en Postman

1. **Descarga Postman** (si aún no lo tienes):
   👉 [https://www.postman.com/downloads/](https://www.postman.com/downloads/)

2. **Abre Postman** y haz clic en **"Import"** dentro de Collections (botón en la esquina superior izquierda)

3. **Selecciona tu archivo** de colección:
   - Puede ser un archivo JSON que te hayan compartido

4. **¡Listo!** Tu colección aparecerá en el panel izquierdo bajo **"Collections"**

---

## ⚙️ Configura variables de entorno (si las necesitas)
### 🔧 Si tu API requiere autenticación o URLs base:

1. **Abre Postman** y haz clic en **"Enviroments"** que esta abajo de Collections y haz clic en **"Import"** (botón en la esquina superior izquierda)

2. Selecciona **"Add Environment"**

3. **Listo** el ambiente listo para usarse

### 🔧 Para generar el Bearer Token:

1. Ve a la Web de Todoist y genera tu usuario.

2. Una ves generado y dentro de la app, da click en Settings (dando clicl en el usuario, del lado superior izquierdo)

3. Ve a **Integrations** y da click en **Developer**, ahi veras el API Token.

4. Regresa a Postman y da click en la coleccion, selecciona **Auth** 

5. En el dropdow Auth Type selecciona **Bearer Token** y en el campo de Token pega el API token y **Listo**.
---

## 🧪 Ejecuta tus requests de la colección

### 🔸 Ejecutar un request individual:
1. Haz clic en tu colección para expandirla
2. Selecciona el request que quieres probar
3. Revisa que los parámetros estén correctos
4. Haz clic en **"Send"**
5. ¡Observa la respuesta en la parte inferior!

### 🔸 Ejecutar toda la colección (Runner):
1. Haz clic en **"Runner"** (ícono de correr en la esquina inferior izquierda)
2. Arrastra tu colección al espacio de trabajo
3. Configura:
   - **Environment**: Selecciona tu entorno configurado
   - **Iterations**: Cuántas veces ejecutar cada request
4. Haz clic en **"Run [Nombre de tu colección]"**

---

## 📊 Analiza los resultados

### ✅ En la ejecución individual:
- **Status Code**: 200 = ✅ éxito, 4xx/5xx = ❌ error
- **Response Body**: Los datos que te devuelve la API
- **Time**: Cuánto tardó en responder

### 📈 En el Runner:
- **Verde** = Pasó
- **Rojo** = Falló
- **Tiempos** de ejecución de cada request

---

## 💡 Tips pro para trabajar con APIs

### 🛠️ Si algo falla:
1. **Revisa la autenticación** (Headers > Authorization)
2. **Verifica la URL** completa
3. **Confirma el body** (si es POST/PUT)
4. **Revisa los parámetros** en Params/Query Params

---

¿Listo para dominar esa API como un ninja? 🥷  
Si algún request no funciona, ¡respira hondo y revisa paso a paso! La magia está en los detalles ✨