package Lesson06.HEXArchitecture.src.Domain;

public class MovieReview {
    String movieName;
    double movieScore; // имя
    String remark; // коментарий

    /**
     * Конструктор
     * @param s
     * @param v
     * @param excellent
     */
    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }

    /**
     * переопределяем в String для печати
     * @return
     */
    @Override
    public String toString() {
        return  " " +movieScore +" "+ remark;
    }
}
