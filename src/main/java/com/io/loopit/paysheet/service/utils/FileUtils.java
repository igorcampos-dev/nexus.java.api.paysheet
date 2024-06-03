package com.io.loopit.paysheet.service.utils;

import org.springframework.dao.InvalidDataAccessApiUsageException;
import java.util.Objects;

public class FileUtils {

    public static void validateContentTypeIsApplicationPdf(String contentType) {
        boolean isInvalidContentType = Objects.equals(contentType, "application/pdf");
        if (!isInvalidContentType) {
            throw new InvalidDataAccessApiUsageException("Tipo de arquivo inválido, use coloque apenas pdf");
        }
    }

}