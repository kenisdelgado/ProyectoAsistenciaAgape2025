package com.esfe.Asistencia.Utilidades;

import java.io.ByteArrayOutputStream;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;

@Service
public class PdfGeneratorService {

    @Autowired
    private SpringTemplateEngine templateEngine;

    public byte[] generatePdfReport(String templateName, Map<String, Object> data) throws Exception {
        // 1. Preparar contexto Thymeleaf
        Context context = new Context();
        context.setVariables(data);

        // 2. Procesar plantilla HTML
        String htmlContent = templateEngine.process(templateName, context);

        // 3. Generar PDF con OpenHTMLtoPDF
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            PdfRendererBuilder builder = new PdfRendererBuilder();

            builder.useFastMode();
            builder.withHtmlContent(htmlContent, null); // segundo parámetro: base URL para recursos (puedes poner URL base si tienes CSS/imagenes)
            builder.toStream(outputStream);
            builder.run();

            return outputStream.toByteArray();
        }
    }
}
