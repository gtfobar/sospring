package bar.gtfo.sospring.model;

public class Test {

    private int testId;
    private String title;
    private String description;

    public Test(int testId, String title, String description) {
        this.testId = testId;
        this.title = title;
        this.description = description;
    }

    public int getTestId() {
        return testId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Test{" +
                "testId=" + testId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
