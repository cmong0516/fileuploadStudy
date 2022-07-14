package com.example.demo.v1;

import lombok.Data;
import javax.persistence.Id;
import java.util.List;

@Data
public class Item {
    @Id
    private Long id;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;
}
