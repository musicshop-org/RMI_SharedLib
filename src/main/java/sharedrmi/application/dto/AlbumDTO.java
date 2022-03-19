package sharedrmi.application.dto;

public class AlbumDTO {

    private final String title;
    private final String label;

    public AlbumDTO(String title, String label) {
        this.title = title;
        this.label = label;
    }

    public String getTitle() {
        return title;
    }

    public String getLabel() {
        return label;
    }

}
