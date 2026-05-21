package model;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.List;

// Librerías de Java para construir y guardar documentos XML
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

// Clase encargada de la gestión del sistema y de los clientes, hereda de Usuario
public class Administrador extends Usuario {

    public Administrador(int idUsuario, String nombreCompleto, String email, String username, String password, String estado) {
        super(idUsuario, nombreCompleto, email, username, password, estado);
    }

    // Simula la apertura de la ventana de gestión de la base de datos
    public void gestionarUsuarios() {
        System.out.println("Gestionando usuarios...");
    }

    public void añadirUsuario() {
        System.out.println("Usuario añadido.");
    }

    public void editarUsuario() {
        System.out.println("Usuario editado.");
    }

    public void dardeBaja() {
        System.out.println("Usuario dado de baja.");
    }

    public void generarReporte() {
        System.out.println("Reporte generado.");
    }

    // Crea un fichero de texto simple con avisos de deudas financieras
    public void crearDeuda() {
        try {
            FileWriter archivo = new FileWriter("deudas.txt");
            archivo.write("tienes un pago pendiente");
            archivo.close();
            System.out.println("Archivo creado.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo de deudas.");
        }
    }

    // Exporta toda la colección de clientes en memoria hacia un fichero persistente en XML
    public void guardarClientesXML(List<Cliente> clientes, String rutaArchivo) {
        try {
            // Configura las factorías para construir la estructura XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            // Crea la etiqueta raíz <clientes>
            Element rootElement = doc.createElement("clientes");
            doc.appendChild(rootElement);

            // Mapea los objetos Java a elementos XML estructurados
            for (Cliente cliente : clientes) {
                Element clienteElement = doc.createElement("cliente");
                clienteElement.setAttribute("id", String.valueOf(cliente.getIdUsuario()));
                rootElement.appendChild(clienteElement);

                // Añade los subelementos correspondientes
                crearElementoHijo(doc, clienteElement, "nombre", cliente.getNombreCompleto());
                crearElementoHijo(doc, clienteElement, "email", cliente.getEmail());
                crearElementoHijo(doc, clienteElement, "username", cliente.getUsername());
                crearElementoHijo(doc, clienteElement, "estado", cliente.getEstado());
                crearElementoHijo(doc, clienteElement, "tipoSuscripcion", cliente.getTipoSuscripcion());

                String fechaPagoStr = (cliente.getFechaUltimoPago() != null) ? cliente.getFechaUltimoPago().toString() : "N/A";
                crearElementoHijo(doc, clienteElement, "fechaUltimoPago", fechaPagoStr);
            }

            // Transforma el árbol DOM en memoria en un archivo físico formateado
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(rutaArchivo));

            transformer.transform(source, result);
            System.out.println("Información de clientes exportada con éxito a: " + rutaArchivo);

        } catch (ParserConfigurationException e) {
            System.out.println("Error de configuración del analizador XML: " + e.getMessage());
        } catch (TransformerException e) {
            System.out.println("Error en la transformación y escritura del archivo XML: " + e.getMessage());
        }
    }

    // Método auxiliar para facilitar la adición de nodos de texto al XML
    private void crearElementoHijo(Document doc, Element padre, String etiqueta, String valor) {
        Element hijo = doc.createElement(etiqueta);
        hijo.appendChild(doc.createTextNode(valor != null ? valor : ""));
        padre.appendChild(hijo);
    }

    @Override
    public String getDetalles() {
        return "Administrador: " + nombreCompleto;
    }
}