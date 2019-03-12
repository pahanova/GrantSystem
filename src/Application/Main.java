package Application;

import java.util.List;
import java.util.Scanner;

// Главный класс программы
public class Main
{
    // Метод инициализации системы
    public static GrantSystem initializeGrantSystem(GrantSystem grantSystem)
    {
        int minSum = 0, grantFond;
        String login, password, name;
        Scanner input = new Scanner(System.in);
        Admin admin;
        System.out.println("Перед началом работы с системой вы должны зарегистрировать учетную запись администратора.");
        System.out.println("Введите имя: ");
        name = input.nextLine();
        System.out.println("Введите логин: ");
        login = input.nextLine();
        System.out.println("Укажите пароль: ");
        password = input.nextLine();
        System.out.print("Укажите минимальный размер одного гранта: ");
        minSum = input.nextInt();
        grantFond = minSum*20;
        admin = new Admin(name, login, password);
        grantSystem = new GrantSystem(minSum, grantFond, admin);
        return grantSystem;
    }

    // Метод обработчик регистрации пользователя
    public static GrantSystem registrationHandler(GrantSystem grantSystem)
    {
        String login, password, name;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя: ");
        name = input.nextLine();
        System.out.println("Введите логин: ");
        login = input.nextLine();
        System.out.println("Укажите пароль: ");
        password = input.nextLine();
        Client client = new Client(name, login, password);
        grantSystem.addUser(client);
        return grantSystem;
    }

    // Метод регистрации проекта
    public static void projectRegistration(GrantSystem grantSystem)
    {
        int expertMark;
        String name;
        User author = grantSystem.get_currentUser();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя проекта: ");
        name = input.nextLine();
        System.out.println("Введите суммарную оценку экспртов(0-100): ");
        expertMark = input.nextInt();
        grantSystem.addProject(author, name, 0, expertMark);
    }

    // Метод обработцик регистрации результата
    public static void generateResultsHandler(GrantSystem grantSystem)
    {
        if (grantSystem.get_grantFond() == 0)
        {
            System.out.println("Фонд уже был распределен ранее");
        }
        else
        {
            int sum;
            String name;
            List<Project> winners = grantSystem.genereteResults();
            System.out.println("Список выйгравших грант проектов: ");
            for (Project project: winners)
            {
                sum = project.getSum();
                name = project.getName();
                System.out.println(name + " Сумма приза - " + sum);
            }
        }
    }

    // Метод обработчик авторизации в системе
    public static void authorizationHandler(GrantSystem grantSystem)
    {
        String login, password;
        Scanner input = new Scanner(System.in);
        User tempUser;
        System.out.println("Введите логин: ");
        login = input.nextLine();
        System.out.println("Укажите пароль: ");
        password = input.nextLine();
        tempUser = grantSystem.findUser(login, password);
        if (tempUser != null)
        {
            grantSystem.set_currentUser(tempUser);
        }
        else
        {
            System.out.println("Ошибка: неверный логин или пароль");
        }
        showInstructions(grantSystem);
    }

    // Метод выхода из учетной записи
    public static void logout(GrantSystem grantSystem)
    {
        grantSystem.set_currentUser(null);
        showInstructions(grantSystem);
    }

    // Метод вывода инструкций
    public static void showInstructions(GrantSystem grantSystem)
    {
        String type = "";
        User currentUser = grantSystem.get_currentUser();
        if (currentUser instanceof Admin)
        {
            type = "администратор";
        }
        else if (currentUser instanceof Client)
        {
            type = "клиент";
        }
        if (currentUser != null)
        {
            System.out.println("Текущий пользователь: " + currentUser.get_name()
                    + ". Роль: " + type);
        }
        else
        {
            System.out.println("Текущий пользователь: нет");
        }
        System.out.print("Меню программы: \n");
        System.out.print("1. Зарегистрировать нового пользователя\n");
        System.out.print("2. Войти в систему\n");
        System.out.print("3. Выйти из системы\n");
        System.out.print("4. Вывести инструкции ещё раз\n");
        if (currentUser != null)
            if (currentUser instanceof Admin)
                System.out.println("5. Вычислить размеры грантов");
            else
                System.out.println("5. Подать заявку на грант");
        System.out.print("0. Завершение программы");
    }

    // Метод обработчик операции, зависящий от прав учетной записи
    public static void operationPropertyHandler(GrantSystem grantSystem)
    {
        User currentUser = grantSystem.get_currentUser();
        if (currentUser != null)
        {
            if (currentUser instanceof Admin)
                generateResultsHandler(grantSystem);
            else
                projectRegistration(grantSystem);
        }
        else
        {
            System.out.println("Неверно введена команда!");
        }
    }

    // Главный метод
    public static void main (String[] args)
    {
        GrantSystem grantSystem = null;
        grantSystem = initializeGrantSystem(grantSystem);
        int command; // Переменная для комманды
        Scanner input = new Scanner(System.in); // Переменная объекта Scanner для удобного ввода с консоли
        showInstructions(grantSystem);// Вывод инструкций меню
        do
        {
            System.out.print("\nВведите команду: ");
            command = input.nextInt();
            switch (command)
            {
                case 1:
                    grantSystem = registrationHandler(grantSystem);
                    break;
                case 2:
                    authorizationHandler(grantSystem);
                    break;
                case 3:
                    logout(grantSystem);
                    break;
                case 4:
                    showInstructions(grantSystem);
                    break;
                case 5:
                    operationPropertyHandler(grantSystem);
                    break;
                case 0:
                    System.out.print("Программа завершена");
                    break;
                default:
                    System.out.print("Неверно введена команда!\n");
            }
        } while (command != 0);
    }
}