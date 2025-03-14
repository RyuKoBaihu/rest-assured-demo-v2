package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductsContract {
    private String title = "Default Title";
    private String price = "10.0";
    private String description = "Default Description";
    private String image = "https://default-image.com";
    private String category = "Default Category";

    public void setTitle(String title) {
        this.title = title != null ? title : this.title;
    }
    public void setPrice(String price) {
        this.price = price != null ? price : this.price;
    }
    public void setDescription(String description) {
        this.description = description != null ? description : this.description;
    }
    public void setImage(String image) {
        this.image = image != null ? image : this.image;
    }
    public void setCategory(String category) {
        this.category = category != null ? category : this.category;
    }
}