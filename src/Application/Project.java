package Application;

public class Project
{
    // Поля класса
    private User author;
    private String name;
    private int sum;
    private int expertMark;

    // Конструктор с параметрами
    public Project(User author, String name, int sum, int expertMark)
    {
        this.author = author;
        this.name = name;
        this.sum = sum;
        this.expertMark = expertMark;
    }

    // Метод получения поля _name
    public String getName()
    {
        return name;
    }

    // Метод получния поля Author
    public User getAuthor() {
        return author;
    }

    // метод получения поля _sum
    public int getSum()
    {
        return sum;
    }

    // Метод получения поля _expertMark
    public int getExpertMark()
    {
        return expertMark;
    }

    // Метод получения поля _sum
    public void setSum(int sum)
    {
        this.sum = sum;
    }
}