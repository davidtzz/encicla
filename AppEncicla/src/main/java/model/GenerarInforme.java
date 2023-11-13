/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.*;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class GenerarInforme {

    public static void crearInforme(ArrayList<Bicicleta> bicicletasPrestadas) {
        try {
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("informe.pdf"));
            doc.open();

            // Crear una tabla con el mismo número de columnas que atributos en la clase Bicicleta
            PdfPTable tabla = new PdfPTable(Bicicleta.class.getDeclaredFields().length);

            // Añadir encabezados de columna a la tabla
            for (java.lang.reflect.Field field : Bicicleta.class.getDeclaredFields()) {
                tabla.addCell(field.getName());
            }

            // Añadir datos de bicicletas a la tabla
            for (Bicicleta bicicleta : bicicletasPrestadas) {
    tabla.addCell(bicicleta.getColor());
    tabla.addCell(String.valueOf(bicicleta.getNumero()));

    Persona persona = bicicleta.getPerson();
    
    if (persona != null) {
        tabla.addCell(persona.getNombre());
    } else {
        // Si la persona es null, agregar un valor predeterminado o dejar la celda vacía
        tabla.addCell("Sin persona asociada");
    }

    tabla.addCell(bicicleta.getEstacion());
}

            doc.add(tabla);
            doc.close();

            JOptionPane.showMessageDialog(null, "Informe creado exitosamente");

        } catch (DocumentException | java.io.FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al crear el informe");
        }
    }

    // Resto del código
}

