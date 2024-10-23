public class Article {
    private String subjectOfArticle;
    private String contentOfArticle;
    private String dateOfArticle;

    public String getContentOfArticle() {
        return contentOfArticle;
    }

    public void setContentOfArticle(String contentOfArticle) {
        this.contentOfArticle = contentOfArticle;
    }

    public String getDateOfArticle() {
        return dateOfArticle;
    }

    public void setDateOfArticle(String dateOfArticle) {
        this.dateOfArticle = dateOfArticle;
    }

    public String getSubjectOfArticle() {
        return subjectOfArticle;
    }

    public void setSubjectOfArticle(String subjectOfArticle) {
        this.subjectOfArticle = subjectOfArticle;
    }

    @Override
    public String toString() {
        return "Article{" +
                "nameOfArticle='" + subjectOfArticle + '\'' +
                ", subjectOfArticle='" + contentOfArticle + '\'' +
                ", dateOfArticle='" + dateOfArticle + '\'' +
                '}';
    }
}
