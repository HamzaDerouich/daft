🏡 Daft Importer
A Spring Boot app to fetch and expose Daft.ie real estate listings via REST 🚀

✨ Features
🔌 Connects to the Daft SOAP API using JAX-WS

📦 Automatic import of properties by type (sale, rent, commercial…)

🔍 REST API to query properties by ID, type or price range

🧭 OpenAPI documentation included (Swagger UI)

🧭 Project Structure
📁 src/main/java/com/fourpm/daft_importer/ – Main source code
🧾 src/main/resources/wsdl.xml – Daft SOAP WSDL definition
🔧 src/main/resources/binding.xjb – JAXB binding config
🧪 src/test/java/ – Unit tests
📦 pom.xml – Maven config & WSDL code generation setup

🌐 REST API Endpoints
Method	Endpoint	Description
GET	/api/daft/properties?apiKey=...	List all properties
GET	/api/daft/properties/{id}?apiKey=...	Get property by ID
GET	/api/daft/properties/type?type=TYPE&apiKey=...	Filter by type
GET	/api/daft/properties/price-range?minPrice=MIN&maxPrice=MAX&apiKey=...	Filter by price range

🔐 All endpoints require a valid apiKey

🛠️ Requirements
☕ Java 17+

🐘 Maven 3.9+

🌐 Internet access (to fetch the WSDL)

🚀 How to Run
🧬 Clone the repo:

bash
Copiar
Editar
git clone https://github.com/your-username/daft_importer.git
cd daft_importer
🔧 Build the project and generate WSDL classes:

bash
Copiar
Editar
./mvnw clean install
▶️ Start the app:

bash
Copiar
Editar
./mvnw spring-boot:run
📖 View API docs at:
http://localhost:5050/swagger-ui.html

⚙️ Configuration
All key configs are in application.properties:

properties
Copiar
Editar
spring.application.name=daft_importer
server.port=5050
server.servlet.context-path=/
📌 Notes
🛡️ The Daft SOAP API requires a valid apiKey

🔁 WSDL is downloaded and compiled automatically during Maven build

👨‍💻 Author
FourPM
🔖 License: Apache 2.0
