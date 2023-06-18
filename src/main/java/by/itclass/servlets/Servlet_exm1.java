package by.itclass.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "Servlet_exm1", urlPatterns = "/exm1")
public class Servlet_exm1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Обработка параметров формы
        //Все параметры получаемые из запроса всегда имеют тип строки
        String param1 = request.getParameter("param1");
        //Если есть несколько input с одинаковым именем, то метод getParameter() всегда будет
        //возвращать одно и тоже значение
        //Метод getParameterValues() возвращает значения всех input-ов по указанному имени
        String[] params2Values = request.getParameterValues("param2");

        //Метод getParameterMap() вернёт имена всех отправленных input-ов и их соответствующее значения
        //Метод возвращает отображения Мар, где key - имя input-ов, value - значения input-ов
        Map<String, String[]> paramsValue = request.getParameterMap();

        PrintWriter writer = response.getWriter();
        writer.append("<html><body>");
        writer.append("<table border=1>");
        writer.append("<tr>" +
                      "<th>Name</th>" +
                      "<th>Values</th>" +
                      "</tr>");

        for (Map.Entry<String, String[]> entry : paramsValue.entrySet()) {
            writer.append("<tr>");
            writer.append("<td>" + entry.getKey() + "</td>");
            writer.append("<td>" + Arrays.toString(entry.getValue()) + "</td>");
            writer.append("</tr>");
        }
        writer.append("</table></body></html>");

    }
}
