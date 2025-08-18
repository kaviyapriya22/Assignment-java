package org.ford.Assignment7;

import java.io.IOException;

public class FileUploader {

    public void uploadFile(String filename, double filesizeMB) throws FileTooLargeException {

        if (filesizeMB > 25.0){
            throw new FileTooLargeException("File size is greater than 25 MB");
        }

    }
}
