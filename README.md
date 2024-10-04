# cliente-soap

Contiene cliente SOAP, basado en jaxws y wsimport

## Uso

1. Generar WSDL local:
    - Agregar url de WSDL como proyecto a SOAP UI
    - Click derecho en la interfaz seleccionar "Export definitions"

2. Agregar archivo WSDL y XSD asociados a carpeta main/scr/resources
3. Agregar ruta de archivo a pom tag "wsdlFile"
4. Ejecutar mvn clean package para revision
5. Ejecutar mvn clean install para instalar maven