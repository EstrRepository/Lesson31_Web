package by.itclass.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Параметр loadOnStartup позволяет указать приоритет для создания объекта сервлета
@WebServlet(name = "Servlet_exm2", urlPatterns = "/exm2", loadOnStartup = 3)
public class Servlet_exm2 extends HttpServlet {
    //Для сервлетов могут быть определены поля
    private String path;

    //Для сервлетов можно реализовывать конструкторы по умолчанию и др.
    //При создании объекта сервлета Servlet API всегда использует конструктор по умолчанию
    //Этапы жизненного цикла сервлета
    //1.Создаётся объект сервлета конструктором по умолчанию
    //2. Вызывается метод настройки начальной инициализации и настройки работы сервлена - init()
    //3. Обработка запросов клиента - метод service()
    //запрос-> servlet-> метод service()->do...()
    //4. Вызывается метод для освобождения занимаемых сервлетом ресурсов - destroy()
    public Servlet_exm2() {
        System.out.println("Servlet_exm2 constructor");
    }

    //Методы init() используются для начальной инициализации работы сервлетов
    //Этот метод вызывается первым после конструктора
    @Override
    public void init(ServletConfig config) throws ServletException {
        //Если было решено переопределять метод init() с параметром
        //то обязательно нужно вызвать его родительскую реализацию
        super.init(config);
    }

    //Метод init() чаще используется разработчиками для переопределения
    @Override
    public void init() throws ServletException {
        System.out.println("Servlet_exm2 init");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet_exm2 doGet");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet_exm2 destroy");
    }
}
