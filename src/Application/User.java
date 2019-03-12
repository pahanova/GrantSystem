package Application;

public class User
{
    // Поля класса
    private String _name;
    private String _login;
    private String _password;

    // Конструктор по умолчанию
    public User()
    {
        _name = "";
        _login = "";
        _password = "";
    }

    // Конструктор с параметрами
    public User(String name, String login, String password/*, boolean admin*/)
    {
        this._name = name;
        this._login = login;
        this._password = password;
    }

    // Метод установки поля _name
    public void set_name(String _name)
    {
        this._name = _name;
    }

    // Метод установки поля _login
    public void set_login(String _login)
    {
        this._login = _login;
    }

    // Метод установки поля _password
    public void set_password(String _password)
    {
        this._password = _password;
    }

    // Метод получения поля _name
    public String get_name()
    {
        return _name;
    }

    // Метод получения поля _login
    public String get_login()
    {
        return _login;
    }

    // Метод получения поля _password
    public String get_password()
    {
        return _password;
    }
}