package Application;

import java.io.Serializable;

// Класс администратора
public class Admin extends User implements Serializable
{
    // Конструктор по умолчанию
    public Admin()
    {
        super();
    }

    // Конструктор с параметрами
    public Admin(String name, String login, String password)
    {
        super(name, login, password);
    }
}