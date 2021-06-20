package KelasB.Reviewku.Perpustakaan;

public class Book {

    private String title;
    private String category;
    private String description;
    private int id;

    static int generatorID = 1;

    public Book(String title, String category) {
        this.title = title;
        this.category = category;
        setId();
    }

    public Book(String title, String category, String description) {
        this.title = title;
        this.category = category;
        this.description = description;
        setId();
    }

    private void setId(){
        this.id = generatorID;
        generatorID++;
    }

    void setDescription(String description){
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getCateogry() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    void show(){
        System.out.println("Id: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Category: " + getCateogry());
        System.out.println("Description: " + getDescription());
        System.out.println();
    }
}
