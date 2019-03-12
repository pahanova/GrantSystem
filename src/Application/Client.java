package Application;

import java.io.Serializable;

// Класс клиента
public class Client extends User implements Serializable
{
    // Конструктор по умолчанию
    Client()
    {
        super();
    }

    // Конструктор с параметрами
    Client(String name, String login, String password)
    {
        super(name, login, password);
    }
}

