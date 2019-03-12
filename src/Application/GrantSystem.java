package Application;

import java.util.ArrayList;
import java.util.List;

// Класс грантовой системы
public class GrantSystem
{
    // Поля класса
    public List<User> _users;
    public User _currentUser;
    public List<Project> _projects;
    private int _minSum;
    private int _grantFond;

    // Конструктор с параметрами
    public GrantSystem()
    {
        _users = new ArrayList<>();
        _currentUser = null;
        _projects = new ArrayList<>();
        _minSum = 0;
        _grantFond = 0;
    }

    public GrantSystem(int minSum, int grantFond,User user)
    {
        this._minSum = minSum;
        this._grantFond = grantFond;
        _users = new ArrayList<>();
        _users.add(user);
        _currentUser = user;
        _projects = new ArrayList<>();
    }

    // Метод добавления пользователя
    public void addUser(Client client)
    {
        _users.add(client);
    }
    // Метод добавления пользователя-администратора
    public void addUser(Admin admin) { _users.add(admin); }

    // Метод добавления проекта
    public void addProject(User author, String name, int sum, int expertMark)
    {
        _projects.add(new Project(author, name, sum, expertMark));
    }

    // Метод поиска пользователя
    public User findUser(String login, String password)
    {
        String currentLogin, currentPassword;
        for (int index = 0; index < _users.size(); index++)
        {
            currentLogin = _users.get(index).get_login();
            currentPassword = _users.get(index).get_password();
            if ((currentLogin.equals(login)) && (currentPassword.equals(password)))
            {
                return _users.get(index);
            }
        }
        return null;
    }

    // Метод для проверки списка пользователей на пустоту
    public boolean noUsers()
    {
        if (_users.isEmpty()) return true;
        else return false;
    }


    // Метод генерации результаов
    public List<Project> genereteResults()
    {
        int bestPrize = _grantFond /2;
        List<Project> winners = new ArrayList<>();
        Project topProject = maxMark();
        Project temp;
        int Fond = _grantFond /= 2;
        for (Project project: _projects)
        {
            temp = project;
            if (temp.getExpertMark() > 70)
            {
                if (temp.getName().equals(topProject.getName()))
                {
                    temp.setSum(bestPrize);
                    winners.add(temp);
                }
                else
                    if (Fond >= _minSum)
                    {
                        temp.setSum(_minSum);
                        winners.add(temp);
                        Fond -= _minSum;
                    }
            }
        }
        return winners;
    }

    // Метод вычисления максимальной экспертной оценки
    private Project maxMark()
    {
        int max = 0, mark;
        Project topProject = null;
        for (Project project: _projects)
        {
            mark = project.getExpertMark();
            if (mark > max)
            {
                max = mark;
                topProject = project;
            }
        }
        return topProject;
    }

    // Метод получения поля currentUser
    public User get_currentUser()
    {
        return _currentUser;
    }

    // Метод получения поля grantFond
    public int get_grantFond()
    {
        return _grantFond;
    }

    // Метод получения поля _users
    public List<User> get_users() {
        return _users;
    }

    // Метод получения поля _projects
    public List<Project> get_projects() {
        return _projects;
    }

    // Метод установки поля _currentUser
    public void set_currentUser(User _currentUser)
    {
        this._currentUser = _currentUser;
    }

    // Метод установки поля _minSum
    public void set_minSum(int _minSum) {
        this._minSum = _minSum;
    }

    // Метод установки поля _grantFond
    public void set_grantFond(int _grantFond) {
        this._grantFond = _grantFond;
    }
}